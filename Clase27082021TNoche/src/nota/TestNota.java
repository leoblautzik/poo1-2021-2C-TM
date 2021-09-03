package nota;

import java.util.HashSet;
import java.util.Set;

public class TestNota {

	public static void main(String[] args) {

		Nota parcialDeJuana = new Nota(7);
		Nota parcialDePedro = new Nota(4);

		System.out.println(parcialDeJuana.aprobada());
		System.out.println(parcialDeJuana.desaprobada());
		System.out.println(parcialDeJuana.obtenerValor());
		System.out.println(parcialDeJuana.promociona());
		System.out.println("------------------------------------");
		System.out.println(parcialDePedro.aprobada());
		System.out.println(parcialDePedro.desaprobada());
		System.out.println(parcialDePedro.obtenerValor());
		System.out.println(parcialDePedro.promociona());

		parcialDePedro.recuperar(2);
//		
		System.out.println("------------------------------------");
		System.out.println(parcialDePedro.aprobada());
		System.out.println(parcialDePedro.desaprobada());
		System.out.println(parcialDePedro.obtenerValor());
		System.out.println(parcialDePedro.promociona());

		// f(x); estructurada
		// x.f(); POO

		
	}

}
