package geometria;

public class Test {

public static void main(String[] args) {
		
		Punto centrito = new Punto(1,1);	
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
		
		

	}
	
}
