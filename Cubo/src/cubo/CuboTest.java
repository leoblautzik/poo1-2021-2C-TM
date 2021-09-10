package cubo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuboTest {
	Cubo cubito;
	
	@Before
	public void setUp() throws Exception {
		cubito = new Cubo();
		cubito.cambiarLongitudLado(5);
	}

	@Test
	public void crearCuboTest() {
		assertNotNull(cubito);
	}
	
	@Test
	public void ladoCuboTest() {
		assertEquals(5, cubito.medirLongitudLado(),0);
	}
	
	@Test
	public void cambiarladoCuboTest() {
		cubito.cambiarLongitudLado(4);
		assertEquals(4, cubito.medirLongitudLado(),0);
	}
	
	@Test(expected = Error.class)
	public void cambiarladoNegativoCuboTest() {
		cubito.cambiarLongitudLado(-4);
	}
	
	@Test
	public void superficieCaraCuboTest() {
		assertEquals(25, cubito.medirSuperficieCara(),0);
	}
	
	@Test
	public void cambiarSuperficieCaraCuboTest() {
		cubito.cambiarSuperficieCara(21);
		assertEquals(21, cubito.medirSuperficieCara(),0);
	}
	
	@Test
	public void medirVolumenCuboTest() {
		
		assertEquals(125, cubito.medirVolumen(),0);
	}
	@Test
	public void cambiarVolumenCuboTest() {
		cubito.cambiarVolumen(100);
		assertEquals(100, cubito.medirVolumen(),0.000000001);
	}

}
