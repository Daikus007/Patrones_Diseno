package Patron_2;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion implements Usuario {
    private List<Observer> dispositivos;

    public Aplicacion() {
        dispositivos = new ArrayList<>();
    }

    @Override
    public void agregarDispositivo(Observer dispositivo) {
        dispositivos.add(dispositivo);
    }

    @Override
    public void eliminarDispositivo(Observer dispositivo) {
        dispositivos.remove(dispositivo);
    }

    @Override
    public void notificarDispositivos(String mensaje) {
        for (Observer dispositivo : dispositivos) {
            dispositivo.actualizar(mensaje);
        }
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Nuevo mensaje: " + mensaje);
        notificarDispositivos(mensaje);
    }
}
