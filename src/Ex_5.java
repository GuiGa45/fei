import java.util.Locale;
import java.util.Scanner;


public class Ex_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero do produto:");
		int x = sc.nextInt();
		
		double valor = 0;
		
		System.out.print("Entre com a quantidade:");
		
		int quantidade = 0;
		
		quantidade = sc.nextInt();
		
		
		switch (x) {
		case 1:
		valor = 2.98 * quantidade ;
		break;
		case 2:
		valor = 4.50 * quantidade ;
		break;
		case 3:
		valor = 3.98 * quantidade;
		break;
		case 4:
		valor = 4.49 * quantidade;
		break;
		case 5:
		valor = 6.87 * quantidade;
		break;
		}
		
		System.out.println("Quantidade que foi comprada: " + quantidade);
		System.out.println("Valor a ser pago: $" + valor);
		sc.close();

	}

}
