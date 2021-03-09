package edu.pingpong.isp;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

	@Test
	public void simpleTest() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.nueva("Aguila");
		procesador.nueva("laureada");
		procesador.nueva("sobrevuela");
		procesador.nueva("el");
		procesador.nueva("mar");
		
		assertEquals("Aguila laureada sobrevuela el mar", procesador.texto());
	}
	
	@Test
	public void idiomaTest() {
		
		ProcesadorTextoCompleto procesador = new ProcesadorTextoCompleto();
		
		procesador.nueva("El");
		procesador.nueva("camino");
		
		assertEquals("El camino", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
