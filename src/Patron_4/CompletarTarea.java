package com.example.demo.unsolid.Ejercicio_4;

public class CompletarTarea implements IComando {
    private Tarea tarea;
    private boolean estadoAnterior;

    public CompletarTarea(Tarea tarea) {
        this.tarea = tarea;
        this.estadoAnterior = tarea.completado();
    }

    @Override
    public void ejecutar() {
        tarea.completa();
    }

    @Override
    public void deshacer() {
        if (estadoAnterior) {
            tarea.completa();
        } else {
            tarea.incompleta();
        }
    }
}
