
import java.util.Scanner;

public class Ex_8{

    public void imprimir(int numero) {
        for (int contador = 1; contador <= numero; contador++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void main(String[] args) {

    	Ex_8 barras = new Ex_8();


        Scanner sc = new Scanner(System.in);


        int contador = 1;

        int num = 0;

        do {
            System.out.print("Entre com um numero: ");
            num = sc.nextInt();

            if (num > 0 && num < 31) {
                barras.imprimir(num);
                contador++;
            } else {
                System.out.println("Entre com um numero entre 1 e 30");
            }
        } while (contador <= 5);

    }
}