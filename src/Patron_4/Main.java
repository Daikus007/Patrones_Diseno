package com.example.demo.unsolid.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        IComando crearTarea1 = new CrearTarea(gestor, "Tarea 1", "Descripción de la tarea 1");
        gestor.ejecutarComando(crearTarea1);

        Tarea tarea1 = gestor.getTareas().get(0);
        IComando modificarTarea = new ModificarTarea(tarea1, "Tarea 1 Modificada", "Nueva descripción");
        gestor.ejecutarComando(modificarTarea);

        IComando completarTarea = new CompletarTarea(tarea1);
        gestor.ejecutarComando(completarTarea);

        gestor.verTareas();

        gestor.deshacerUltimo();
        gestor.verTareas();
    }
}
