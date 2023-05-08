package facturadeproducto;


public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura("Juan Perez", "Laptop", 2, 800.0, 0.13);
        factura.imprimirFactura();
    }
}


