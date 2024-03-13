package Animales;

public class Ave extends Animal {
    private String tipoPico;

    public Ave(String nombre, String especie, int edad, String genero, String tipoPico) {
        super(nombre, especie, edad, genero);
        this.tipoPico = tipoPico;
    }

    @Override
    public void comportamiento() {
        System.out.println("Información del (" + getNombre() + "): " +
                "Especie: " + getEspecie() +
                ", Edad: " + getEdad() +
                ", Genero: " + getGenero());
    }

    // Obtener información específica del ave
    public String obtenerInformacionAve() {
        return obtenerInformacion() + ", Tipo de Pico: " + tipoPico;
    }
}