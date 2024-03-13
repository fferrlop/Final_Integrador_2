package MantenimientoRecursos;

import java.util.ArrayList;
import java.util.List;

public class Mantenimiento {
    private List<String> mantenimientosProgramados;
    private List<String> reparacionesUrgentes;

    public Mantenimiento() {
        this.mantenimientosProgramados = new ArrayList<>();
        this.reparacionesUrgentes = new ArrayList<>();
    }

    public void programarMantenimiento(String tarea) {
        mantenimientosProgramados.add(tarea);
        System.out.println("Mantenimiento programado: " + tarea);
    }

    public void reparacionUrgente(String tarea) {
        reparacionesUrgentes.add(tarea);
        System.out.println("Reparación urgente: " + tarea);
    }
}