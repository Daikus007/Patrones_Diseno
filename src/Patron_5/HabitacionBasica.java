package Patron_5;

public class HabitacionBasica implements Habitacion {

    @Override
    public double getCosto() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Habitación Básica";
    }
    

}
