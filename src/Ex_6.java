import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int r = 0;
		System.out.println("Entre com a posição de P:");
		int p = sc.nextInt();
		if (p == 1) {
			System.out.println("Entre com a posição de R:");
			r = sc.nextInt();
		}

		if (p >= 3 && r >= 3) {
			System.out.println("Entre com um numero de 1 a 2!");
			
		}
		
		if (p == 0) {
			System.out.println("A Bolinha ira cair em: C ");
		}
		else if (p == 1 && r == 0) {
			System.out.print("A bolinha ira cair em: B");
		}
		else if (p == 1 && r == 1) {
			System.out.println("A bolinha ira cair em: A");
		} 
		else {
			System.out.println("Entre com uma posição valida!");
		}

	}

}
