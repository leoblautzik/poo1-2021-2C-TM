package cajaDeAhorro;

public class CajaDeAhorro {
	private String titularDeLaCuenta;
	double saldo = 0;
	
	/*
	 * post: la instancia queda asignada al titular indicado
	 *
	 * y con saldo igual a 0.
	 */
	public CajaDeAhorro(String titularDeLaCuenta) {
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

	/*
	 * pre : monto es un valor mayor a 0. post: aumenta el saldo de la Caja de
	 * Ahorro según el monto depositado.
	 */
	public void depositar(double monto) {
		
		if(monto <= 0)
			throw new Error("Monto inválido");
		this.saldo += monto;
		
	}

	/*
	 * pre : monto es un valor mayor a 0 y menor o igual que el saldo de la
	 * Caja de Ahorro. 
	 * post: disminuye el saldo de la Caja de Ahorro según el monto extraido.
	 */
	public boolean extraer(double monto) {
		if(monto <= 0)
			throw new Error("Monto inválido");
		if(monto <= this.saldo) {
			this.saldo -= monto;
			return true;
		}
		return false;
	}
}
