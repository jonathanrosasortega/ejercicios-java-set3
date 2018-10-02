/*Realiza un conversor de Kb a Mb.*/
public class ej11 {
	public static void main(String[] args) {
		double KB;
    
    System.out.println("Introduzca los KB:");
    KB = Double.parseDouble(System.console().readLine());
    double MB = KB/1024;
    System.out.printf("%.2f KB son %.2f MB\n", KB, MB);
	}
}
