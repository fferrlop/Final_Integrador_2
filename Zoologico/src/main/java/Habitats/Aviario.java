package Habitats;

public class Aviario extends Habitat {
    private int humedad;

    public Aviario(String nombre, int temperatura, int limpieza, int humedad) {
        super(nombre, temperatura, limpieza);
        this.humedad = humedad;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el Aviario (" + getNombre() + "): " +
                "Temperatura: " + getTemperatura() +
                ", Humedad: " + humedad +
                ", Limpieza: " + getLimpieza());
    }
}