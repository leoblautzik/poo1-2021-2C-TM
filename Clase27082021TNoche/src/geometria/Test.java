package geometria;

public class Test {

	public static void main(String[] args) {
		
		Punto puntito = new Punto(1,1);
		Punto otroPunto = new Punto(4,5);
		
		System.out.println(puntito);
		System.out.println(puntito.distanciaAlOrigen());
		System.out.println(Punto.distancia(puntito, otroPunto));
		System.out.println(puntito.distancia(otroPunto));
		
		Circulo circulito = new Circulo(4);
		System.out.println(circulito);
		
		/*System.out.println(circulito.obtenerRadio());
		System.out.println(circulito.obtenerDiametro());
		System.out.println(circulito.obtenerPerimetro());
		System.out.println(circulito.obtenerArea());
		
		System.out.println(circulito);
		
		/*Punto puntito = new Punto(1,1);
		System.out.println(puntito.getX());
		System.out.println(puntito.getY());
		puntito.setX(-1);
		System.out.println(puntito.getX());
		System.out.println(puntito.getY());
		System.out.println(puntito.esElOrigen());
		
		Punto sobreX = new Punto(3,0);
		System.out.println(sobreX.estaSobreX());
		*/
		
		Disco d = new Disco(8, 2);
		System.out.println(d.obtenerPerimetroExterior());
		System.out.println(d.obtenerPerimetroInterior());
		System.out.println(d.obtenerArea());
	}

}
