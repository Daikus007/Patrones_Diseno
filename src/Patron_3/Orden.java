package Patron_3;

public abstract class Orden {
  // Método template que define el flujo general del procesamiento de la orden
  public final int procesarOrden() {
    tomarPedido();
    if (verificarDisponibilidad()) {
        preparar();
        return calcularPrecio();
    } else {
        System.out.println("No hay disponibilidad para completar la orden.");
        return 0;
    }
}

// Método abstracto para tomar el pedido, debe ser implementado por las subclases
protected abstract void tomarPedido();

// Método abstracto para preparar el pedido, debe ser implementado por las subclases
protected abstract void preparar();

// Método abstracto para verificar la disponibilidad del pedido, debe ser implementado por las subclases
protected abstract boolean verificarDisponibilidad();

// Método abstracto para calcular el precio del pedido, debe ser implementado por las subclases
protected abstract int calcularPrecio();

}
