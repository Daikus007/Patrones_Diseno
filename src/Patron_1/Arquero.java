package Patron_1;

public class Arquero extends Heroe {
    public Arquero() {
        super("Arquero");
    }

    public Arquero(Heroe otro) {
        super(otro);
    }

    @Override
    public Arquero copiar() {
        return new Arquero(this);
    }
}
