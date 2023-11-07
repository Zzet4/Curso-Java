package curso_java.A2_ejercicios.A8_Colecciones.E2_Mapa_Bilbioteca;

import java.util.Collection;
import java.util.Map;

//Clase Biblioteca:
//+ nombre
//+ HashMap donde la clave es el título del libro y 
//		el valor es una instancia de la clase Libro.
//Implementa métodos para: 
//	agregar un libro a la biblioteca, 
//	prestar un libro (disminuyendo el número de copias disponibles) 
//	y devolver un libro (aumentando el número de copias disponibles).

public class Biblioteca {
	
//ATRIBUTOS
	private String nombre;
	private Map<String, Libro> listaLibros;
	
//MÉTODO CONSTRUCTOR
	public Biblioteca(String nombre, Map<String, Libro> listaLibros) {
		super();
		this.nombre = nombre;
		this.listaLibros = listaLibros;
	}
	
//MÉTODO TO_STRING
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", infoLibro=" + listaLibros + "]";
	}
	
//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<String, Libro> getInfoLibro() {
		return listaLibros;
	}
	public void setInfoLibro(Map<String, Libro> infoLibro) {
		this.listaLibros = infoLibro;
	}
	
	
//MÉTODOS PARA UTILIDADES.
	
	public void agregarLibro (Libro libro) {
		this.listaLibros.put(libro.getTitulo(), libro);		
		
	}
	
	public void prestarLibro(String titulo) {
		
		if (this.listaLibros.containsKey(titulo)) {
			Libro libroPedido = this.listaLibros.get(titulo);
			if(libroPedido.getNumCopias()>0) {
				libroPedido.setNumCopias(libroPedido.getNumCopias()-1);
				System.out.println("Se va a prestar el libro " + libroPedido.getTitulo()
				+ " " +  "Del autor: " + libroPedido.getAutor());
				System.out.println("El número de copias que quedan disponibles tras el préstamo es de: "
						+ libroPedido.getNumCopias());
			}else {
				libroPedido.setNumCopias(0);
				System.out.println("Lo sentimos, tenemos " + libroPedido.getNumCopias() + " copias de este libro");
			}	
		}
		
	}
	public void devolverLibro(String titulo) {
		
		if (this.listaLibros.containsKey(titulo)) {
			Libro libroDevuelto = this.listaLibros.get(titulo);
			libroDevuelto.setNumCopias(libroDevuelto.getNumCopias()+1);
			System.out.println("Gracias por utilizar la biblioteca, espero que haya disfrutado "
					+ "de la lectura.");
			System.out.println("El stock actual del libro tras la devolución es: " + libroDevuelto.getNumCopias());
		}else {System.out.println("Lo siento, no consta en nuestra base de datos este libro");}
		
	}
	

}
