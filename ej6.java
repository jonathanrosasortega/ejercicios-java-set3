/*Escribe un programa que calcule el área de un triángulo.*/
public class ej6 {
	public static void main(String[] args) {
	
  System.out.println("Para calcular el área de un triángulo, introduzca la base (Distancia):"); //Area=base*altura
	int base = Integer.parseInt(System.console().readLine());

	System.out.println("Introduzca la altura:"); //Area=(base*altura)/2
	int altura = Integer.parseInt(System.console().readLine());

	System.out.printf("Con una base de %d y una altura de %d el area del triángulo es %d\n", base, altura, (base*altura)/2);
	}
}
