package com.example.demo.unsolid.Ejercicio_4;

public class CrearTarea implements IComando {
    private GestorTareas gestorTareas;
    private Tarea tarea;

    public CrearTarea(GestorTareas gestorTareas, String nombre, String descripcion) {
        this.gestorTareas = gestorTareas;
        this.tarea = new Tarea(nombre, descripcion);
    }

    @Override
    public void ejecutar() {
        gestorTareas.addTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorTareas.borrarTarea(tarea);
    }
}
