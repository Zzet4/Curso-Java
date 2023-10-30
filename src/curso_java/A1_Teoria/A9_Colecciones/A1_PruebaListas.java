package curso_java.A1_Teoria.A9_Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import curso_java.A1_Teoria.A9_Colecciones.A0_ClaseDePrueba.Lapiz;


public class A1_PruebaListas {

	public static void main(String[] args) {
		
		
		//Creación de una lista, es como un array pero no tiene tamaño definido ya que este es variable
		ArrayList lista1 = new ArrayList();
		//ArrayList es una clase que implementa la interface List que a su vez hereda de la interface collection
		
		
		lista1.add("Palabra1");
		lista1.add("Palabra2");
		lista1.add("Palabra3");
		lista1.add(1);		
		lista1.add(new Lapiz("Rosa", 1));
		
		//Todas las colecciones tienen el metodo add ya que implementan la interface collection y como podemos observar
		//podemos añadir a la lista cualquier tipo de dato; Strings, num, incluso otros objetos...
		
		
		for (Object object : lista1) {
			System.out.println(object);
			if (object instanceof Lapiz) {	
				System.out.println();
			}
		}
		
		
		// Con un bucle foreach podemos recorrer la lista pero debemos entender que se declara una variable del tipo Objects
		// Esto se debe a que la lista tiene objetos y variables de muchos tipos distintos por lo que utiliza la clase más genérica de todas
		// para poder agruparlos
		
		//Dentro del bucle deberíamos hacer un cast para poder especificarle a Java que el objeto del cual queremos recuperar un método
		// es del tipo correcto y no de "Objects", es decir debemos convertirlo para poder usar sus métods. Para evitar tener que hacer esto
		// tenemos las listas de tipo genérico:
		
		//Imaginemos una nueva lista donde sabemos a ciencia cierta que solo hay objetos de tipo Lapiz.
		//Posemos utilizar las listas de tipo genérico especificando entre símbolos <> el tipo de objeto que contiene dicha lista
		
		ArrayList <Lapiz> lista2 = new  ArrayList<Lapiz>();
		lista2.add(new Lapiz("Rojo", 1));
		lista2.add(new Lapiz("Verde", 1));
		lista2.add(new Lapiz("Azul", 1));
		lista2.add(new Lapiz("Amarillo", 1));
		
		//podemos indicar la posición en la que queramos insertar el objeto haciendo que todos los siguientes se desplacen automáticamente
		//una posición.
		lista2.add(2, new Lapiz("Morado", 1));
		
		//De esta manera la lista ya reconoce los objetos en su interior como de tipo Lapiz.
		//Incluso podríamos crear listas de listas, donde cada posición de la lista guardara una nueva lista de objetos.
		
		ArrayList<ArrayList<Lapiz>> lista3 = new  ArrayList<ArrayList<Lapiz>>(); 
		
		
		
		
		//Si queremos recuperar el tamaño de una lista o el número de elementos que tiene utilizaremos el método size();
			System.out.println(lista1.size());
		
		//Si queremos recuperar una posicion de la lista  utilizaremos el método get(0);
			System.out.println(lista1.get(2));
			
		//Si queremos eliminar posiciones de una lista utilizaremos el método remove();
			System.out.println(lista1.remove(2));
		
		//Si queremos limpiar todas las posiciones de una lista utilizaremos el método clear();
			lista1.clear();
		
		//Si queremos saber si una lista está vacía utilizaremos el método isEmpty();
			
			if(lista2.isEmpty()) {
				System.out.println("La lista esta vacía");
			}else {
				System.out.println("La lista tiene algo");
			}
			
			
		//Si queremos consultar si alguna posicion de la lista contiene un objeto debemos saber que ese objeto tiene que
		// estar previamente asociado a una variable para poder hacer referencia a este. Utilizamos el método .contains():
			Lapiz lapicero = new Lapiz("Naranja", 1);
			lista2.add(lapicero);
			System.out.println(lista2.contains(lapicero)); //Esto es true.
			
			
		//Podemos coger una lista y sacar una sublista de esta con el método .subList():
			List<Lapiz> sublista2A = lista2.subList(0, 3);
			//Esta opción nos habilita para hacer un borrado selectivo con la siguiente linea
			lista2.removeAll(lista2.subList(2, 4)); //El método removeAll(collection) necesita como parametro una colección, en este caso	
													//la sublista que creamos en el mismo parametro.
		//Esta forma de borrar no solo borra la sublista si no que borra todos los objetos de la lista original (lista2) que coincidan
		// con la sublista. Es decir, desaparecen de los dos sitios.
			
		
			
			
		//Iterator.........para recorrel la lista desde la posicion 0
			Iterator<Lapiz> ite = lista2.iterator();
			
			while(ite.hasNext()) {
				Lapiz lapiz1 = ite.next();
				System.out.println(lapiz1.getColor());
				Lapiz lapiz2 = ite.next();
				System.out.println(lapiz2.getColor());
			}
			
			
		//Podemos convertir un array a una lista con la clase Arrays y su método asList() pasándole como parametro el array que queremos convertir
			
System.out.println("=================================================================================");
			
			String[] arrayNombres = new String[3];
				arrayNombres[0] = "jose";
				arrayNombres[0] = "pepe";
				arrayNombres[0] = "juan";
				
				
			List<String> arrayList = Arrays.asList(arrayNombres);
			
			for (String nombre : arrayList) {
				System.out.println(nombre);
			}
			
			
		
	}

}
