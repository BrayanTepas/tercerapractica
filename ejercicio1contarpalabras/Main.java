import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un texto para contar las palabras:");
        String texto = scanner.nextLine();
        if (texto.isEmpty()) {
            System.out.println("El texto está vacío. No se pueden contar palabras.");
            
        }else{
            String[] palabras = texto.trim().split("\\s+");
            int contador = palabras.length;
            System.out.println("El número de palabras en el texto es: " + contador);
        } 
        scanner.close();
    }

}
