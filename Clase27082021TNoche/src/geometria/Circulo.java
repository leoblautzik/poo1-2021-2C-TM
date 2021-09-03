package geometria;

public class Circulo {
	
	private double diametro;
	private Punto centro;
	
	public Circulo(double radio) {
		this.diametro = radio * 2;
	}
	
	double obtenerRadio() {
		return this.diametro / 2;
	}
	
	double obtenerDiametro() {
		return obtenerRadio() * 2;
	}
	
	double obtenerPerimetro() {
		return 2 * Math.PI * obtenerRadio();
	}
	
	double obtenerArea() {
		return Math.PI * Math.pow(obtenerRadio(), 2);
	}

	@Override
	public String toString() {
		return "Circulo [diametro=" + diametro + "]";
	}
	
	

}
