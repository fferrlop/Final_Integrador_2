package Habitats;

public class Terrario extends Habitat {
    private int humedad;

    public Terrario(String nombre, int temperatura, int limpieza, int humedad) {
        super(nombre, temperatura, limpieza);
        this.humedad = humedad;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el Terrario (" + getNombre() + "): " +
                "Temperatura: " + getTemperatura() +
                ", Humedad: " + humedad +
                ", Limpieza: " + getLimpieza());
    }
}