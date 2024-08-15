package Patron_3;

public class Orderfood extends Orden {

    @Override
    protected void tomarPedido() {
        System.out.println("Tomando pedido de comida...");
    }

    @Override
    protected void preparar() {
        System.out.println("Preparando comida...");
    }

    @Override
    protected boolean verificarDisponibilidad() {

        System.out.println("Verificando disponibilidad de comida...");
        return true;
    }

    @Override
    protected int calcularPrecio() {
  
        System.out.println("Calculando precio de comida...");
        return 15;
    }
}
