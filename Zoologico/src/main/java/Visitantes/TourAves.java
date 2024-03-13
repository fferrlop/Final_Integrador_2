package Visitantes;

import Animales.Ave;

public class TourAves {

    public void realizarTour() {
        System.out.println("Bienvenido al Tour de Aves");

        // Supongamos que tienes una instancia específica de Ave
        Ave colibri = new Ave("Colibrí", "Trochilidae", 1, "Hembra", "Pico forma de lezna");

        // Mostrar información del ave
        System.out.println("Información del Ave:");
        System.out.println("Nombre: " + colibri.getNombre());
        System.out.println("Especie: " + colibri.getEspecie());
        System.out.println("Edad: " + colibri.getEdad());
        System.out.println("Género: " + colibri.getGenero());
    }
}