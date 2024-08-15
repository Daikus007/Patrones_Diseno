package Patron_5;

public class FloresFrescasDecorator extends HabitacionDecorator {

    public FloresFrescasDecorator(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return habitacionDecorada.getDescription() + ", habitación con flores frescas";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 20.00;

    }
    
}
