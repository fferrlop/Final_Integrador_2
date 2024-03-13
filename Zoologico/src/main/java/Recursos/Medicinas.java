package Recursos;

public class Medicinas extends Recurso {
    private String tipo;

    public Medicinas(String nombre, int cantidad, String tipo) {
        super(nombre, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}