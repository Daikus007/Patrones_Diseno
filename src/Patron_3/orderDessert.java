package Patron_3;

public class orderDessert extends Orden {

    @Override
    protected void tomarPedido() {
        System.out.println("Tomando pedido de postre...");
    }

    @Override
    protected void preparar() {
        System.out.println("Preparando postre...");
    }

    @Override
    protected boolean verificarDisponibilidad() {
        // Aquí se podría consultar un inventario, por simplicidad se devuelve true
        System.out.println("Verificando disponibilidad de postre...");
        return true;
    }

    @Override
    protected int calcularPrecio() {
        // Aquí se calcularía el precio del postre, por simplicidad se devuelve un valor fijo
        System.out.println("Calculando precio de postre...");
        return 7;
    }
}
