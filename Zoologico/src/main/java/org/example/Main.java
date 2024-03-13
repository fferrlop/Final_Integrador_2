package org.example;

import Habitats.*;
import Animales.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

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
                menuTrabajadorDelZoo(); // Llamada al menú de trabajador del zoológico
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
                break;
        }

        scanner.close();
    }

    public static void menuTrabajadorDelZoo() {
        int opcionTrabajador;
        do {
            System.out.println("\nMenú Trabajador del Zoológico");
            System.out.println("1. Gestión de Hábitats");
            System.out.println("2. Cuidado de Animales");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcionTrabajador = scanner.nextInt();

            switch (opcionTrabajador) {
                case 1:
                    gestionDeHabitats();
                    System.exit(0);
                    break;
                case 2:
                    gestionDeHabitats();
                    System.exit(0);
                    break;
                case 3:
                    System.out.println("Saliendo del menú de trabajador del zoológico.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcionTrabajador != 3);
    }

    // Gestión de hábitats
    public static void gestionDeHabitats() {
        Acuario acuario1 = new Acuario( "Acuario",35, 80, 80);
        Terrario terrestre1 = new Terrario("Terrario",25, 70, 40);
        Aviario aviario1 = new Aviario( "Aviario",30, 80, 75);

        // Monitorear hábitats
        acuario1.monitorear();
        terrestre1.monitorear();
        aviario1.monitorear();
    }

    // Cuidado de animales

    public static void cuidadoDeAnimales() {

    }
}