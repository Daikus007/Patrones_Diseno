package Patron_5;

public class Hotel {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();
        System.out.println(habitacion.getDescription() + " cuesta $" + habitacion.getCosto());

        habitacion = new FloresFrescasDecorator(habitacion);
        habitacion = new ChocolateGourmetDecorator(habitacion);
        habitacion = new VinoAltaCalidadDecorator(habitacion);

        System.out.println(habitacion.getDescription() + " cuesta $" + habitacion.getCosto());
    }
}
