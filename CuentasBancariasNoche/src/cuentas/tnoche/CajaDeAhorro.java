package cuentas.tnoche;

public class CajaDeAhorro extends Cuenta{
	/*
	 * post: la instancia queda asignada al titular indicado
	 *
	 * y con saldo igual a 0.
	 */
	
	public CajaDeAhorro(String titularDeLaCuenta) {
		super(titularDeLaCuenta);
	}

	/*
	 * pre : monto es un valor mayor a 0 y menor o igual que el saldo de la
	 * Caja de Ahorro. 
	 * post: disminuye el saldo de la Caja de Ahorro según el monto extraido.
	 */
	@Override
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
