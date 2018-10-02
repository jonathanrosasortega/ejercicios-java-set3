/*Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.*/
public class ej8 {
	public static void main(String[] args) {
	int horas=0;
    int precioHoras=12;
    System.out.println("Esta app calcula el salario, a 12 euros la hora:");
    System.out.println("¿Cuantas horas has trabajado esta semana?");
    horas = Integer.parseInt(System.console().readLine());
    
    System.out.printf("Si has trabajado %d horas esta semana, te corresponden %d euros\n", horas, horas*precioHoras);
	}
}
