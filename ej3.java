/*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.*/
public class ej3 {
	public static void main(String[] args) {

		System.out.print("Conversor de pesetas. Introduce pesetas:");
		int pesetas = Integer.parseInt(System.console().readLine());
		double euros = 166.386;
		
		System.out.printf("%d pesetas son %.2f euros\n", pesetas, pesetas/euros);
	}
}