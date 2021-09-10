package tragamonedas;

public class CasinoNocturno {

	private static final double VALOR_FICHIN = 5;
	private static final double PREMIO = 150;

	public static void main(String[] args) {

		Tragamonedas tg = new Tragamonedas();
		int contador = 1;
		tg.activar();

		while (!tg.entregaPremio()) {
			contador++;
			tg.activar();
		}
		System.out.println(contador);
		System.out.println(PREMIO - contador * VALOR_FICHIN);
		System.out.println(tg);

		System.out.println("-----------------------------------------");

		Tragamonedas juega100 = new Tragamonedas();
		double premio = 0;

		for (int i = 1; i <= 100; i++) {
			juega100.activar();
			if (juega100.entregaPremio()) {
				System.out.println(juega100);
				premio += PREMIO;
			}

		}
		System.out.println(premio - 500);

	}

}
