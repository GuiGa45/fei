import java.util.Locale;
import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;

		System.out.println("Entre com o seu salario atual:");
		
		salario = sc.nextDouble();
		double newSalario;
		if (salario >= 0 && salario <= 400.00) {
			System.out.println("Seu salario teve um reajuste de: 15%");
			newSalario = salario * 0.15;
			
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			System.out.println("Seu salario teve um reajuste de: 12%");
			newSalario = salario * 0.12;
		}
		else if (salario >= 800.01 && salario <= 1200.00) {
			System.out.println("Seu salario teve um reajuste de: 10%");
			newSalario = salario  * 0.10;
		}
		else if (salario >= 1200.01 && salario <= 2000.00) {
			System.out.println("Seu salario teve um reajuste de: 7%");
			newSalario = salario * 0.07;
		}
		else {
			System.out.println("Seu salario teve um reajuste de: 4%");
			newSalario = salario * 0.04;
		}
		System.out.printf("Seu salario atual é de $%.2f  %nSeu salario passou a ser de: $%.2f  ", salario, newSalario + salario);
	}

}
