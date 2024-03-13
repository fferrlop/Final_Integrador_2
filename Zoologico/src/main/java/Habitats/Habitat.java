package Habitats;

public class Habitat {

    private String nombre;
    private double temperatura;
    private double humedad;
    private boolean limpio;

    // Constructor
    public Habitat(String nombre) {
        this.nombre = nombre;
        this.temperatura = 0.0;
        this.humedad = 0.0;
        this.limpio = true;
    }

    // Métodos getters y setters (puedes agregar más según sea necesario)

    public void monitorear() {
        // Implementar lógica de monitoreo
        System.out.println("Monitoreando el hábitat " + nombre + "...");
        // Puedes agregar lógica para analizar la temperatura, humedad, limpieza, etc.
    }
}

