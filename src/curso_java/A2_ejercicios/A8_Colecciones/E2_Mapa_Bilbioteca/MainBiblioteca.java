package curso_java.A2_ejercicios.A8_Colecciones.E2_Mapa_Bilbioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import curso_java.A3_Utilidades.Utils;

public class MainBiblioteca {
//
//	Sistema de gestión de biblioteca en Java. 
//	Necesitas implementar un mapa para realizar un seguimiento 
//	de los libros disponibles en la biblioteca. 
//
//	Clase Libro:
//		título, 
//		el autor 
//		y el número de copias disponibles.
//		
//		Implementa un constructor y métodos getter y setter para la clase Libro.
//		
//	Clase Biblioteca:
//		+ nombre
//		+ HashMap donde la clave es el título del libro y 
//				el valor es una instancia de la clase Libro.
//		Implementa métodos para: 
//			agregar un libro a la biblioteca, 
//			prestar un libro (disminuyendo el número de copias disponibles) 
//			y devolver un libro (aumentando el número de copias disponibles).
//
//	Clase Principal:
//
//		Crea una clase principal que permite a los usuarios a partir de un menu
//		interactuar con el sistema de gestión de biblioteca.
//		
//		Permite a los usuarios agregar nuevos libros, prestar libros y devolver libros.
//		Imprime mensajes apropiados para informar a los usuarios 
//		sobre el estado de las operaciones 
//		(por ejemplo, si un libro ha sido prestado con éxito 
//		o si no hay suficientes copias disponibles).
	
	public static void main(String[] args) {

		MainBiblioteca bibliotecaCentral = new MainBiblioteca();
		Map<String, Libro> listaLibros = bibliotecaCentral.creaStock();
		bibliotecaCentral.abrirBiblioteca(listaLibros);
		
	

	}

	
	public void abrirBiblioteca (Map<String, Libro> listaLibros) {
		
		
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central", listaLibros);
		
		
		//MENU
		System.out.println(
				"\n\t\t--- MENU BIBLIOTECA ---\n"+
						"========================================================="+
						"\n   OPCIÓN 1: AGREGAR LIBRO A LA BIBLIOTECA"+
						"\n   OPCIÓN 2: PRESTAMO DE LIBRO"+
						"\n   OPCIÓN 3: DEVOLUCIÓN DE LIBRO"+
						"\n   OPCIÓN 4: SALIR"+
						"\n=========================================================" +
						"\n");

		int opcionMP = Utils.scanInt("\t\tSeleccione la opción deseada: ");
		switch(opcionMP) {
		case 1: //Agregar libro
			String tituloAAgregar = Utils.scanString("\nIntroduzca el título del libro ");
			String autor = Utils.scanString("\nIntroduzca el autor del libro ");
			int numLibros = Utils.scanInt("\nIntroduzca el numero de libros\n");
			Libro libroAgregado = new Libro(tituloAAgregar, autor, numLibros);
			biblioteca.agregarLibro(libroAgregado);
			break;
		
		case 2://Prestar libro
			String tituloAPrestar = Utils.scanString("\nIntroduzca el título del libro \n");
			biblioteca.prestarLibro(tituloAPrestar);
			break;
		
		case 3://Devolver libro
			String tituloADevolver = Utils.scanString("\nIntroduzca el título del libro \n");
			biblioteca.devolverLibro(tituloADevolver);
			break;
		
		case 4://Salir
			break;
			
		default: System.out.println("Opción incorrecta");
		}
	
		
		System.out.println("\nEl listado actual de libros en la biblioteca es: ");
		for (Libro libro : listaLibros.values()) {
			System.out.println(libro);
		}
	}
	
	
	public Map<String, Libro> creaStock () {
		Map<String, Libro> listaLibros = new HashMap<String, Libro>();
		
		Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 5);
		Libro libro2 = new Libro("La Celestina", "Fernando de Rojas", 2);
		Libro libro3 = new Libro("La Biblia", "Dios", 3);
		Libro libro4 = new Libro("Ensalada de pepino en colegio femenino", "Nacho Vidal", 8);
		Libro libro5 = new Libro("Kama sutra", "Vatsiaiana", 4);
		
		Collection<Libro> listado = new ArrayList<Libro>();
			listado.add(libro1);
			listado.add(libro2);
			listado.add(libro3);
			listado.add(libro4);
			listado.add(libro5);
			
		for ( Libro libro : listado) {
			listaLibros.put(libro.getTitulo(), libro);
		}
		
		
		return listaLibros;
	}
	
	
	public Map<String, Libro> creaStock (Collection<Libro> listado) {
		Map<String, Libro> listaLibros = new HashMap<String, Libro>();
		for ( Libro libro : listado) {
			listaLibros.put(libro.getTitulo(), libro);
		}
		return listaLibros;
	}
	

}
