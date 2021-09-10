package cuentasBancarias;

public class CajaDeAhorro {
	
	String titular;
	double saldo;
	
	public CajaDeAhorro(String titular) {
	
		this.titular = titular;
		this.saldo = 0;
	}
	
	public String obtenerTitular() {
		
		return titular;
	}
	
	public double consultarSaldo() {
		
		return saldo;
	}
	
	public void depositar(double monto) {
		
		if(monto > 0) {
			saldo += monto;
		}
		else {
			throw new Error("Monto Inválido");
		}
	}

	public boolean extraer(double monto) {
		if(monto <= 0)
			throw new Error("Monto Inválido");
		
		if(monto <= saldo) {
			saldo -= monto;
			return true;
		}
		else {
			System.out.println("No te alcanza!! Jajajaja");
			return false;
		}
	}
	
	
	
}