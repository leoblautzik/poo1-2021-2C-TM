package jugueteria;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Jugueteria {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private Set<String> nombres = new TreeSet<String>();
	private Queue<Empleado> listaDeEspera = new ArrayDeque<Empleado>();
	
	/* post: Agrega al empleado en la lista de empleados y su nombre 
	 * a la lista de nombres 
	 */
	public void agregarEmpleado( Empleado e) {
		empleados.add(e);
		agregarNombre(e);
	}

	/* post: Agrega el nombre del empleado al Set de nombres
	 * 
	 */
	private void agregarNombre(Empleado e) {
		// TODO Auto-generated method stub
		
	}
	
	/* post: (1) Devuelve el empleado al que se le entrega su juguete de regalo
	 * 
	 */
	public Empleado elegirEmpleadoAlAzar() {
		
		// TODO Auto-generated method stub
	}
	
	/*post: (2) Devuelve una lista con los posibles nombres de los nuevos juguetes
	 * 
	 */
	public  List<String> nombresDeNuevosJuguetes() {
		
		// TODO
	}
	
	/* post (3) Agrega al empleado a la lista de espera. 
	 * 
	 */
	
	public void ponerEnListaDeEspera(Empleado e) {
		
		// TODO
		
	}
	
	/* post: (3) Entrega entradas a todos los empleados en lista de espera
	 * 
	 */
	public void entregarEntradas() {
		
		// TODO
	}
	
	/* post: (5)  Entrega un archivo "nombresDeJuguetes.out" con los nobres obtenidos en el 
	 * punto (2)
	 */
	public void listarNombres(List<String> nombres) {
		
		// TODO
		
	}

}

class Empleado{
	
	private String nombre; 
	private String apellido;
	
	// TODO: Completar para que las estructuras definidas en 
	// Juguetería funcionen correctamente.  

}

