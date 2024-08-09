package Patron_1;

class Mago extends Heroe {
    public Mago() {
        super("Mago");
    }

    public Mago(Heroe otro) {
        super(otro);
    }

    @Override
    public Mago copiar() {
        return new Mago(this);
    }

}
