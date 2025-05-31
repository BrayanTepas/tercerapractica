package ejercicio2librolinkedhashset.src;

public class Libro {
    private String id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro() {
    }

    public Libro(String id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override //toString() para mostrar los detalles del libro
    public String toString() {
        return "Libro" +
                "id=" + id +
                ", titulo=" + titulo + 
                ", edicion=" + edicion + 
                ", autor=" + autor;
    }
    
}
