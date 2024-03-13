package Habitats;

public class Acuario extends Habitat {
    private int humedad;

    public Acuario(String nombre, int temperatura, int limpieza, int humedad) {
        super(nombre, temperatura, limpieza);
        this.humedad = humedad;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el Acuario (" + getNombre() + "): " +
                "Temperatura: " + getTemperatura() +
                ", Humedad: " + humedad +
                ", Limpieza: " + getLimpieza());
    }
}
