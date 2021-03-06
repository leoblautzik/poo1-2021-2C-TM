package fizzBuzz;
/*Desarrollar un programa que le permita al usuario 
 * ingresar un conjunto de 10 valores enteros. 
 * Luego se debe imprimir el conjunto que el usuario ingresó, 
 * primero en el orden original y luego en el inverso. 
 * Por ejemplo, si el usuario ingresa: 
 * 12, 43, 5, 26, 7, 98, 1, 32, 18, 9 
 * la salida del programa debe ser la siguiente:
 * 
 * Orden original: 12 43 5 26 7 98 1 32 18 9
 * Orden inverso: 9 18 32 1 98 7 26 5 43 12
 * 
 * 
 */

public class InvertirArray {

	public static void invertir(int[] a) {
		System.out.print("Orden original: ");
		for (int i=0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Orden inverso: ");
		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
	}
	
	public static String invertirString(String s) {
		String nuevoString="";
				
		for (int i = s.length() - 1; i >= 0; i--) {
			nuevoString += (s.charAt(i));
		}
		return nuevoString;
		
	}
	
	
	public static void main(String[] args) {
		int v[] = {12, 43, 5, 26, 7, 98, 1, 32, 18, 9,0, 87, -1};
		
		invertir(v);
		
		String greeting = "Hola POO1 del Turno Mañana";
		System.out.println(invertirString(greeting));
	}
	
	// 
	// "anañaM onruT led 1OOP aloH"

}
