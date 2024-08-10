package com.example.demo.unsolid.Ejercicio_4;

public class ModificarTarea implements IComando {
    private Tarea tarea;
    private String nuevoNombre;
    private String nuevaDescripcion;
    private String nombreAnterior;
    private String descripcionAnterior;

    public ModificarTarea(Tarea tarea, String nuevoNombre, String nuevaDescripcion) {
        this.tarea = tarea;
        this.nuevoNombre = nuevoNombre;
        this.nuevaDescripcion = nuevaDescripcion;
        this.nombreAnterior = tarea.getNombre();
        this.descripcionAnterior = tarea.getDescripcion();
    }

    @Override
    public void ejecutar() {
        tarea.editar(nuevoNombre, nuevaDescripcion);
    }

    @Override
    public void deshacer() {
        tarea.editar(nombreAnterior, descripcionAnterior);
    }
}
