package Animales;

public class Pez extends Animal {
    private String tipoAgua;

    public Pez(String nombre, String especie, int edad, String genero, String tipoAgua) {
        super(nombre, especie, edad, genero);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void comportamiento() {
        System.out.println("Información del (" + getNombre() + "): " +
                "Especie: " + getEspecie() +
                ", Edad: " + getEdad() +
                ", Genero: " + getGenero());
    }

    // Obtener información específica del pez
    public String obtenerInformacionPez() {
        return obtenerInformacion() + ", Tipo de Agua: " + tipoAgua;
    }
}