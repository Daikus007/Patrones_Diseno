package com.example.demo.unsolid.Ejercicio_4;

public class EliminarTarea implements IComando {
    private GestorTareas gestorTareas;
    private Tarea tarea;

    public EliminarTarea(GestorTareas gestorTareas, Tarea tarea) {
        this.gestorTareas = gestorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        gestorTareas.borrarTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorTareas.addTarea(tarea);
    }
}
