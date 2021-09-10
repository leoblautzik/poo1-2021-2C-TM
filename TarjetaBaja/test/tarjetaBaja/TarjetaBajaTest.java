package tarjetaBaja;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TarjetaBajaTest {

	TarjetaBaja tb;

	@Before
	public void setUp() throws Exception {
		tb = new TarjetaBaja(500.00);
		
	}

	@Test
	public void crearTarjetaTest() {
		assertNotNull(tb);

	}

	@Test
	public void obtenerSaldoTest() {
		double esperado = 500.00;
		double obtenido = tb.obtenerSaldo();

	}

	@Test
	public void cargarTest() {
		tb.cargar(500);
		double esperado = 1000.00;
		double obtenido = tb.obtenerSaldo();
		assertEquals(esperado, obtenido, 0.01);
	}

	@Test
	public void pagarViajeEnColectivoTest() {
		tb.pagarViajeEnColectivo();
		double saldoEsperado = 500 - TarjetaBaja.VIAJE_EN_COLECTIVO;

		assertEquals(saldoEsperado, tb.obtenerSaldo(), 0.01);
		assertEquals(1, tb.contarViajesEnColectivo());
		assertEquals(1, tb.contarViajes());

	}

	@Test
	public void pagarViajeEnSubteTest() {
		tb.pagarViajeEnSubte();
		double saldoEsperado = 500 - TarjetaBaja.VIAJE_EN_SUBTE;

		assertEquals(saldoEsperado, tb.obtenerSaldo(), 0.01);
		assertEquals(1, tb.contarViajesEnSubte());
		assertEquals(1, tb.contarViajes());

	}

	@Test
	public void pagarDosViajes() {
		tb.pagarViajeEnSubte();
		tb.pagarViajeEnColectivo();
		double saldoEsperado = 500 - TarjetaBaja.VIAJE_EN_SUBTE - TarjetaBaja.VIAJE_EN_COLECTIVO;

		assertEquals(saldoEsperado, tb.obtenerSaldo(), 0.01);
		assertEquals(1, tb.contarViajesEnSubte());
		assertEquals(1, tb.contarViajesEnColectivo());
		assertEquals(2, tb.contarViajes());

	}

	@Test
	public void pagar20ViajesSubte() {
		for (int i = 0; i < 25; i++)
			tb.pagarViajeEnSubte();
		assertEquals(0, tb.obtenerSaldo(), 0.01);
		
	}
	
	@Test
	public void pagarConSaldoNegativoViajesColectivo() {
		TarjetaBaja tPobre = new TarjetaBaja(10);
		tPobre.pagarViajeEnColectivo();
		assertEquals(0, tPobre.obtenerSaldo(), 0.01);
		double esperado = 50;
		assertEquals(esperado, tPobre.obtenerSaldoNegativo(), 0.01);
		tPobre.pagarViajeEnColectivo();
		tPobre.pagarViajeEnColectivo();
		assertEquals(10, tPobre.obtenerSaldoNegativo(), 0.01);
		tPobre.pagarViajeEnColectivo();
		assertEquals(10, tPobre.obtenerSaldoNegativo(), 0.01);
	}
	
	

}
