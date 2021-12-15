/**
 * Este programa muestra la declaración de varios tipos de datos, primitivos y
 * wrappers -envoltorios-
 * 
 * @author Lucas Carnero <lcarnero@uno.edu.ar>
 * @version 1.0
 */

package tipos;

public class PrimitivoWrapper {
	public static void main(String[] args) {
		int edad = 10;				// Tipo primitivo
		Integer edadEnv = 33;		// Tipo envoltorio -wrapper-
		// Tipo envoltorio; genera una advertencia a partir de Java >= 9
		Integer otroNumero = new Integer("42");		
		
		System.out.println(edadEnv.intValue());		// 33
		System.out.println(otroNumero.intValue());  // 42

		
		char letra = 'A';			// Tipo primitivo 
		Character letraEnv = 'K';	// Tipo envoltorio
	
		System.out.println(letraEnv.charValue());
		
		// Integer -> ocupa en memoria 4 bytes -> 32 bits
		// 4294967296 valores distintos
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// Long -> ocupa en memoria 8 bytes -> 64 bits
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}
}
