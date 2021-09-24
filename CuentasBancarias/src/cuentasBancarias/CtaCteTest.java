package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CtaCteTest {

	CuentaCorriente ctaCte;

	@Before
	public void setUp() throws Exception {
		ctaCte = new CuentaCorriente("Juancho", 5000);
	}

	@Test
	public void consultarTitularTest() {

		String esperado = "Juancho";
		String obtenido = ctaCte.obtenerTitular();
		assertEquals(esperado, obtenido);

	}

	@Test
	public void depositarTest() {

		ctaCte.depositar(1000);
		double esperado = 1000;
		double obtenido = ctaCte.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);

	}
	
	@Test
	public void extraerYnoMeAlcanzaTest() {
		ctaCte.depositar(1000);
		ctaCte.extraer(1500);
		double esperado = 0;
		double obtenido = ctaCte.consultarSaldo();
		assertEquals(esperado, obtenido, 0.0001);
		assertTrue(ctaCte.extraer(1500));
	}
	@Test
	public void extraerYnoMeAlcanzaNiConDescTest() {
		ctaCte.depositar(1000);
		assertEquals(1000, ctaCte.consultarSaldo(), 0.0001);
		
		ctaCte.extraer(1500);
		
		assertEquals(0, ctaCte.consultarSaldo(), 0.0001);
		assertEquals(4500,ctaCte.getDescubierto(),0.01);
		
		ctaCte.extraer(4501);
		assertEquals(4500,ctaCte.getDescubierto(),0.01);
				
	}

}
