package ar.edu.unlam.pb2.damianlloparP1Pb2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String nombre;
	private List<Libro>listado;
	private List<Prestamo>listadoPrestado;
	private Prestamo nuevoPrestamo;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		listado = new ArrayList<>();
		listadoPrestado = new ArrayList<>();
		nuevoPrestamo=null;
	}
	
	public Boolean ingresarLibroALaBiblioteca(Libro libroNuevo) {
		
		return listado.add(libroNuevo);
	}
	
	public Boolean pedirUnPrestamosDeLibro(Libro libroAPrestar) {
		Boolean sePresto = false;
		if(this.verificarSiEstaUnLibro(libroAPrestar)) {
			listado.remove(libroAPrestar);
			sePresto=true;
		}
		
		return sePresto;
		
	}
	
	public Boolean verificarSiEstaUnLibro(Libro NombreABuscar) {
		Boolean buscado=false;
		for (Libro libro : listado) {
			if(libro.getNombre().equals(NombreABuscar.getNombre())) {
				buscado=true;
			}
		}
		return buscado;
	}
	
	public Integer verificarCantidadDeLibrosPedidosPorUnEstudiante(Estudiante estudiante) {
		Integer contador=0;
		for (Prestamo prestado : listadoPrestado) {
			if(prestado.getEstudiante().getDni().equals(estudiante.getDni())) {
				contador++;
			}
		}
		return contador;
		
	}
	
	public Boolean prestarUnLibro(Integer id, Estudiante estudiante, Libro libroPrestado) {
		Boolean sePresto=false;
		if(this.verificarSiEstaUnLibro(libroPrestado)&&this.verificarCantidadDeLibrosPedidosPorUnEstudiante(estudiante)<=2) {
			
		}
		return null;
		
	}

}
