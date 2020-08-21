import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		
		System.out.println("Entre com três numeros inteiros");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero");
		int a, b,c;
		a = sc.nextInt();
		
		System.out.println("Entre com o segundo numero");
		
		b = sc.nextInt();
		
		System.out.println("Entre com o terceiro numero");
		
		c = sc.nextInt();
		
		if (a > b && b > c) {
			System.out.printf("%d, %d, %d %n", a, b, c);
			
		}
		else if (a > c && c > b) {
			System.out.printf("%d, %d, %d %n", a, c, b);
		}
		else if (b > a && a > c) {
			System.out.printf("%d, %d, %d %n", b, a, c);
		}
		else if (b > c && c > a ) {
			System.out.printf("%d, %d, %d %n", b, c, a);
		}
		else if (c >a && a > b) {
			System.out.printf("%d, %d, %d %n", c, a, b);
		}
		else {
			System.out.printf("%d, %d, %d %n", c, b, a);
		}
		System.out.printf("O primeiro numero digitado foi:%d%nO segundo numero digitado foi:%d%nO terceiro numero digitado foi:%d%n", a, b ,c);
		sc.close();
	}
}
