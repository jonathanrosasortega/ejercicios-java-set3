/*Realiza un conversor de Mb a Kb.*/
public class ej10 {
	public static void main(String[] args) {
		double MB;
    
    System.out.println("Introduzca los MB:");
    MB = Double.parseDouble(System.console().readLine());
    double KB = MB*1024;
    System.out.printf("%.2f MB son %.2f KB\n", MB, KB);
	}
}
