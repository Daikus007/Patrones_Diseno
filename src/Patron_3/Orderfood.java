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
        // Aquí se podría consultar un inventario, por simplicidad se devuelve true
        System.out.println("Verificando disponibilidad de comida...");
        return true;
    }

    @Override
    protected int calcularPrecio() {
        // Aquí se calcularía el precio de la comida, por simplicidad se devuelve un valor fijo
        System.out.println("Calculando precio de comida...");
        return 15;
    }
}
