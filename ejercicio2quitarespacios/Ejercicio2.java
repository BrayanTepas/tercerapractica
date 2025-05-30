import java.util.Scanner; 

public class Ejercicio2 { 
    public static void main(String[] args) { 

        // Crea una instancia de la clase Scanner para obtener la entrada del usuario.
        // 'System.in' se refiere a la entrada estándar, que usualmente es el teclado.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto:");
        String cadenaOriginal = scanner.nextLine();

        // 'cadenaOriginal.replaceAll("\\s", "")' usa una expresión regular para eliminar espacios.
        // - '\\s' es una expresión regular que coincide con cualquier carácter de espacio en blanco
        //   (espacios, tabulaciones, saltos de línea, etc.).
        // - El segundo argumento, "", indica que cada coincidencia de espacio en blanco
        //   debe ser reemplazada por una cadena vacía (es decir, eliminada).
        // El resultado es una nueva cadena sin ningún espacio, almacenada en 'cadenaSinEspacios'.
        String cadenaSinEspacios = cadenaOriginal.replaceAll("\\s", "");

        System.out.println("Cadena original: " + cadenaOriginal);

        // Imprime la cadena resultante después de eliminar todos los espacios en blanco.
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);
        scanner.close();
    }
}