package ejercicio2librolinkedhashset;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import ejercicio2librolinkedhashset.src.Libro;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creamos un LinkedHashSet para almacenar objetos Libro.
        // Mantiene el orden de inserción y no permite duplicados (basado en equals/hashCode de Libro).
        Set<Libro> coleccionLibros = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Gestión de Libros con LinkedHashSet ---");
        System.out.println("Ingrese los datos de los libros. Escriba 'fin' en el ID para terminar.");

        String id;
        do {
            System.out.print("\nIngrese ID del libro (o 'fin' para terminar): ");
            id = scanner.nextLine();

            if (id.equalsIgnoreCase("fin")) {
                break; // Salir del bucle
            }

            System.out.print("Ingrese Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese Edición: ");
            String edicion = scanner.nextLine(); // Edición es String en tu clase

            System.out.print("Ingrese Autor: ");
            String autor = scanner.nextLine();

            // Creamos un nuevo objeto Libro con los datos ingresados
            Libro nuevoLibro = new Libro(id, titulo, edicion, autor);

            // Intentamos añadir el libro al LinkedHashSet
            // add() retorna true si el elemento se añadió exitosamente (no era un duplicado)
            // y false si el elemento ya existía (es un duplicado según equals())
            if (coleccionLibros.add(nuevoLibro)) {
                System.out.println("Libro agregado: " + nuevoLibro.getTitulo());
            } else {
                System.out.println("ERROR: Ya existe un libro con el ID '" + id + "'. No se agregó el duplicado.");
            }

        } while (true); // Bucle infinito hasta que el usuario escriba 'fin'

        System.out.println("\n--- Listado de Libros en la Colección (Orden de Inserción) ---");
        if (coleccionLibros.isEmpty()) {
            System.out.println("No se ingresaron libros.");
        } else {
            // Iteramos sobre el LinkedHashSet para mostrar los libros.
            // Se mostrarán en el orden en que fueron insertados.
            for (Libro libro : coleccionLibros) {
                System.out.println(libro);
            }
        }

        scanner.close(); // Cerramos el Scanner
    }
}
