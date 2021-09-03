package geometria;

public class Disco {

	private Circulo circuloInterior;
	private Circulo circuloExterior;
	
	Disco(double radioInterior, double radioExterior){
		if( radioInterior < radioExterior) {
		this.circuloExterior = new Circulo(radioExterior);
		this.circuloInterior = new Circulo(radioInterior);
		}
		else
		{
			this.circuloExterior = new Circulo(radioInterior);
			this.circuloInterior = new Circulo(radioExterior);
		}
			
	}
	
	double getRadioInterior() {
		return this.circuloInterior.getRadio();
	}
	
	double getRadioExterior(){
		return this.circuloExterior.getRadio();
	}
	
	double getPerimetroInterior(){
		return this.circuloInterior.getPerimetro();
	}
	
	double getPerimetroExterior(){
		return this.circuloExterior.getPerimetro();
	}
	
	double getSuperficie(){
		return this.circuloExterior.getArea() - this.circuloInterior.getArea();
	}


}
