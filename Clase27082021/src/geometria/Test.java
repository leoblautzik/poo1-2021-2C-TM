package geometria;

public class Test {

public static void main(String[] args) {
		
		/*Punto centrito = new Punto(1,1);	
		Circulo circulito = new Circulo(2, centrito);
		
		System.out.println(circulito.obtenerRadio());
		circulito.cambiarRadio(4);
		System.out.println(circulito.obtenerRadio());
		System.out.println(circulito.obtenerDiametro());
		System.out.println(circulito.obtenerPerimetro());
		System.out.println(circulito.obtenerArea());
		
		Punto puntito = new Punto(1,1);
		System.out.println(puntito.consultarX());
		System.out.println(puntito.consultarY());
		puntito.cambiarX(-1);
		System.out.println(puntito.consultarX());
		System.out.println(puntito.consultarY());
		System.out.println(puntito.esElOrigen());
		
		Punto sobreX = new Punto(3,0);
		System.out.println(sobreX.estaSobreX());
		*/
	
		Punto a = new Punto(2,2);
		Punto b = new Punto(5,6);
		
		System.out.println(Punto.distancia(a,b));
		System.out.println(a.distancia(b));
		
		Circulo afuera = new Circulo(4);
		System.out.println(afuera.getPerimetro());
		Circulo adentro = new Circulo(2);
		
		Disco d = new Disco(2, 4);
		
		System.out.println(d.getSuperficie());

	}
	
}
