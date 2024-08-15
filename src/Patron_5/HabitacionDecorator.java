package Patron_5;

public abstract class HabitacionDecorator implements Habitacion {

    protected Habitacion habitacionDecorada;
    
    public HabitacionDecorator(Habitacion habitacionDecorada) {
        this.habitacionDecorada = habitacionDecorada;
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto();
    }

    @Override
    public String getDescription() {
        return habitacionDecorada.getDescription();
    }

}
