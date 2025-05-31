package ejercicio2alumnoarraylist;

import java.util.ArrayList; //para poder crear un objeto ArrayList
import java.util.List; //para declarar una lista genérica

import ejercicio2alumnoarraylist.src.Alumno;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 2. Crear una lista genérica de tipo ArrayList de Alumno
        List<Alumno> listaAlumnos = new ArrayList<>();

        // 3. Insertar valores en la lista
        System.out.println("Insertando alumnos en la lista...");
        listaAlumnos.add(new Alumno("A001", "Juan Pérez", "JP1001"));
        listaAlumnos.add(new Alumno("A002", "María López", "ML1002"));
        listaAlumnos.add(new Alumno("A003", "Carlos García", "CG1003"));
        listaAlumnos.add(new Alumno("A004", "Ana Martínez", "AM1004"));
        listaAlumnos.add(new Alumno("A005", "Pedro Ramírez", "PR1005"));

        System.out.println("Alumnos insertados correctamente.\n");

        // 4. Mostrar los valores en pantalla
        System.out.println("Lista de Alumnos:");
        // Iterar sobre la lista para mostrar cada alumno
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

    }
}
