package ejercicio3alumnolinkedlist;

import ejercicio3alumnolinkedlist.src.Alumno; // Importar la clase Alumno
import java.util.LinkedList; // Importar LinkedList para crear una lista enlazada
import java.util.List; // Importar List para declarar una lista genérica

public class Ejercicio3 {
    public static void main(String[] args) {

        // --- Ejercicio 3: Crear una lista de tipo LinkedList --- mensaje opcional
        System.out.println("--- Demostración de LinkedList con Alumnos (Ejercicio 3) ---");
        // 3. Crear una lista de tipo LinkedList con la misma entidad Alumno
        List<Alumno> listaAlumnosLinkedList = new LinkedList<>();

        // 3. Insertar valores en la lista LinkedList mensaje opcional
        System.out.println("Insertando alumnos en el LinkedList...");
        listaAlumnosLinkedList.add(new Alumno("L001", "Roberto Salas", "RS2001"));
        listaAlumnosLinkedList.add(new Alumno("L002", "Sofía Mena", "SM2002"));
        listaAlumnosLinkedList.add(new Alumno("L003", "Diego Ramos", "DR2003"));
        listaAlumnosLinkedList.add(new Alumno("L004", "Valeria Castro", "VC2004"));

        System.out.println("Alumnos insertados correctamente en LinkedList.\n"); // mensaje opcional

        // 3. Mostrar los valores en pantalla de la lista LinkedList
        System.out.println("Lista de Alumnos (LinkedList):");
        for (Alumno alumno : listaAlumnosLinkedList) { //for-each para iterar sobre la lista
            // Utilizando el método toString de la clase Alumno para mostrar los datos
            System.out.println(alumno);
        }
    }
}
