package Recursos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase para representar un recurso genérico
public class Recurso {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void reducirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
}
