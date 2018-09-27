package co.edu.icesi.yeye.trainingexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaHoteles;

    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaHoteles = findViewById(R.id.list_Hoteles);
        adaptador = new Adaptador(this);
        listaHoteles.setAdapter(adaptador);

        Hotel h = new Hotel("Torre de Cali",350000,"", "Barrio abuela de chimbi");
        Hotel h2 = new Hotel("Spiwak",285000,"", "Chipichape");
        Hotel h3 = new Hotel("Plaza florencia", 500000, "", "Angel de la independencia");
        adaptador.addHotel(h);
        adaptador.addHotel(h2);
        adaptador.addHotel(h3);
    }
}
