/*Escribe un programa que elimine el IVa de una factura con IVA incluido*/
public class extra {
	public static void main(String[] args) {
		double factura;
    
    System.out.println("Introduzca la factura con el IVA:");
    factura = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Base imponible: %.2f\n", factura/1.21);
	}
}
