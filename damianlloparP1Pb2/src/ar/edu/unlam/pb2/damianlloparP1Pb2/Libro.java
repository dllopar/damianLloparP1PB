package ar.edu.unlam.pb2.damianlloparP1Pb2;

public class Libro {
	
	//De los libros interesa registrar código, nombre y autor.
	
	private Integer codigo;
	private String nombre;
	private String autor;
	
	public Libro(Integer codigo, String nombre, String autor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	
	


}
