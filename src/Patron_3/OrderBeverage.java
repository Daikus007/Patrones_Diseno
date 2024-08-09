package Patron_3;

public class OrderBeverage extends Orden {

    @Override
    protected void tomarPedido() {
        System.out.println("Tomando pedido de bebida...");
    }

    @Override
    protected void preparar() {
        System.out.println("Preparando bebida...");
    }

    @Override
    protected boolean verificarDisponibilidad() {
        // Aquí se podría consultar un inventario, por simplicidad se devuelve true
        System.out.println("Verificando disponibilidad de bebida...");
        return true;
    }

    @Override
    protected int calcularPrecio() {
        // Aquí se calcularía el precio de la bebida, por simplicidad se devuelve un valor fijo
        System.out.println("Calculando precio de bebida...");
        return 5;
    }
}
