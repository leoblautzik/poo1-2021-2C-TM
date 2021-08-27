package nota;

public class Nota {
	
	private int valor;

	Nota(int valor){
		this.valor = valor;
	}
		
	boolean  aprobado() {
	
		return (valor >= 4 && valor <= 10);
		
	}
	
	boolean desaprobado(){
		
		return (valor >= 0 && valor <4);
				
	}
	
	int obtenerValor() {
		return valor;
	}
	
	/* pre : nuevoValor está comprendido entre 0 y 10.
	*  post: modifica el valor numérico de la Nota, cambiándolo
	*  por nuevoValor, si nuevoValor es superior al
	*  valor numérico actual de la Nota.
	*/
	void recuperar(int nuevoValor) {
		if (nuevoValor > valor)
			valor = nuevoValor;
	}
	
	/** post: devuelve true si valor es mayor o igual a 7
	 *  
	 * @return true
	 */
	boolean promociona() {
		return (valor >= 7);
	}

	
	public static void main(String[] args) {
		
		Nota parcial1 = new Nota(3);
		Nota parcial2 = new Nota(8);
		Nota juana = new Nota(10);
			
		
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.desaprobado());
		System.out.println(parcial2.aprobado());
		System.out.println(parcial2.desaprobado());
		System.out.println(juana.aprobado());
		System.out.println(juana.obtenerValor());
		
		parcial1.recuperar(6);
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.obtenerValor());
		
		parcial1.recuperar(2);
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.obtenerValor());
		
		System.out.println("Promociona?-------------------------------------");
		System.out.println(parcial1.promociona());
		System.out.println(juana.promociona());

	}

}
