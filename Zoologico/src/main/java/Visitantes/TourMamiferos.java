package Visitantes;

import Animales.Mamifero;

public class TourMamiferos {

    public void realizarTour() {
        System.out.println("Bienvenido al Tour de Mamíferos");

        // Supongamos que tienes una instancia específica de Mamífero
        Mamifero capibara = new Mamifero("Capibara", "Roedor", 5, "Macho", "Corto");

        // Mostrar información del mamífero
        System.out.println("Información del Mamífero:");
        System.out.println("Nombre: " + capibara.getNombre());
        System.out.println("Especie: " + capibara.getEspecie());
        System.out.println("Edad: " + capibara.getEdad());
        System.out.println("Género: " + capibara.getGenero());

    }
}
