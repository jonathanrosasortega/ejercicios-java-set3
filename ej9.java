/*Escribe un programa que calcule el volumen de un cono según la
fórmula V = (3.14 * r * r * h)/3
*/
public class ej9 {
	public static void main(String[] args) {
		double V;
    double r;
    double h;
    System.out.println("Para hallar el volumen de un cono, introduce el radio:");
    r = Double.parseDouble(System.console().readLine());
    
    System.out.println("Ahora introduce la altura:");
    h = Double.parseDouble(System.console().readLine());
    V = (3.14*r*r*h)/3;
    System.out.printf("El volumen del cono es %.2f\n", V);
	}
}
