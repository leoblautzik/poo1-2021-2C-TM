package videoClub;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class VideoClubTest {
	
	VideoCosa volverAlFuturo;
	VideoCosa rapidosYfuriosos; 
	
	@Before
	public void setUp() throws Exception {
		
		volverAlFuturo = new Pelicula("Volver al Futuro", 1985, Genero.Accion, "Robert Zemeckis");
		rapidosYfuriosos = new Pelicula("Rapidos y furiosos", 2001, Genero.Accion, "Rob Cohen");
		
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
	public void arrayDeVideoCosasTest() {
		VideoCosa [] cosas = new VideoCosa[2];
		cosas[0] = rapidosYfuriosos;
		cosas[1] = volverAlFuturo;
		
		for (VideoCosa videoCosa : cosas) {
			System.out.println(videoCosa);
		}
		
		Arrays.sort(cosas);
		System.out.println("---------------------");
		
		
		for (VideoCosa videoCosa : cosas) {
			System.out.println(videoCosa);
		}
		
	}
}
