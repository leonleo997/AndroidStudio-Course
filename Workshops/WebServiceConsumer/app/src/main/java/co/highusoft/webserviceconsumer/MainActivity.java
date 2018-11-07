package co.highusoft.webserviceconsumer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    public static final String USUARIOS_SERVICE = "https://diabetesicesi.firebaseio.com/publicaciones.json";

    private TextView tv_salida;

    private EditText et_comentario;
    private EditText et_titulo;


    private Button btn_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_salida = findViewById(R.id.tv_salida);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    String json = i2t.cideim.clase9.WEBUtilDomi.GETrequest(USUARIOS_SERVICE);
//
//                    Gson g = new Gson();
//                    Type type = new TypeToken<HashMap<String, Usuario>>() {
//                    }.getType();
//                    HashMap<String, Usuario> lista = g.fromJson(json, type);
//                    final Usuario user = lista.get("114381111");
//
//                    //Log.e(">>", "Recibido: " + user.getCorreo());
//
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                           // tv_salida.setText("Correo->" + user.getCorreo());
//                        }
//                    });
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();


        et_comentario = findViewById(R.id.et_comentario);
        et_titulo = findViewById(R.id.et_titulo);

        btn_agregar=findViewById(R.id.btn_agr);
        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 22;
                Comentario cm = new Comentario(id, et_comentario.getText() + "", et_titulo.getText() + "");


                Gson g = new Gson();
                final String json=g.toJson(cm);

                Log.e(">>>>",""+json);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            i2t.cideim.clase9.WEBUtilDomi.JsonByPOSTrequest(USUARIOS_SERVICE,json);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

    }
}
