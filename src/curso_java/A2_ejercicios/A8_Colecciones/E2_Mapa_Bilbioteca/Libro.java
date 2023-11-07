package curso_java.A2_ejercicios.A8_Colecciones.E2_Mapa_Bilbioteca;

//Clase Libro:
//título, 
//el autor 
//y el número de copias disponibles.
//
//Implementa un constructor y métodos getter y setter para la clase Libro.

public class Libro {
	
//ATRIBUTOS
	private String titulo;
	private String autor;
	private int numCopias;
	
//MÉTODO CONSTRUCTOR
	public Libro(String titulo, String autor, int numCopias) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCopias = numCopias;
	}
	
//MÉTODO TO_STRING
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numCopias=" + numCopias + "]";
	}
	
//GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumCopias() {
		return numCopias;
	}
	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}
	
	

}
