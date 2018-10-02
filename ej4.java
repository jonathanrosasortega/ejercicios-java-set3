/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.*/
public class ej4 {
	public static void main(String[] args) {
		System.out.println("Introduce número X:");
		int x = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce número Y:");
		int y = Integer.parseInt(System.console().readLine());

		System.out.printf("X vale %d, mientras que Y vale %d\n", x, y);
		System.out.printf("X más Y suman %d\n", (x+y));
		System.out.printf("X menos Y son %d\n", (x-y));
		System.out.printf("X multiplicado por Y son %d\n", (x*y));
		System.out.printf("X dividido entre Y son %.2f\n", ((float)x/(float)y));
	}
}
