package Animales;

public class Ave extends Animal {
    private String tipoPico;

    public Ave(String nombre, String especie, int edad, String genero, String tipoPico) {
        super(nombre, especie, edad, genero);
        this.tipoPico = tipoPico;
    }

    @Override
    public void comportamiento() {
        System.out.println(getNombre() + " mostrando comportamientos esperados.");
    }

}