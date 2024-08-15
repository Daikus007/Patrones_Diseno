package Patron_2;

public class Dispositivo implements Observer {
    private String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("El dispositivo " + nombre + " recibió el mensaje: " + mensaje);
    }
}

