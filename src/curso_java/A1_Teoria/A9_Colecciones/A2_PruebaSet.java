package curso_java.A1_Teoria.A9_Colecciones;

import java.util.HashSet;
import java.util.Set;

import curso_java.A1_Teoria.A9_Colecciones.A0_ClaseDePrueba.Lapiz;


public class A2_PruebaSet {

	public static void main(String[] args) {
		
		//Creamos un Set de tipo Lapiz pero vamos a comprobar como no deja guardar el mismo objeto varias veces al contrario que las listas
		// OJO: hemos creado un objeto de tipo HashSet declarado bajo una variable (lapices) que apunta a la interfaz Set
		Set<Lapiz> lapices = new HashSet<Lapiz>();
	
		Lapiz lapizStanley = new Lapiz("Stanley", 2);
		
		lapices.add(lapizStanley);
		lapices.add(lapizStanley);
		lapices.add(lapizStanley);
		lapices.add(lapizStanley);
		 System.out.println(lapices.size()); //El tamaño devuelve 1 por que es un Set no una lista y al añadir 4 veces el mismo objeto
		 									 // solo lo guarda una vez.
		 
	
		 
		 
		 //Si metemos detro de un Sysout una insercion en lista o en Set nos devolverá true o false en funcion de si ha insertado o no.
		 // de esta manera si añado dos objetos iguales, la primera inserción devolverá true pero la segunda devolverá false
		 
		 Lapiz lapizAlpino = new Lapiz("Alpino", 2);
		 
		 System.out.println(lapices.add(lapizAlpino));
		 System.out.println(lapices.add(lapizAlpino));
		 
		 
		 //Los set no guardan los objetos en el orden en el que nosotros los vamos guardando.
		 //Los coloca segun su propio criterio basandose en un mecanismo interno de generación de hashes
		 
		 
	}
}
