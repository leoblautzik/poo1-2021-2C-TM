package cuentas.tnoche;

public class CuentaCorriente extends Cuenta {

	private double descubierto;

	/*
	 * post: la instancia queda asignada al titular indicado con saldo igual a 0 y
	 * con el descubierto que se pasa por parámetro
	 */

	public CuentaCorriente(String titularDeLaCuenta, double descubierto) {
		super(titularDeLaCuenta);
		this.descubierto = descubierto;

	}

	/*
	 * pre : monto es un valor mayor a 0 y menor o igual que el saldo de la Cuenta
	 * Corriente. post: disminuye el saldo y el descubierto de la Cuenta Corriente,
	 * según el monto extraido.
	 */
	@Override
	public boolean extraer(double monto) {
		if (monto <= 0)
			throw new Error("Monto inválido");

		if (monto <= this.saldo) {
			this.saldo -= monto;
			return true;
		} else if (monto <= this.saldo + this.descubierto) {
			this.descubierto = saldo + descubierto - monto;
			this.saldo = 0;
			return true;

		} else
			return false;
	}

	public double obtenerDescubierto() {
		return this.descubierto;
	}

}
