package geometria;

public class Circulo {
	
	private double radio;
			
	public Circulo(double radio) {
		setRadio(radio);
	}

	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double nuevoRadio) {
		if(nuevoRadio <= 0)
			throw new Error("Radio inválido");
		this.radio = nuevoRadio;
	}
	
	public void setDiametro(double nuevoDiametro) {
		this.radio = nuevoDiametro / 2;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * getRadio(); 
	}
	
	public double getArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}

}
