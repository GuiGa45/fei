import java.util.Scanner;

import org.omg.CORBA.INV_FLAG;

public class Ex_4 {

	public static void main(String[] args) {
		
		int v[];
		v = new int[20];
		for(int i = 0; i <= 19; i++) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num >= 0 ) {
				v[i] =  num;	
			}
			
		}
		for(int j = 0; j <= v.length; j++) {
			if(v[j] > 0) {
			System.out.println(v[j]);
	
		
			}
		}
		
	}
}
