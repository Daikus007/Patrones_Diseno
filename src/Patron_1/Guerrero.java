package Patron_1;

public class Guerrero extends Heroe {
    public Guerrero() {
        super("Guerrero");
    }

    public Guerrero(Heroe otro) {
        super(otro);
    }

    @Override
    public Guerrero copiar() {
        return new Guerrero(this);
    }
}
