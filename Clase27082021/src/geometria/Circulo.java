package geometria;

public class Circulo {
	
	private double diametro;
	private	Punto centro; 
		
	public Circulo(double radio, Punto centro) {
		cambiarRadio(radio);
		this.centro = centro;
	}

	public double obtenerRadio() {
		return obtenerDiametro()/2;
	}
	
	public void cambiarRadio(double nuevoRadio) {
		cambiarDiametro(nuevoRadio * 2);
	}
	
	public void cambiarDiametro(double nuevoDiametro) {
		diametro = nuevoDiametro;
	}
	
	public double obtenerDiametro() {
		return diametro;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * obtenerRadio(); 
	}
	
	public double obtenerArea() {
		return Math.PI * Math.pow(obtenerRadio(), 2);
	}

}
