package org.example;

import Habitats.*;

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
        scanner.close();

        public static void trabajadorDelZoo() {
            scanner = new Scanner(System.in);
        }


//Gestión de habitats

        Acuario acuario1 = new Acuario("Acuario");
        Terrario terrestre1 = new Terrario("Terrario");
        Aviario aviario1 = new Aviario("Aviario");

        // Monitorear hábitats
        acuario1.monitorear();
        terrestre1.monitorear();
        aviario1.monitorear();
    }
}

