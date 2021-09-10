package geometria;

public class Disco {

	private Circulo circuloInterior;
	private Circulo circuloExterior;

	public Disco(double radio1, double radio2) {
		if (radio1 < radio2) {
			this.circuloInterior = new Circulo(radio1);
			this.circuloExterior = new Circulo(radio2);
		}
		if (radio1 > radio2) {
			this.circuloInterior = new Circulo(radio2);
			this.circuloExterior = new Circulo(radio1);
		}
		if (radio1 == radio2)
			throw new Error("Los radios no puedes ser iguales");

	}
	
	double obtenerPerimetroInterior() {
		return this.circuloInterior.obtenerPerimetro();
	}
	
	double obtenerPerimetroExterior() {
		return this.circuloExterior.obtenerPerimetro();
	}
	
	double obtenerArea() {
		return this.circuloExterior.obtenerArea() - this.circuloInterior.obtenerArea();
	}
	

}
