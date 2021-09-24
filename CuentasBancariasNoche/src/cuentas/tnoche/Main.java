package cuentas.tnoche;

public class Main {

	public static void main(String[] args) {
		Cuenta ca = new CajaDeAhorro("pepe");
		ca.depositar(1000);
		Cuenta cc = new CuentaCorriente("nilda", 2000);
		cc.depositar(500);
		
		ca = cc; 
		
		System.out.println(ca.obtenerTitular());
		System.out.println(ca.consultarSaldo());
		
		ca.extraer(1500);
		
		System.out.println(ca.consultarSaldo());
		CuentaCorriente aux = (CuentaCorriente) ca;
		System.out.println(aux.obtenerDescubierto());
		

	}

}
