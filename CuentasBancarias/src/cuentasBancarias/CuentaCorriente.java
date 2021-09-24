package cuentasBancarias;

public class CuentaCorriente extends Cuenta {

	public double getDescubierto() {
		return descubierto;
	}

	private double descubierto;
	
	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		if(descubierto <= 0)
			throw new Error("Importe inválido");
		this.descubierto = descubierto;
	}
	
	@Override
	public boolean extraer(double monto) {
		if(monto <= 0)
			throw new Error("Monto Inválido");
		
		if(monto <= saldo) {
			saldo -= monto;
			return true;
		}
		else {
			if(monto <= saldo + descubierto) {
				
				this.descubierto -= (monto - saldo);
				//    5000             1500   1000
				//    4500 
				this.saldo = 0;
				return true;
			}
			else {
				System.out.println("No te alcanza ni con el descubierto");
				return false;
			}
				
			
		}
	}
	
	

}
