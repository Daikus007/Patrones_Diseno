package Patron_1;

public class Videojuego {
    public static void main(String[] args) {
        Guerrero prototipoGuerrero = new Guerrero();
        prototipoGuerrero.setNombre("Zeus");
        prototipoGuerrero.setNivel(100);
        prototipoGuerrero.addHabilidad("Rayo", 100);
        prototipoGuerrero.addHabilidad("Salud", 200);

        Guerrero clonGuerrero = (Guerrero) prototipoGuerrero.copiar();
        clonGuerrero.setNombre("Clon de Zeus");

        clonGuerrero.mostrarInfo();

        Mago prototipoMago = new Mago();
        prototipoMago.setNombre("Dr. Strange");
        prototipoMago.setNivel(50);
        prototipoMago.addHabilidad("Hipnotizar", 90);
        prototipoMago.addHabilidad("Manejo tiempo", 200);

        Mago clonMago = (Mago) prototipoMago.copiar();
        clonMago.setNombre("Clon de Dr. Strange");

        clonMago.mostrarInfo();

        Arquero prototipoArquero = new Arquero();
        prototipoArquero.setNombre("Daryl Dixon");
        prototipoArquero.setNivel(90);
        prototipoArquero.addHabilidad("Flecha de fuego", 75);
        prototipoArquero.addHabilidad("Pasos suaves", 100);

        Arquero clonArquero = (Arquero) prototipoArquero.copiar();
        clonArquero.setNombre("Clon de Daryl Dixon");

        clonArquero.mostrarInfo();
    }
}
