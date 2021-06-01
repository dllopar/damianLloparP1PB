package ar.edu.unlam.pb2.damianlloparP1Pb2;

public class Estudiante {

	// De los estudiantes interesa saber DNI, apellido y nombre

	private Integer dni;
	private String apellido;
	private String nombre;

	public Estudiante(Integer dni, String apellido, String nombre) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

}
