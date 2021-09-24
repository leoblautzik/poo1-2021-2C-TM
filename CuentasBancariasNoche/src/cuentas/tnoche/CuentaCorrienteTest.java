package cuentas.tnoche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuentaCorrienteTest {

	CuentaCorriente miCtaCte;

	@Before
	public void setUp() throws Exception {
		miCtaCte = new CuentaCorriente("Juana", 5000);
	}

	@Test
	public void creoCajaDeAhorroTest() {
		
		assertNotNull(miCtaCte);
	}

	@Test
	public void obtenerTitularTest() {

		String esperado = "Juana";
		String obtenido = miCtaCte.obtenerTitular();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void consultarSaldoTest() {
		assertEquals(0, miCtaCte.consultarSaldo(), 0.01);
	}
	
	@Test
	public void depositarTest() {
		miCtaCte.depositar(1000);
		assertEquals(1000, miCtaCte.consultarSaldo(), 0.01);
	}
	
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		miCtaCte.depositar(-100);
	}
	
	@Test
	public void extraerTest() {
		miCtaCte.depositar(1000);
		miCtaCte.depositar(2500);
		miCtaCte.extraer(2800);
		double esperado = 1000 + 2500 - 2800;
		assertEquals(esperado, miCtaCte.consultarSaldo(), 0.01);
		
	}
	@Test
	public void extraerJustitoTest() {
		miCtaCte.depositar(1000);
		miCtaCte.depositar(2500);
		assertTrue(miCtaCte.extraer(3500));
		assertEquals(0, miCtaCte.consultarSaldo(), 0.01);
	}
	
	@Test
	public void extraerInsuficienteTest() {
		miCtaCte.depositar(1000);
		miCtaCte.depositar(2500);
		assertTrue(miCtaCte.extraer(4500));
		assertEquals(0, miCtaCte.consultarSaldo(), 0.01);
		assertEquals(4000, miCtaCte.obtenerDescubierto(), 0.001);
		
	}

	@Test(expected = Error.class)
	public void extraerMontoNegativoTest() {
		miCtaCte.extraer(-1000);
	}
	
}
