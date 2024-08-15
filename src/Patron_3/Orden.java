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


protected abstract void tomarPedido();


protected abstract void preparar();


protected abstract boolean verificarDisponibilidad();


protected abstract int calcularPrecio();

}
