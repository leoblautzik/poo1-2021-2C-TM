package tragamonedas;

public class Tragamonedas {
	
	private Tambor t1;
	private Tambor t2;
	private Tambor t3;
		
	/*
	 * post: los 3 Tambores del Tragamonedas estan
	 *
	 * en la posición 1.
	 */
	public Tragamonedas() {
		t1 = new Tambor();
		t2 = new Tambor();
		t3 = new Tambor();
	}
	
	public String toString() {
		return 	"[" + t1.obtenerPosicion()+"]" +
				"[" + t2.obtenerPosicion()+"]" + 
				"[" + t3.obtenerPosicion()+"]"; 
	}
	

	/*
	 * post: activa el Tragamonedas haciendo girar
	 *
	 * sus 3 Tambores.
	 */
	public void activar() {
		this.t1.girar();
		this.t2.girar();
		this.t3.girar();
	}

	/*
	 * post: indica si el Tragamonedas entrega un premio
	 *
	 * a partir de la posición de sus 3 Tambores.
	 */
	public boolean entregaPremio() {
		return this.t1.obtenerPosicion() == t2.obtenerPosicion()
				&& t2.obtenerPosicion() == t3.obtenerPosicion();
	}
}
