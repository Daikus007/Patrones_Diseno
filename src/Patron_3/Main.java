package Patron_3;

public class Main {
    public static void main(String[] args) {
        Orden ordenComida = new Orderfood();
        Orden ordenBebida = new OrderBeverage();
        Orden ordenPostre = new orderDessert();

        System.out.println("Procesando orden de comida:");
        int precioComida = ordenComida.procesarOrden();
        System.out.println("Precio de comida: $" + precioComida);

        System.out.println("\nProcesando orden de bebida:");
        int precioBebida = ordenBebida.procesarOrden();
        System.out.println("Precio de bebida: $" + precioBebida);

        System.out.println("\nProcesando orden de postre:");
        int precioPostre = ordenPostre.procesarOrden();
        System.out.println("Precio de postre: $" + precioPostre);
    }
}
