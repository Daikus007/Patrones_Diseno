package Patron_2;

public interface Usuario {
    void agregarDispositivo(Observer dispositivo);
    void eliminarDispositivo(Observer dispositivo);
    void notificarDispositivos(String mensaje);
}
