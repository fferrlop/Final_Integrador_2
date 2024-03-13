package Animales;

public class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, String especie, int edad, String genero, String tipoPelaje) {
        super(nombre, especie, edad, genero);
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public void comportamiento() {
        System.out.println("Información del (" + getNombre() + "): " +
                               "Especie: " + getEspecie() +
                                 ", Edad: " + getEdad() +
                              ", Genero: " + getGenero());

    //System.out.println("Información del (" + getNombre() + "): " +
        //                "Especie: " + getEspecie() +
        //                ", Edad: " + getEdad +
        //                ", Genero: " + getGenero());
        //    }
    }
}