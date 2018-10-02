/*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.*/
public class ej1 {
	public static void main(String[] args) {
		
		String linea;
		System.out.print("Introduce el valor de X:");
		linea = System.console().readLine();
		int x;
		x = Integer.parseInt(linea);

		System.out.print("Introduce el valor de Y:");
		linea = System.console().readLine();
		int y;
		y = Integer.parseInt(linea);		
		
		System.out.println("X vale " + x + ", mientras que Y vale " + y);
		System.out.println("X más Y suman " + (x+y));
		System.out.println("X menos Y son " + (x-y));
		System.out.println("X multiplicado por Y son " + (x*y));
		System.out.println("X dividido entre Y son " + ((float)x/(float)y));
	}
}
