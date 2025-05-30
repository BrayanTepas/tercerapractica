package ejercicio6palindroma;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada desde la consola.

        System.out.println("Por favor, ingresa una palabra para verificar si es palíndroma:"); // Pide al usuario que ingrese una palabra.
        String palabraOriginal = scanner.nextLine(); // Lee la palabra completa que el usuario ingresa.

        // --- Preparación de la palabra para la verificación ---
        // 1. Convertir a minúsculas: Ignora las diferencias entre mayúsculas y minúsculas (ej. "Radar" es palíndroma como "radar").
        // trim() elimina espacios al principio y al final de la cadena.
        String palabraLimpia = palabraOriginal.toLowerCase().trim(); 

        // --- Lógica para verificar si es palíndroma ---
        boolean esPalindroma = true; // Asume que es palíndroma al principio.

        // Si la palabra está vacía o tiene un solo carácter, se considera palíndroma.
        if (palabraLimpia.isEmpty() || palabraLimpia.length() == 1) {
            esPalindroma = true;
        } else {
            // Crea una versión invertida de la palabra limpia.
            // StringBuilder es eficiente para manipular cadenas.
            StringBuilder palabraInvertidaBuilder = new StringBuilder(palabraLimpia);
            palabraInvertidaBuilder.reverse(); // Invierte el contenido del StringBuilder.
            String palabraInvertida = palabraInvertidaBuilder.toString(); // Convierte el StringBuilder de nuevo a String.

            // Compara la palabra limpia original con su versión invertida.
            // '.equals()' compara el contenido de dos cadenas.
            if (!palabraLimpia.equals(palabraInvertida)) {
                esPalindroma = false; // Si no son iguales, no es palíndroma.
            }
        }

        // --- Mostrar el resultado ---
        if (esPalindroma) {
            System.out.println("'" + palabraOriginal + "' ES una palabra palíndroma.");
        } else {
            System.out.println("'" + palabraOriginal + "' NO es una palabra palíndroma.");
        }

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos del sistema.
    }
}
