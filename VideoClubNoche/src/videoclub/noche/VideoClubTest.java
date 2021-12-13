package videoclub.noche;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class VideoClubTest {
	
	Pelicula volverAlFuturo;
	Pelicula rapidosYfuriosos; 
	
	@Before
	public void setUp() throws Exception {
		
		volverAlFuturo = new Pelicula("Volver al Futuro", 1985, Genero.ACCION, "Robert Zemeckis");
		rapidosYfuriosos = new Pelicula("Rapidos y furiosos", 2001, Genero.ACCION, "Rob Cohen");
		
	}
	
	@Test
	public void crearPelisTest() {
		assertNotNull(volverAlFuturo);
		assertNotNull(rapidosYfuriosos);
		
		System.out.println(volverAlFuturo);
		System.out.println(rapidosYfuriosos);
		
	}

	
	@Test
	public void prestarPeliTest() {
		assertFalse(volverAlFuturo.isEntregado());
		volverAlFuturo.entregar();
		assertTrue(volverAlFuturo.isEntregado());
	
	}
	
	@Test
	public void devolverPeliTest() {
		assertFalse(volverAlFuturo.isEntregado());
		volverAlFuturo.entregar();
		assertTrue(volverAlFuturo.isEntregado());
		volverAlFuturo.devolver();
		assertFalse(volverAlFuturo.isEntregado());
		
	}
	
	
	
	@Test
	public void arrayDeVideGomasTest() {
		
		Pelicula [] cosas = new Pelicula[2];
		cosas[0] = rapidosYfuriosos;
		cosas[1] = volverAlFuturo;
		
		for (VideGoma videoCosa : cosas) {
			System.out.println(videoCosa);
		}
		
		Arrays.sort(cosas);
		
		System.out.println("---------------------");
		
		
		for (VideGoma videoCosa : cosas) {
			System.out.println(videoCosa);
		}
		
	}
	
}
