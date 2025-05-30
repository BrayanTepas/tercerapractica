import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto:"); 
        String cadenaOriginal = scanner.nextLine();

        StringBuilder resultado = new StringBuilder(); // Usa StringBuilder para construir la nueva cadena eficientemente.
        //stringBuilder sirvira para construir la cadena capitalizada de manera eficiente, ya que permite modificar la cadena sin crear múltiples objetos String.
        boolean capitalizarSiguiente = true; // Bandera para indicar si la siguiente letra debe ir en mayúscula.

        // Itera sobre cada carácter de la cadena original.
        for (char caracter : cadenaOriginal.toCharArray()) {
            if (Character.isWhitespace(caracter)) { // Si el carácter actual es un espacio en blanco...
                resultado.append(caracter); // Añade el espacio al resultado.
                capitalizarSiguiente = true; // Establece la bandera a true para capitalizar la siguiente letra.
            } else { // Si el carácter actual no es un espacio en blanco (es una letra, número, etc.)...
                if (capitalizarSiguiente) { // Si la bandera es true (es la primera letra o después de un espacio)...
                    resultado.append(Character.toUpperCase(caracter)); // Añade el carácter en mayúscula.
                    capitalizarSiguiente = false; // Desactiva la bandera, ya que la letra ya fue capitalizada.
                } else { // Si la bandera es false (es una letra intermedia de una palabra)...
                    resultado.append(Character.toLowerCase(caracter)); // Añade el carácter en minúscula.
                    //append es un método de StringBuilder que añade el carácter al final de la cadena.
                }
            }
        }
        // --- Fin de la lógica de capitalización ---

        String cadenaCapitalizada = resultado.toString(); // Convierte el StringBuilder a String.

        System.out.println("Cadena original: " + cadenaOriginal); // Muestra la cadena que el usuario ingresó.
        System.out.println("Cadena capitalizada: " + cadenaCapitalizada); // Muestra el resultado final.

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos del sistema.
    }
}
