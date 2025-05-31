package ejercicio1numordenadostreeset;

import java.util.Scanner;
import java.util.Set; //se importa Set para poder crear un objeto TreeSet
import java.util.TreeSet; //se importa TreeSet para poder crear un objeto TreeSet

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. Crear una colección TreeSet para almacenar los números.
        // ¡Importante! TreeSet automáticamente ordena los elementos de forma natural
        // (menor a mayor para números) y no permite duplicados.
        Set<Integer> numerosIngresados = new TreeSet<>();

        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números enteros. Para detener la lectura, escriba 'fin'.");

        // Bucle para leer múltiples valores numéricos
        while (true) {
            System.out.print("Ingrese un número o escriba 'fin': ");
            String entrada = scanner.nextLine(); // Leer la línea completa de entrada

            // Verificar si el usuario quiere detener la lectura
            if (entrada.equalsIgnoreCase("fin")) {
                System.out.println("Lectura finalizada por el usuario.");
                break; // Salir del bucle
            }
            else{
                try {
                // Intentar convertir la entrada a un número entero
                int numero = Integer.parseInt(entrada);
                // Si la conversión es exitosa, añadir el número al TreeSet.
                // TreeSet se encargará de insertar el número en su posición ordenada
                // y de ignorarlo si es un duplicado. ¡No necesitamos sort() aquí!
                numerosIngresados.add(numero);
            } catch (NumberFormatException e) {
                // Capturar la excepción si la entrada no es un número válido
                System.out.println("Entrada inválida. Por favor, ingrese un número entero o 'fin'.");
            }
            }
        }

        System.out.println("\n--- Listado de Números Ingresados (ordenados de menor a mayor) ---");

        // 2. Mostrar el listado de los números ingresados desde el TreeSet.
        // Dado que es un TreeSet, los elementos YA ESTÁN ORDENADOS INTERNAMENTE.
        // Simplemente iteramos sobre ellos y se mostrarán en orden.
        if (numerosIngresados.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            // Iterar sobre el TreeSet para mostrar los números.
            // Los números se imprimen en orden ascendente porque así los mantiene TreeSet.
            //numero es el nombre de la variable que representa cada elemento del TreeSet
            //numerosIngresados es el nombre del TreeSet que contiene todos los números
            for (Integer numero : numerosIngresados) {
                System.out.println(numero);
            }
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
