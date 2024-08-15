package com.example.demo.unsolid.Ejercicio_4;
import java.util.ArrayList;
import java.util.List;
public class GestorTareas {

    private List<Tarea> tareas;
    private HistorialTareas historial;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
        this.historial = new HistorialTareas();
    }

    public void ejecutarComando(IComando comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            IComando comando = historial.pop();
            comando.deshacer();
        }
    }

    public void addTarea(Tarea tarea) {
        ejecutarComando(new CrearTarea( this, "matematicas", "tarea de ..."));
    }

    public void borrarTarea(Tarea tarea) {
        ejecutarComando(new EliminarTarea(this, tarea));
    }

    public void verTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public List<Tarea> getTareas() {
        return new ArrayList<>(this.tareas);
    }
}

