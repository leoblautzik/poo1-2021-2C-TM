package geometria;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		if(radio <= 0)
			throw new Error("Radio inválido");
		this.radio = radio; 
	}
	
	double obtenerRadio() {
		return this.radio;
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
		return "Circulo [radio =" + obtenerRadio() + "]";
	}
	
	

}
