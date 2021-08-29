/**
 * Este programa demuestra el funcionamiento de la clase String, que modela
 * cadenas de caracteres
 * 
 * @author Lucas Carnero <lcarnero@uno.edu.ar>
 * @version 1.0
 */

package tipos;

public class Cadena {
	public static void main(String[] args) {
		String nombre = "Lucas";
		String otroNombre = new String("Karen");
		
		
		System.out.println(nombre.length()); 		// 5
		System.out.println(nombre.toUpperCase());	// LUCAS
		System.out.println(otroNombre.toLowerCase()); // karen
		
		System.out.println(nombre.startsWith("L"));	  // true	
		System.out.println(otroNombre.endsWith("n")); // true
		
		System.out.println(nombre.charAt(2));	// c
		
		// ¿Cómo podríamos implementar el método startsWith(),
		// 	usando el método charAt()?
		System.out.println(nombre.charAt(0) == 'L');	// true
		

		// ¿Cómo podríamos implementar el método endsWith(),
		// 	usando el método charAt()?
		System.out.println(otroNombre.charAt(otroNombre.length() - 1) == 'n'); // true
	}
}
