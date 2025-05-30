import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) { // Este es el método principal donde la ejecución del programa comienza.

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada desde la consola.

        System.out.println("Por favor, ingresa una frase para contar la vocal 'A':"); // Pide al usuario que ingrese una frase.
        String frase = scanner.nextLine(); // Lee la línea completa de texto ingresada por el usuario.

        int contadorA = 0; // Inicializa un contador para la vocal 'A' (y 'a').

        // Itera sobre cada carácter de la frase.
        // Convertimos la frase a un array de caracteres para facilitar la iteración.
        for (char caracter : frase.toCharArray()) {
            // Convierte el carácter actual a mayúscula para hacer la comparación insensible a mayúsculas/minúsculas.
            char caracterMayuscula = Character.toUpperCase(caracter);

            // Comprueba si el carácter (en mayúscula) es igual a 'A'.
            if (caracterMayuscula == 'A') {
                contadorA++; // Si es 'A', incrementa el contador.
            }
        }

        // Muestra el resultado final al usuario.
        System.out.println("La vocal 'A' aparece " + contadorA + " veces en la frase.");

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos del sistema.
    }
}
