package com.example.demo.unsolid.Ejercicio_4;
import java.util.Stack;
public class HistorialTareas {
    private Stack<IComando> historial;

    public HistorialTareas() {
        this.historial = new Stack<>();
    }

    public void push(IComando comando) {
        this.historial.push(comando);
    }

    public IComando pop() {
        if (!isEmpty()) {
            return this.historial.pop();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return this.historial.isEmpty();
    }
}

