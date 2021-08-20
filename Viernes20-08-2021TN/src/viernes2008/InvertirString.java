package viernes2008;

public class InvertirString {

	private static String invertirString(String s) {
		String aux = "";
		
		for(int i = s.length()-1; i >= 0;i--)
			aux += s.charAt(i);
		
		return aux;
	}

	public static void main(String[] args) {
		String greeting = "Hola POO1 del Turno Noche";
		System.out.println(invertirString(greeting));
		// "ehcoN onruT led 1OOP aloH"
	}

}
