package co.edu.icesi.yeye.trainingexam;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter {

    private Activity actividad;
    private ArrayList<Hotel> hotels;

    public Adaptador(Activity actividad) {
        this.actividad = actividad;
        hotels= new ArrayList<Hotel>();
    }

    @Override
    public int getCount() {
        return hotels.size();
    }

    @Override
    public Object getItem(int position) {
        return hotels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = actividad.getLayoutInflater();
        View item = inflater.inflate(R.layout.item, null, false);

        TextView nombre= item.findViewById(R.id.nombre);
        TextView precio= item.findViewById(R.id.precio);
        TextView direccion= item.findViewById(R.id.direccion);

        nombre.setText(hotels.get(position).getNombre());
        precio.setText(hotels.get(position).getPrecio()+"");
        direccion.setText(hotels.get(position).getUbicacion()+"");


        return item;
    }

    public void addHotel(Hotel h){
        hotels.add(h);
        notifyDataSetChanged();
    }
}
