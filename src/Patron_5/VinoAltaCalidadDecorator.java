package Patron_5;

public class VinoAltaCalidadDecorator extends HabitacionDecorator{

    public VinoAltaCalidadDecorator(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return habitacionDecorada.getDescription() + ", habitación con vino de alta calidad";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 50;
    }

}
