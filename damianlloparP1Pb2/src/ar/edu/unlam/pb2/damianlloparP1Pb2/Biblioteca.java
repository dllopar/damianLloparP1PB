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
	
	public Integer cantidadDeLibros() {
		return listado.size();
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
	
	public Boolean verificarSiEstaUnLibroPrestado(Libro NombreABuscar) {
		Boolean buscado=false;
		for (Prestamo prestado : listadoPrestado) {
			if(prestado.getLibroPrestado().getNombre().equals(NombreABuscar.getNombre())) {
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
			listadoPrestado.add(new Prestamo(id, estudiante, libroPrestado));
			listado.remove(libroPrestado);
			sePresto=true;
		}
		return sePresto;
		
	}
	
	public Boolean devolverUnLibro(Libro libroDevuelto) {
		Boolean devuelto = false;
		
		if(this.verificarSiEstaUnLibroPrestado(libroDevuelto)) {
			listado.add(libroDevuelto);
			devuelto = true;
		}
		
		return devuelto;
		
	}
	
	public Boolean eliminarPrestamoDeLaLista(Prestamo prestado) {
		Boolean eliminado = false;
		for (Prestamo prestado2 : listadoPrestado) {
			if(prestado2.getLibroPrestado().getNombre().equals(prestado.getLibroPrestado().getNombre())) {
				listadoPrestado.remove(prestado);
				eliminado=true;
			}
		}
		
		return eliminado;
		
	}

}
