package junit5;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

class GestorCocheTest {

	
	@SuppressWarnings("restriction")
	@Test
	void testObtenerPorId() 
	{
		GestorCoche gc = new GestorCoche();
		Coche obtenido = gc.obtenerPorId(2);
		assertEquals(2,obtenido.getId());
		assertEquals(69.0,obtenido.getKilometros(),0.0);
		assertEquals("Ford",obtenido.getMarca());
		assertEquals("Fiesta",obtenido.getModelo());
		assertEquals("FFFF123",obtenido.getMatricula());
	}

}
