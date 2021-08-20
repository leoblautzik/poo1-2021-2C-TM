package ejercicios.clase2;

public class Fecha {
	
	int fecha;
	
	public Fecha(int f) {
		if(esFechaValida(f))
			fecha = f;
	}
	
	private boolean esFechaValida(int f) {
		// TODO Auto-generated method stub
		return true;
	}

	int decimeTuDia() {
		return fecha % 100;
	}
	
	int decimeTuMes() {
		return fecha / 100 % 100;
	}
	
	int decimeTuAnio() {
		return fecha / 10000;
	}
	

	public String dateVuelta() {
		return ("dia " + decimeTuDia() +", mes " + decimeTuMes() +
				", año " + decimeTuAnio());
			
	}
	
	public static void main(String[] args) {
		Fecha hoy = new Fecha(20210813);
		Fecha mañana = new Fecha(20210814);
		
		
		System.out.println(hoy.dateVuelta());
		System.out.println(hoy.decimeTuDia());
		System.out.println(hoy.decimeTuMes());
		System.out.println(hoy.decimeTuAnio());
		
		System.out.println(mañana.dateVuelta());
		System.out.println(mañana.decimeTuDia());
		System.out.println(mañana.decimeTuMes());
		System.out.println(mañana.decimeTuAnio());
	}

}
