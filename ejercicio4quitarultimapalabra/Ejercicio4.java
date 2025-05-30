import java.util.Scanner; // Necesario para leer la entrada del usuario

public class Ejercicio4 { // Puedes renombrar esta clase a "EliminarUltimaPalabraSimple" si lo deseas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.

        System.out.println("Por favor, ingresa una frase:"); // Pide al usuario que escriba una frase.
        String fraseOriginal = scanner.nextLine(); // Lee la frase completa que el usuario ingresa.

        String fraseModificada; // Declara una variable para almacenar la frase resultante.

        // --- Lógica para eliminar la última palabra ---

        // 1. Elimina espacios extra al principio y al final para un procesamiento limpio.
        String trimmedFrase = fraseOriginal.trim();

        // 2. Verifica si la frase está vacía después de trim.
        if (trimmedFrase.isEmpty()) {
            fraseModificada = ""; // Si no hay texto, la frase modificada es vacía.
        } else {
            // Encuentra el índice del último espacio en la frase.
            // Si no hay espacios, lastIndexOf devolverá -1.
            int lastSpaceIndex = trimmedFrase.lastIndexOf(' ');

            // Si lastSpaceIndex es -1, significa que no hay espacios, por lo tanto, la frase tiene solo una palabra.
            // En este caso, la frase modificada debe ser vacía.
            if (lastSpaceIndex == -1) {
                fraseModificada = "";
            } else {
                // Si hay espacios, toma la subcadena desde el inicio hasta el último espacio.
                // Esto efectivamente elimina la última palabra.
                fraseModificada = trimmedFrase.substring(0, lastSpaceIndex);
            }
        }
        // --- Fin de la lógica ---

        System.out.println("Frase original: '" + fraseOriginal + "'"); // Muestra la frase tal como se ingresó.
        System.out.println("Frase modificada: '" + fraseModificada + "'"); // Muestra la frase sin la última palabra.

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos del sistema.
    }
}
