package Recursos;

class Alimentos extends Recurso {
    private String tipo;

    public Alimentos(String nombre, int cantidad, String tipo) {
        super(nombre, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}