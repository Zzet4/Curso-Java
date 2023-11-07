package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO;

import java.sql.SQLException;

public class Libro1 {
	
	
//ATRIBUTOS
	private int idLibro;
	private String nombreLibro;
	private String autor;
	private int isbn;
	private String descripcion;
	private int numBiblioteca;
	

//CONSTRUCTOR
	public Libro1(int idLibro, String nombreLibro, String autor, int isbn, String descripcion, int numBiblioteca) {
		super();
		this.idLibro = idLibro;
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.isbn = isbn;
		this.descripcion = descripcion;
		this.numBiblioteca = numBiblioteca;
	}

	
//GETTERS & SETTERS
	public String getNombreLibro() {
		return nombreLibro;
	}

	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumBiblioteca() {
		return numBiblioteca;
	}

	public void setNumBiblioteca(int numBiblioteca) {
		this.numBiblioteca = numBiblioteca;
	}

//MÉTODO TO STRING
	@Override
	public String toString() {
		return "Libro1 [idLibro=" + idLibro + ", nombreLibro=" + nombreLibro + ", autor=" + autor + ", isbn=" + isbn
				+ ", descripcion=" + descripcion + ", numBiblioteca=" + numBiblioteca + "]";
	}


	
	

}
