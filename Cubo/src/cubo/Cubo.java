package cubo;

public class Cubo {
	
	private double lado;
	
	/*
	 * post: inicializa el cubo a partir de la medida de lado dada
	 */
	public Cubo(double lado) {
		setLado(lado);
	}
	
	public Cubo() {
		this(1);
	}

	/*
	 * post: devuelve la longitud de todos los lados del cubo
	 */
	public double medirLongitudLado() {
		return this.lado;
	}

	/*
	 * pre: lado es un valor mayor a 0. post: cambia la longitud de todos los lados
	 * del cubo
	 */
	public void cambiarLongitudLado(double lado) {
		setLado(lado);
	}

	/*
	 * post: devuelve la superficie ocupada por las caras del cubo
	 */
	public double medirSuperficieCara() {
		return this.lado * this.lado;
	}

	/*
	 * pre: superficieCara es un valor mayor a 0. post: cambia la superficie de las
	 * caras del cubo
	 */
	public void cambiarSuperficieCara(double superficieCara) {
		setLado(Math.sqrt(superficieCara));
	}

	/*
	 * post: devuelve el volumen que encierra el cubo
	 */
	public double medirVolumen() {
		return this.lado * this.medirSuperficieCara();
		
	}

	/*
	 * pre: volumen es un valor mayor a 0. post: cambia el volumen del cubo
	 */
	public void cambiarVolumen(double volumen) {
		setLado(Math.cbrt(volumen));
		
	}

	private void setLado(double lado) {
		if(lado <= 0)
			throw new Error("Lado inválido");
		this.lado = lado;
	}
}
