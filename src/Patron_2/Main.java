package Patron_2;

public class Main {
    public static void main(String[] args) {
        // Crear la aplicación
        Aplicacion aplicacion = new Aplicacion();

        // Crear dispositivos
        Observer dispositivo1 = new Dispositivo("Teléfono1");
        Observer dispositivo2 = new Dispositivo("Teléfono2");
        Observer dispositivo3 = new Dispositivo("Tableta");
        Observer dispositivo4 = new Dispositivo("Reloj Inteligente");

        // Registrar dispositivos
        aplicacion.agregarDispositivo(dispositivo1);
        aplicacion.agregarDispositivo(dispositivo2);
        aplicacion.agregarDispositivo(dispositivo3);
        aplicacion.agregarDispositivo(dispositivo4);

        // Enviar un mensaje
        aplicacion.enviarMensaje("¡Hola, tienes un nuevo mensaje!");

        // Eliminar un dispositivo
        aplicacion.eliminarDispositivo(dispositivo1);

        // Enviar otro mensaje
        aplicacion.enviarMensaje("¡Otro mensaje nuevo!");
    }
}
