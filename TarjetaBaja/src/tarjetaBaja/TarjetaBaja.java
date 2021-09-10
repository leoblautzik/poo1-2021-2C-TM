package tarjetaBaja;

public class TarjetaBaja {

	static final double VIAJE_EN_COLECTIVO = 20;
	static final double VIAJE_EN_SUBTE = 25;

	private double saldo;
	private double saldoNegativo = 60;

	private int contadorViajesEnColectivo = 0;
	private int contadorViajesEnSubte = 0;

	public TarjetaBaja(double monto) {
		this.saldo = monto;
	}

	public double obtenerSaldo() {
		return this.saldo ;
	}
	
	public double obtenerSaldoNegativo() {
		return this.saldoNegativo ;
	}

	public void cargar(double monto) {
		this.saldo += monto;

	}

	public void pagarViajeEnColectivo() {
		if (this.saldo >= VIAJE_EN_COLECTIVO) {
			this.saldo -= VIAJE_EN_COLECTIVO;
			this.contadorViajesEnColectivo++;
		} else if (this.saldo + this.saldoNegativo >= VIAJE_EN_COLECTIVO) {
			this.saldoNegativo -= VIAJE_EN_COLECTIVO - this.saldo;
			this.saldo = 0;
			this.contadorViajesEnColectivo++;
		}
		
	}

	public int contarViajesEnColectivo() {

		return this.contadorViajesEnColectivo;
	}

	public int contarViajes() {

		return this.contadorViajesEnColectivo + this.contadorViajesEnSubte;
	}

	public void pagarViajeEnSubte() {
		if (this.saldo >= VIAJE_EN_SUBTE) {
			this.saldo -= VIAJE_EN_SUBTE;
			this.contadorViajesEnSubte++;
		} else if (this.saldo + this.saldoNegativo >= VIAJE_EN_SUBTE) {
			this.saldoNegativo -= VIAJE_EN_SUBTE - this.saldo;
			this.saldo = 0;
			this.contadorViajesEnSubte++;
		}
		
	}

	public int contarViajesEnSubte() {
		return this.contadorViajesEnSubte;
	}

}
