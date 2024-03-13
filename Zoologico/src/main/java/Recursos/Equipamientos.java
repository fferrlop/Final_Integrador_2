package Recursos;

class Equipamientos extends Recurso {
    private String categoria;

    public Equipamientos(String nombre, int cantidad, String categoria) {
        super(nombre, cantidad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}