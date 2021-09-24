package cuentas.tnoche;

public abstract class Cuenta {
	
	private String titularDeLaCuenta;
	double saldo = 0;

	public Cuenta(String titularDeLaCuenta) {
		super();
		this.titularDeLaCuenta = titularDeLaCuenta;
	}

	/*
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	public String obtenerTitular() {
		return this.titularDeLaCuenta;
	}
	
	/*
	 * post: devuelve el saldo de la Caja de Ahorro.
	 */
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		if (monto <= 0)
			throw new Error("Monto inválido");
		this.saldo += monto;
	}
	
	public abstract boolean extraer(double monto);
	
	
}
