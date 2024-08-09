package Patron_1;

import java.util.HashMap;
import java.util.Map;

public class Heroe implements Cloneable {
    private String nombre;
    private String clase;
    private int nivel;
    private Map<String, Integer> habilidades = new HashMap<>();
    
    public Heroe(String clase) {
        this.clase = clase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void addHabilidad(String habilidad, int poder) {
        habilidades.put(habilidad, poder);
    }

    public Heroe clonar() {
        try {
            return (Heroe) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Clase: " + clase);
        System.out.println("Habilidades: " + habilidades);
    }

 }
