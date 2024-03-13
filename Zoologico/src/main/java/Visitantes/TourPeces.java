package Visitantes;

import Animales.Pez;

public class TourPeces {

    public void realizarTour() {
        System.out.println("Bienvenido al Tour de Peces");

        // Supongamos que tienes una instancia específica de Pez
        Pez salmon = new Pez("Salmón", "Salmoniforme", 2, "Hembra", "Agua dulce");

        // Mostrar información del pez
        System.out.println("Información del Pez:");
        System.out.println("Nombre: " + salmon.getNombre());
        System.out.println("Especie: " + salmon.getEspecie());
        System.out.println("Edad: " + salmon.getEdad());
        System.out.println("Género: " + salmon.getGenero());

    }
}