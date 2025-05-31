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
    @Override //equals() para comparar libros por ID
    public boolean equals(Object obj) {
        if (this == obj) return true; //this == obj verifica si son el mismo objeto this se refiere al objeto actual
        // y obj es el objeto a comparar a continuación
        // esto es importante para evitar comparaciones innecesarias primero verifica si es null y después si son el mismo objeto sino da false
        if (obj == null || getClass() != obj.getClass()) return false; // obj == null hace una verificación de si el objeto es nulo
        // getClass() != obj.getClass() verifica si son de la misma clase si lo son, continúa la comparación, si no, retorna false.
        // es por sino coincide los tipos de objetos, no tiene sentido compararlos. lo anterior.
        Libro libro = (Libro) obj; // esto hace un casting del objeto obj a tipo Libro es decir, convierte el objeto obj a un objeto Libro para poder acceder a sus atributos y métodos.
        return id != null ? id.equals(libro.id) : libro.id == null; // Compara IDs manda a llamar al metodo equals
    }
    @Override //hashCode() para generar un código hash basado en el ID
    public int hashCode() {
        return id != null ? id.hashCode() : 0; // Genera hashCode basado en el ID
    }
}
