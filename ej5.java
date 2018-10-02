/*Escribe un programa que calcule el área de un rectángulo.*/
public class ej5 {
	public static void main(String[] args) {
	System.out.println("Para calcular el área de un rectángulo, introduzca la base (Distancia):"); //Area=base*altura
	int base = Integer.parseInt(System.console().readLine());

	System.out.println("Introduzca la altura:"); //Area=base*altura
	int altura = Integer.parseInt(System.console().readLine());

	System.out.printf("Con una base de %d y una altura de %d el area del rectángulo es %d\n", base, altura, base*altura);
	}
}
