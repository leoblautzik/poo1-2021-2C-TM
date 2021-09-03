package geometria;

public class Test {

	public static void main(String[] args) {
		
		Circulo circulito = new Circulo(4);
		System.out.println(circulito.obtenerRadio());
		System.out.println(circulito.obtenerDiametro());
		System.out.println(circulito.obtenerPerimetro());
		System.out.println(circulito.obtenerArea());
		
		System.out.println(circulito);
		
		Punto puntito = new Punto(1,1);
		System.out.println(puntito.getX());
		System.out.println(puntito.getY());
		puntito.setX(-1);
		System.out.println(puntito.getX());
		System.out.println(puntito.getY());
		System.out.println(puntito.esElOrigen());
		
		Punto sobreX = new Punto(3,0);
		System.out.println(sobreX.estaSobreX());
	}

}
