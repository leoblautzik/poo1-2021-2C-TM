package nota;

public class Nota {

	private int valor;

	public Nota(int valor) {
		this.valor = valor;
	}

	boolean aprobada() {
		return (valor >= 4 && valor <= 10);
	}

	boolean desaprobada() {
		return !aprobada();
	}

	int obtenerValor() {
		return valor;

	}
	
	boolean promociona() {
		return (valor >= 7);
	}

	/** pre : nuevoValor está comprendido entre 0 y 10.
	*   post: modifica el valor numérico de la Nota, cambiándolo
	*   por nuevoValor, si nuevoValor es superior al 
	*   valor numérico actual de la Nota.
	*/
	void recuperar(int nuevoValor) {
		if(valor < nuevoValor)
			valor = nuevoValor;
		
	}

}
