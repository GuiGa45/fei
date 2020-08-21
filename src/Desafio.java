
public class Desafio {
	   public static void main( String args[] ){

	      int lado1;
	      int lado2;
	      int hypotenusa;

	      for ( lado1 = 1; lado1 <= 500; lado1++ )
	         for ( lado2 = 1; lado2 <= 500; lado2++ )
	            for ( hypotenusa = 1; hypotenusa <= 500; hypotenusa++ )
	       
	               if ( ( lado1 * lado1 ) + ( lado2 * lado2 ) ==
	                  ( hypotenusa * hypotenusa ) )
	                  System.out.printf( "L1: %d, L2: %d, h: %d\n", lado1, lado2, hypotenusa);      
	   } 
	} 