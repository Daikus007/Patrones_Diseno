package com.example.demo.unsolid.Ejercicio_4;

public class Tarea {
        private String nombre;
    private String descripcion;
    private boolean completado;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completado = false; // Inicialmente, la tarea no está completada
    }

    public void editar(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void completa() {
        this.completado = true;
    }

    public void incompleta() {
        this.completado = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean completado() {
        return this.completado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completado=" + completado +
                '}';
    }

    public String getDescripcion() {
        return null;
    }
}
