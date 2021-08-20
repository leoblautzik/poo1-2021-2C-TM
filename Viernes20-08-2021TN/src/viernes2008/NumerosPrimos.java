package viernes2008;

/*8-Dado un valor numérico, determinar e informar si 
 * se trata de un número primo o no.
 *
 *9- Desarrollar un algoritmo que muestre los primeros 
 *	 n números primos siendo n un valor que se recibe por 
 *   parámetro
 *   
 *   Modificar el programa anterior para que muestre 
 *   los número en orden inverso.
 */

public class NumerosPrimos {

	public static boolean esPrimo(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void mostrarLosPrimerosNprimos(int n) {
		int contadorDePrimos = 0;
		int i = 2;
		while (contadorDePrimos < n) {
			if (esPrimo(i)) {
				contadorDePrimos++;
				System.out.println(i);
			}
			i++;
		}

	}

	public static void mostrarLosPrimerosNprimosEnOrdenInverso(int n) {
		int[] array = new int[n];
		int contadorDePrimos = 0;
		int i = 2;
		while (contadorDePrimos < n) {
			if (esPrimo(i)) {
				array[contadorDePrimos] = i;
				contadorDePrimos++;
			}
			i++;
		}

		for (int y = array.length - 1; y >= 0; y--) {
			System.out.print(array[y] + " ");
		}

	}

// 2	3	5 	7	11	13 	17	19	23

	public static void main(String[] args) {

		mostrarLosPrimerosNprimosEnOrdenInverso(9);

	}
}
