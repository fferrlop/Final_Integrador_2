package org.example;

import Habitats.*;
import Animales.*;
import Visitantes.*;

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
                menuVisitanteDelZoo();

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
                    cuidadoDeAnimales();
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

    private static void menuVisitanteDelZoo() {
        boolean salir = false;

        do {
            System.out.println("\nMenú Visitante del Zoológico");
            System.out.println("1. Tour de Aves");
            System.out.println("2. Tour de Mamíferos");
            System.out.println("3. Tour de Peces");
            System.out.println("4. Salir");
            System.out.print("Seleccione un tipo de tour (1, 2, 3 o 4): ");

            int opcionVisitante = scanner.nextInt();

            switch (opcionVisitante) {
                case 1:
                    // Lógica para el Tour de Aves
                    TourAves tourAves = new TourAves();
                    tourAves.realizarTour();
                    salir = true;
                    break;
                case 2:
                    // Lógica para el Tour de Mamíferos
                    TourMamiferos tourMamiferos = new TourMamiferos();
                    tourMamiferos.realizarTour();
                    salir = true;
                    break;
                case 3:
                    // Lógica para el Tour de Peces
                    TourPeces tourPeces = new TourPeces();
                    tourPeces.realizarTour();
                    salir = true;
                    break;
                case 4:
                    System.out.println("Saliendo del menú de visitante.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (!salir);
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
        Mamifero capibara = new Mamifero("Capibara", "Roedor", 5, "Macho", "Corto");
        Pez salmon = new Pez("Salmón", "Salmoniforme", 2, "Hembra", "Agua dulce");
        Ave Colibri = new Ave("Colibrí", "Trochilidae", 1, "Hembra", "Pico forma de lezna");

        // Registrar actividades
        capibara.alimentar();
        capibara.monitorearSalud();
        capibara.comportamiento();

        salmon.alimentar();
        salmon.monitorearSalud();
        salmon.comportamiento();

        Colibri.alimentar();
        Colibri.monitorearSalud();
        Colibri.comportamiento();

    }
}