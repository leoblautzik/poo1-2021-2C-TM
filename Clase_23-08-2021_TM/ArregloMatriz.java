package arreglos;

public class ArregloMatriz {
	public static void main(String[] args) {
		// Declaramos un arreglo de 5 n° enteros
		int[] vEnteros = new int[5];
		// Asignar un valor a una posición del arreglo
		vEnteros[2] = 33;
		// Mostrar algunos elementos del arreglo
		System.out.println(vEnteros[2]);	// 33
		System.out.println(vEnteros[4]);	// 0
		
		// Recorrer el arreglo mostrando sus elementos
		for(int k = 0; k < 5; k++) {
			System.out.println(vEnteros[k]);
		}
		
		
		// Declaramos e inicializamos un arreglo de 3 n° enteros
		int[] otroVectorEntero = { 10, -2, 30 };
		System.out.println(otroVectorEntero[0]); // 10
		
		
		/*** MATRICES ó ARREGLOS MULTI-DIMENSIONALES ***/
		int filas = 8;
		int columnas = 8;
		double[][] matrizReal = new double[filas][columnas];
		
		// Mostrar el elemento de la fila 0, columna 0
		System.out.println(matrizReal[0][0]);	// 0.0
		// Mostrar el elemento de la fila 1, columna 0
		System.out.println(matrizReal[1][0]);	// 0.0
		// Recorrer la matriz y mostrar sus elementos
		for(int f = 0; f < matrizReal.length; f++) { // Filas
			for(int c = 0; c < matrizReal[f].length; c++) {	// Columnas			
				System.out.print(matrizReal[f][c] + " ");
			}
			System.out.println();
		}
		
	
		/** ARREGLO DE CADENAS DE CARACTERES **/
		
		String[] alfa = new String[4];
		alfa[0] = "Lucas";
		alfa[1] = "1"; 
		alfa[2] = "3.14";
		
		System.out.println(Integer.parseInt(alfa[1])); // -> 1 (como int)
		
		
		System.out.println(Double.parseDouble(alfa[2])); // -> 3.14 (como double)
	}
}
