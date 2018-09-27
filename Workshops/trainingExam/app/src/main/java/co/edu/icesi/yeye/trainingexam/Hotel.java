package co.edu.icesi.yeye.trainingexam;

public class Hotel {

    private String nombre;
    private double precio;
    private String imagen;
    private String ubicacion;

    public Hotel(String nombre, double precio, String imagen, String ubicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
