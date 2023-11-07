package A9_Ejercicios_Mapas.Ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso_java.A2_ejercicios.A6_POO.A1_POO.Alumno;
import curso_java.A2_ejercicios.A8_Colecciones.E1_Colecciones.A1_PruebaAlumnos;
import curso_java.A3_Utilidades.Utils;

public class Mapa1 {

	/*
	 * 
	 * Vamos a crear 4 objetos de tipo alumno
	 * Creamos un mapa(cole) donde la clave sea el DNI del alumno y el valor sea el objeto alumno
	 *  - A partir del DNI mirar si el alumno esta en el mapa y si está devolver su info
	 *  - Devolver la nota media de todos los alumnos
	 *  - Mostrar la información de todos los alumnos del colegio.
	 * 
	 * ================================== OPCIONAL 1 =========================================
	 * Creamos otro mapa donde la clave es el nombre del colegio y el valor es el listado de alumnos.
	 *  - Mostrar el nombre de cada colegio con todos sus alumnos.
	 *  - Solicitamos un DNI y le indicaremos en que colegio está ese alumno, si no esta, mensaje de error.
	 *  
	 * ================================== OPCIONAL 2 =========================================
	 *  
	 * 
	 */
	

	public static void main(String[] args) {
	
		Mapa1 abreCole = new Mapa1();
		abreCole.creaColes();
		

	
		

	}

	
	public void creaColes() {
		Alumno alumno1 = new Alumno("Nombre1", "Apellido1", "111 A", 6);
		Alumno alumno2 = new Alumno("Nombre2", "Apellido2", "222 A", 6);
		Alumno alumno3 = new Alumno("Nombre3", "Apellido3", "333 A", 4);
		Alumno alumno4 = new Alumno("Nombre4", "Apellido4", "444 A", 4);
		Map<String, Alumno> cole1 = new HashMap<String, Alumno>();
			cole1.put("111 A", alumno1);
			cole1.put("222 A", alumno2);
			cole1.put("333 A", alumno3);
			cole1.put("444 A", alumno4);
			
			
		Alumno alumno5 = new Alumno("Nombre5", "Apellido5", "555 A", 8);
		Alumno alumno6 = new Alumno("Nombre6", "Apellido6", "666 A", 8);
		Alumno alumno7 = new Alumno("Nombre7", "Apellido7", "777 A", 6);
		Alumno alumno8 = new Alumno("Nombre8", "Apellido8", "888 A", 7);
		Map<String, Alumno> cole2 = new HashMap<String, Alumno>();
			cole2.put("555 A", alumno5);
			cole2.put("666 A", alumno6);
			cole2.put("777 A", alumno7);
			cole2.put("888 A", alumno8);
			
			
		//CREAR SECRETARÍA
			/*
			 *  - A partir del DNI mirar si el alumno esta en el mapa y si está devolver su info
			 *  - Devolver la nota media de todos los alumnos
			 *  - Mostrar la información de todos los alumnos del colegio.
			*/
			
			
			//=========== BUSCA ALUMNO ================
			
			String dni = Utils.scanString("Introduzca el DNI del alumno que desea consultar");
			if(cole1.containsKey(dni)) {
				System.out.println("El alumno es :" + cole1.get(dni)); 
			}

			System.out.println("");
			System.out.println("");
			
		//=========== NOTA MEDIA ================
			
		//Debemos extraer del mapa una colección con los valores, (los objetos Alumno) y despues
		// ir extrayendo la nota de cada uno para guardarla en un nuevo Set que podamos hacer
		//la media aunque podemos hacer la media a la vez que los vamos recuperando.
		
		int sumatorioNotasCole1 = 0;
		List<Integer> notasCole1 = new ArrayList();
		
		Collection<Alumno> setAlumnosCole1 = cole1.values();
			for (Alumno alumno : setAlumnosCole1) {
				int notaAlumno = alumno.getNota();
				notasCole1.add(notaAlumno);
				sumatorioNotasCole1 += notaAlumno;
			}
			
			System.out.println("La nota media de los alumnos es: " + (sumatorioNotasCole1/notasCole1.size()));
			
			System.out.println("");
			System.out.println("");
			
		//=========== MUESTRA COLE ================
			
		//1ª Forma
			System.out.println("(Primera forma)El Cole 1 tiene los siguientes alumnos");
			Set<String> dniAlumnos = cole1.keySet();
			for (String clave : dniAlumnos) {
				System.out.println("Clave: " + clave + " " + cole1.get(clave));
			}
			
			System.out.println("");
			System.out.println("");
			
		//2ª Forma con los Entry
			System.out.println("(Segunda forma) El Cole 1 tiene los siguientes alumnos");
			Set<Entry<String, Alumno>> entries = cole1.entrySet();
			for (Entry<String, Alumno> entry : entries) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			
			
//============================ OPCIONAL 1 ======================================	
//	Creamos otro mapa donde la clave es el nombre del colegio y el valor es el listado de alumnos.
//	 - Mostrar el nombre de cada colegio con todos sus alumnos.
//	 - Solicitamos un DNI y le indicaremos en que colegio está ese alumno, si no esta, mensaje de error.
			
			
			//Creamos un nuevo mapa cuya clave es un mapa y valor es una lista de objetos de tipo Alumno.
			Map<String, Collection<Alumno>>listaColes = new HashMap <String, Collection<Alumno>>();
			listaColes.put("C.P. Buen Gobernador", cole1.values());
			listaColes.put("C.P. Vicente Alexandre", cole2.values());
			
			System.out.println("A continuación el listado de alumnos por colegio:");
			Set<Entry<String, Collection<Alumno>>> entries2 = listaColes.entrySet();
			
			for (Entry<String, Collection<Alumno>> entry : entries2) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			
			
			String dni2 = Utils.scanString("Introduzca el DNI del alumno que desea buscar");
			
		
			boolean encontrado = false;
			for (Entry<String, Collection<Alumno>> entry : entries2) {
				if(encontrado) {break;}
				Collection<Alumno> valores = entry.getValue();
				for(Alumno alumno : valores) {
					if(alumno.getDni().equalsIgnoreCase(dni2)) {
					System.out.println(entry.getKey() + " " + alumno);
					encontrado=true;
					break;
					}
				}
			}
			
			
			
			
			
			
			
			
			
			
			
//			//Creamos una coleccion con las dos colecciones de alumnos pertenecientes a los colegios
//				Collection<Collection<Alumno>> todosAlumnos = listaColes.values();
//				
//				//Con el primer bucle for recorremos la coleccion de colecciones
//				for (Collection<Alumno> coleccion : todosAlumnos) {
//					//Dentro del bucle for, por cada colección recorremos sus alumnos
//					for (Alumno alumno : coleccion ) {
//						//Si el dni2 coincide con el get.dni del alumno imprime su toString.
//						if (alumno.getDni().equalsIgnoreCase(dni2)) {
//							System.out.println(alumno);
//							
//						}
//						
//					}					
//				}
				
				
				
				
				
				
				
				}
			

	
}
