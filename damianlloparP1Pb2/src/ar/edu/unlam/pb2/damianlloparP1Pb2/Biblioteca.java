package ar.edu.unlam.pb2.damianlloparP1Pb2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String nombre;
	private List<Libro>listado;
	private List<Prestamo>listadoPrestado;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		listado = new ArrayList<>();
		listadoPrestado = new ArrayList<>();
	}

}
