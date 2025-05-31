package ejercicio2alumnoarraylist.src;

public class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;
    
    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Alumno:" + "codigo=" + codigo + ", nombre=" + nombre +
                ", carnet=" + carnet;
    }
    //se modifica el método toString para que imprima los datos del alumno de forma legible

}
