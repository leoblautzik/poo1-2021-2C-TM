package viernes2008;

/* Desarrollar un programa que reciba un arreglo de enteros, 
 * y lo muestre, primero en el orden original y 
 * luego en el inverso. 
 * Por ejemplo, si se recibe como parámetro: 
 * {12, 43, 5, 26, 7, 98, 1, 32, 18, 9} 
 * la salida del programa debe ser la siguiente:
 * 
 * Orden original: 12, 43, 5, 26, 7, 98, 1, 32, 18, 9
 * Orden inverso: 9, 18, 32, 1, 98, 7, 26, 5, 43, 12
 * 
 * 
 */

public class InvertirArreglo {

	public static void arregloAlDerechoYalReves(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (i < a.length-1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i]);
		}

		System.out.println(" ");

		for (int i = a.length-1; i >= 0; i--) {
			if (i > 0)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i]);

		}

		System.out.println(" ");

	}

	public static void main(String[] args) {

		int[] a = { 12, 43, 5, 26, 7, 98, 1, 32, 18, 9 };
		int[] b = new int[4];

		b[0] = 3;
		b[1] = 13;
		b[2] = -3;
		b[3] = 12;

		arregloAlDerechoYalReves(a);
		arregloAlDerechoYalReves(b);

	}

}
