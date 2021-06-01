package ar.edu.unlam.pb2.damianlloparP1Pb2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.damianlloparP1Pb2.Biblioteca;
import ar.edu.unlam.pb2.damianlloparP1Pb2.Libro;

public class BibliotecaTest {

	@Test
	public void testQueAgregaUnNuevoLibroALaLista() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		
		assertTrue(nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina));
	}
	
	public void testQueUnEstudianteSoloPuedaPedirHastaDosLibros() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		
	}
	
	public void testQueVerificaCuantosLibrosPidioUnEstudiante() {
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro laHistoriaArgentina = new Libro(1, " La historia Argentina", "Felipe Piña");
		Libro geografiaMundial = new Libro(2, " Geografia Mundial", "Felix Luna");
		Libro MatematicasPaenza = new Libro(3, " Matematicas, estas ahi?", "Adrian Paenza");
		
		nacional.ingresarLibroALaBiblioteca(MatematicasPaenza);
		nacional.ingresarLibroALaBiblioteca(geografiaMundial);
		nacional.ingresarLibroALaBiblioteca(laHistoriaArgentina);
		
		nacional
		
	}
	
	
}
