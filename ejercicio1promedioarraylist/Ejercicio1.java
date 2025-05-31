package ejercicio1promedioarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. Declaración de una lista para almacenar los números
        List<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("--- ANÁLISIS NUMÉRICO ---");
        System.out.println("Introduce valores numéricos. El programa calculará el promedio y la cantidad de positivos.");

        // 2. Bucle para introducir números hasta que el usuario decida detenerse
        do {
            System.out.print("Introduce un número (o 's' para salir): ");
            if (scanner.hasNextDouble()) { // Verifica si la entrada es un número
                double numero = scanner.nextDouble();
                numeros.add(numero); // Añade el número a la lista
            } else {
                opcion = scanner.next(); // Lee la entrada si no es un número
                if (opcion.equalsIgnoreCase("s")) {
                    break; // Sale del bucle si la opción es 's'
                } else {
                    System.out.println("Entrada inválida. Por favor, introduce un número o 's' para salir.");
                }
            }
        } while (true); // Bucle infinito que se rompe con 'break'

        // 3. Cálculos (solo si se introdujeron números)
        if (!numeros.isEmpty()) {
            double suma = 0;
            int cantidadPositivos = 0;

            for (Double num : numeros) {
                suma += num;
                if (num > 0) {
                    cantidadPositivos++;
                }
            }

            double promedio = suma / numeros.size();

            // 4. Mostrar resultados
            System.out.printf("Promedio de los números: %.2f%n", promedio);
            System.out.printf("Cantidad de números positivos: %d%n", cantidadPositivos);
        } else {
            System.out.println("\nNo se introdujeron números. El programa ha finalizado.");
        }

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
