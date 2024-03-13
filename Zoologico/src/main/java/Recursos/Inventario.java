package Recursos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {
    private Map<String, Recurso> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarRecurso(Recurso recurso) {
        inventario.put(recurso.getNombre(), recurso);
    }

    public Recurso obtenerRecurso(String nombre) {
        return inventario.get(nombre);
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Recurso recurso : inventario.values()) {
            System.out.println(recurso.getNombre() + " - Cantidad: " + recurso.getCantidad());
        }
    }
}
