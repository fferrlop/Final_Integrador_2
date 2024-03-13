package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Zoologico");

        // Menú principal
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
        System.out.print("Seleccione su rol (1 o 2): ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Interfaz para visitantes
                System.out.println("Interfaz para visitantes");
                // Lógica para visitantes
                break;
            case 2:
                // Interfaz para trabajadores
                System.out.println("Interfaz para trabajadores");
                // Lógica para trabajadores
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
                break;
        }

        // Cierre del scanner
        scanner.close();
    }
}

