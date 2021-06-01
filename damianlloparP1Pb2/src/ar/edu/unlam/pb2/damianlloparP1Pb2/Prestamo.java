package ar.edu.unlam.pb2.damianlloparP1Pb2;

public class Prestamo {

	// Cada préstamo tendrá un identificador único, alumno y libro involucrados.

	private Integer id;
	private Estudiante estudiante;
	private Libro libroPrestado;

	public Prestamo(Integer id, Estudiante estudiante, Libro libroPrestado) {
		super();
		this.id = id;
		this.estudiante = estudiante;
		this.libroPrestado = libroPrestado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Libro getLibroPrestado() {
		return libroPrestado;
	}

	public void setLibroPrestado(Libro libroPrestado) {
		this.libroPrestado = libroPrestado;
	}

}
