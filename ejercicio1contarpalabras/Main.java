import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        // Crea un objeto Scanner para leer la entrada de datos desde la consola (teclado).
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un texto para contar las palabras:");
        String texto = scanner.nextLine();

        // Comprueba si el texto ingresado por el usuario está vacío.
        if (texto.isEmpty()) {
            // Si el texto está vacío, imprime un mensaje indicando que no se pueden contar palabras.
            System.out.println("El texto está vacío. No se pueden contar palabras.");
        } else {
            // Si el texto no está vacío, procede a contar las palabras.

            // 1. 'texto.trim()': Elimina los espacios en blanco al principio y al final del texto.
            // 2. '.split("\\s+")': Divide la cadena en un array de palabras.
            //    - "\\s+" es una expresión regular que significa "uno o más caracteres de espacio en blanco"
            //      (espacios, tabulaciones, saltos de línea, etc.).
            //    - Esto crea un array donde cada elemento es una palabra del texto.
            String[] palabras = texto.trim().split("\\s+");

            // El número de palabras es simplemente la cantidad de elementos en el array 'palabras'.
            int contador = palabras.length;

            // Imprime el número total de palabras encontradas en el texto.
            System.out.println("El número de palabras en el texto es: " + contador);
        }

        scanner.close();
    }
}