package Patron_5;

public class ChocolateGourmetDecorator extends HabitacionDecorator{

    public ChocolateGourmetDecorator(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return habitacionDecorada.getDescription() + ", habitación con chocolate gourmet";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 18;
    }

}
