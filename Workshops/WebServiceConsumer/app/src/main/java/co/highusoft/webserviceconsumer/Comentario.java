package co.highusoft.webserviceconsumer;

public class Comentario {
    private int id;
    private String comentario;
    private String titulo;

    public Comentario(){

    }

    public Comentario(int id, String comentario, String titulo) {
        this.id = id;
        this.comentario = comentario;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
