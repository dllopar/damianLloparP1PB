package ar.edu.unlam.pb2.damianlloparP1Pb2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.damianlloparP1Pb2.Biblioteca;
import ar.edu.unlam.pb2.damianlloparP1Pb2.Estudiante;
import ar.edu.unlam.pb2.damianlloparP1Pb2.Libro;

public class BibliotecaTest {

	@Test
	public void testQueAgregaUnNuevoLibroALaLista() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		
		assertTrue(nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina));
	}
	@Test
	public void testQueUnEstudianteSoloPuedaPedirHastaDosLibros() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		Estudiante martin = new Estudiante(2222, "Lopez", "Nombre");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		nacional.prestarUnLibro(3, martin, MatematicasPaenza);
		nacional.prestarUnLibro(2, martin, geografiaMundial);
		nacional.prestarUnLibro(1, martin, laHistoriaArgentina);
		
		Integer esperado= 3;
		Integer actual = nacional.verificarCantidadDeLibrosPedidosPorUnEstudiante(martin);
		assertEquals(esperado, actual);
		
		
	}
	@Test
	public void testQueVerificaQueUnEstudiantePuedaPedirUnLibro() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		Estudiante martin = new Estudiante(2222, "Lopez", "Nombre");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		assertTrue(nacional.prestarUnLibro(1, martin, MatematicasPaenza));
		
	}
	
	@Test
	public void testQueVerificaQueNoSePuedePrestarUnLibroQueEstaPedido() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		Estudiante martin = new Estudiante(2222, "Lopez", "Martin");
		Estudiante carla = new Estudiante(2222, "Martinez", "Carla");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		nacional.prestarUnLibro(1, martin, MatematicasPaenza);
		
		assertFalse(nacional.verificarSiEstaUnLibro(MatematicasPaenza));
		
	}
	
	@Test
	public void testQueVerificaSiSeSacaDelListadoUnLibroPrestado() {
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		Estudiante martin = new Estudiante(2222, "Lopez", "Martin");
		Estudiante carla = new Estudiante(2222, "Martinez", "Carla");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		nacional.prestarUnLibro(1, martin, MatematicasPaenza);
		
		Integer esperado = 2;
		Integer actual = nacional.cantidadDeLibros();
		
		assertEquals(esperado, actual);
	}
	
	
}
