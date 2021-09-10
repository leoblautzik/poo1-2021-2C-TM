package cajaDeAhorro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CajaDeAhorroTest {

	CajaDeAhorro miCuentaAhorro;

	@Before
	public void setUp() throws Exception {
		miCuentaAhorro = new CajaDeAhorro("Juana");
	}

	@Test
	public void creoCajaDeAhorroTest() {
		CajaDeAhorro miCuentaAhorro = new CajaDeAhorro("Juana");
		assertNotNull(miCuentaAhorro);
	}

	@Test
	public void obtenerTitularTest() {

		String esperado = "Juana";
		String obtenido = miCuentaAhorro.obtenerTitular();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void consultarSaldoTest() {
		assertEquals(0, miCuentaAhorro.consultarSaldo(), 0.01);
	}
	
	@Test
	public void depositarTest() {
		miCuentaAhorro.depositar(1000);
		assertEquals(1000, miCuentaAhorro.consultarSaldo(), 0.01);
	}
	
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		miCuentaAhorro.depositar(-100);
	}
	
	@Test
	public void extraerTest() {
		miCuentaAhorro.depositar(1000);
		miCuentaAhorro.depositar(2500);
		miCuentaAhorro.extraer(2800);
		double esperado = 1000 + 2500 - 2800;
		assertEquals(esperado, miCuentaAhorro.consultarSaldo(), 0.01);
		
	}
	@Test
	public void extraerJustitoTest() {
		miCuentaAhorro.depositar(1000);
		miCuentaAhorro.depositar(2500);
		assertTrue(miCuentaAhorro.extraer(3500));
		assertEquals(0, miCuentaAhorro.consultarSaldo(), 0.01);
	}
	
	@Test
	public void extraerInsuficienteTest() {
		miCuentaAhorro.depositar(1000);
		miCuentaAhorro.depositar(2500);
		assertFalse(miCuentaAhorro.extraer(4500));
		assertEquals(3500, miCuentaAhorro.consultarSaldo(), 0.01);
		
	}

	@Test(expected = Error.class)
	public void extraerMontoNegativoTest() {
		miCuentaAhorro.extraer(-1000);
	}
	
}
