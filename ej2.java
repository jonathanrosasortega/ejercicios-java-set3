/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.*/
public class ej2 {
	public static void main(String[] args) {

		System.out.print("Conversor de euros. Introduce euros:");
		double euros = Double.parseDouble(System.console().readLine());
    	double pesetas = 166.386;
    
		System.out.printf("%.2f euros son %.2f pesetas\n", euros, (int)euros*pesetas);
	}
}
