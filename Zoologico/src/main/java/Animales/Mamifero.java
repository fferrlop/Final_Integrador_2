package Animales;

public class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, String especie, int edad, String genero, String tipoPelaje) {
        super(nombre, especie, edad, genero);
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public void comportamiento() {
        System.out.println(getNombre() + " mostrando comportamientos esperados.");
    }
}