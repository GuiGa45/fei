import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		System.out.println("Entre com três numeros inteiros");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero");
		int a, b, c;
		a = sc.nextInt();
		
		System.out.println("Entre com o segundo numero");
		
		b = sc.nextInt();
		
		System.out.println("Entre com o terceiro numero");
		
		c = sc.nextInt();
		
		int m = a*b*c;
		
		System.out.printf("O produto é: %d", m );
		
		
		
		sc.close();

	}

}
