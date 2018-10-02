/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/
public class ej12 {
	public static void main(String[] args) {
		System.out.println("¿Qué necesitas sacar en el 2º examen para que la media te de aprobado?");
    System.out.println("Introduce la nota que sacaste en el 1º examen:");
    double nota1 = Double.parseDouble(System.console().readLine());
    double media = 5;
    double nota2 = (media - (nota1*0.4))/0.6;
    // = (nota2*0.6)
    System.out.printf("Si sacaste un %.2f en el primer examen, para aprobar, necesitas en el segundo examen sacar al menos un %.2f\n", nota1, nota2);
    
	}
}
