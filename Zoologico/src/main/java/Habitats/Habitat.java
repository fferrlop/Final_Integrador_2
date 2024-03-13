package Habitats;

public class Habitat {
    private String nombre;
    private int temperatura;
    private int limpieza;

    public Habitat(String nombre, int temperatura, int limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.limpieza = limpieza;
    }

    public void monitorear() {
        System.out.println("Información del hábitat (" + nombre + "): " +
                "Temperatura: " + temperatura +
                ", Limpieza: " + limpieza);
    }

    // Puedes agregar más métodos o atributos según tus necesidades

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getLimpieza() {
        return limpieza;
    }
}