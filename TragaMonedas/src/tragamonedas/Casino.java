package tragamonedas;

public class Casino {

	private static final double VALOR_FICHIN = 5;
	private static final double PREMIO = 200;

	public static void main(String[] args) {
		Tragamonedas tg = new Tragamonedas();
				
		juegoHastaGanar(tg);
		
		System.out.println("--------------------------");
		
		Tragamonedas gastaTodo = new Tragamonedas();
		
		juega100Fichines(gastaTodo);
		

	}

	private static void juega100Fichines(Tragamonedas gastaTodo) {
		double inversion;
		int contadorDePremios = 0;

		for (int i = 1; i <= 100; i++) {
			gastaTodo.activar();
			if (gastaTodo.entregaPremio())
				contadorDePremios++;
		}
		inversion = 100 * VALOR_FICHIN;
		double premios = PREMIO * contadorDePremios;
		System.out.println(inversion);
		if (inversion < premios)
			System.out.println("Ganaste: " + (premios - inversion));
		else
			System.out.println("Perdiste JAJAJA: " + (inversion - premios));
	}

	private static void juegoHastaGanar(Tragamonedas tg) {
		tg.activar();
		int contadorDeFichines = 1;
		while (!tg.entregaPremio()) {
			tg.activar();
			contadorDeFichines++;
		}
		System.out.print("Display: ");
		 System.out.println(tg);
		System.out.println("Con " + contadorDeFichines + " fichines");
		double inversion = VALOR_FICHIN * contadorDeFichines;
		System.out.println("Inversión: " + inversion);
		if (inversion < PREMIO)
			System.out.println("Ganaste: " + (PREMIO - inversion));
		else
			System.out.println("Perdiste JAJAJA: " + (inversion - PREMIO));
	}

}
