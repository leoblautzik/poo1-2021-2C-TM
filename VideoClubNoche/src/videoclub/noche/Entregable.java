package videoclub.noche;

public interface Entregable extends Comparable<Entregable>{
	
	void entregar();
	void devolver();
	boolean isEntregado();
	
}
