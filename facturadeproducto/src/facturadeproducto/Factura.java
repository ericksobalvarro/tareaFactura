package facturadeproducto;

public class Factura {
	
	 private String cliente;
	    private String producto;
	    private int cantidad;
	    private double precioUnitario;
	    private double impuesto;
	    
		public Factura(String cliente, String producto, int cantidad, double precioUnitario, double impuesto) {
			
			this.cliente = cliente;
			this.producto = producto;
			this.cantidad = cantidad;
			this.precioUnitario = precioUnitario;
			this.impuesto = impuesto;
			
		}
	    
	    public double calcularSubtotal() {
	        return cantidad * precioUnitario;
	    }
	    
	    public double calcularImpuesto() {
	        return calcularSubtotal() * impuesto;
	    }
	    
	    public double calcularTotal() {
	        return calcularSubtotal() + calcularImpuesto();
	    }
		
	    
	    public void imprimirFactura() {
	        System.out.println("Factura");
	        System.out.println("Cliente: " + cliente);
	        System.out.println("Producto: " + producto);
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio unitario: $" + precioUnitario);
	        System.out.println("Subtotal: $" + calcularSubtotal());
	        System.out.println("Impuesto: $" + calcularImpuesto());
	        System.out.println("Total: $" + calcularTotal());
	    }

}



