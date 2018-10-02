/*Escribe un programa que calcule el total de una factura a partir de la base
imponible.*/
public class ej7 {
	public static void main(String[] args) {
		double base;
    
    System.out.println("Introduzca la base imponible:");
    base = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Base imponible: %.2f\n", base);
    System.out.printf("IVA : %.2f\n", (base*0.21));
    System.out.printf("Total: %.2f\n", (base*1.21));
	}
}
