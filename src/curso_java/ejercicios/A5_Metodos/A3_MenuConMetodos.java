package curso_java.ejercicios.A5_Metodos;

import java.util.Scanner;

import curso_java.utilidades.Utils;

public class A3_MenuConMetodos {
	public static void main(String[] args) {

		/*
		 * 
		 * Vamos a realizar un menú lo más automatizado posible con métodos.
		 * Para ello vamos a crear un array bidimensional simulando un colegio con 3 aulas diferentes.
		 * aula 1 - con 3 mesas
		 * aula 2 - con 2 mesas
		 * aula 3 - con 1 mesa
		/*
		 * 1. Insertar Alumno.
		 * 		- Solicitar aula donde se va a insertar.
		 * 		- Pedir nombre del alumno
		 * 		- Guardar la información en la primera posicion del aula "si la hubiera".
		 * 	
		 * 	2. Mostrar Alumnos por Aula
		 * 		- Solicitamos el aula que se desea visualizar y lo mostramos con el siguiente formato.
		 * 
		 * 			EJ: Aula 1:
		 * 				Nombre1 
		 * 				Nombre2	
		 * 				...
		 * 
		 * 	3. Mostrar todos los alumnos cuyo nombre empieza por "A".
		 * 	4. Buscar Alumno por nombre
		 * 		- Solicitar el nombre de un alumno a buscar
		 *		- Con el nombre como dato vamos a indicar en que aula está ese alumno.	
		 *
		 * 	5. Borrar Alumno
		 * 		- Solicitar el nombre de un alumno y si esta en el colegio se borra (igualando su posicion a null)
		 * 	6. Salir
		 */

//===================================================================================================================================================		
		
		
//Generamos el array descrito en el enunciado.
		//forma directa, tenemos dos formas de generar un array bidimensional de forma directa, es decir conociendo su dimensión.
		
		//Primera forma, en esta forma podemos definir el tamaño sin necesidad de meter la información. No obstante rellenamos la primera mesa
			//del primer aula con "pepe" para demostrar que también podemos rellenar los datos de esta manera.
		String [][] colegio = new String[3][];
			colegio[0]=new String [3];
				colegio [0][1] = "pepe";
			colegio[1]=new String [2];
			colegio[2]=new String [1];
			
		//Segunda forma, en esta forma debemos meter la información.
			//String [][] colegio2 = {{"pepe", "juan", "jose"},{"paco", "miguel"},{"rogustiano"}};
		
		
// Pintamos el menú con el método pintaMenu pasandole como parametro la variable donde tenemos guardado el String con el cuerpo del menu
			//ojo, la variable cuerpoMenu es de tipo final static para convertirla en una constante inmutable y debe estar declarada fuera del metodo
			//main
			
		int opcionMP = Utils.pintaMenu(CUERPO_MENU);
		
// Ahora creamos el Switch del menú en si mismo, añadimos un do while para controlar el repintado del menú
	//(Los metodos para los diferentes casos están en esta misma clase, pero fuera del metodo main)
		
	
		switch (opcionMP) {
		case 1:// Insertar Alumno.
			
			
			
			//Pedimos el aula donde se va a insertar el alumno guardándolo en su variable mediante el uso del método scanInt
			boolean claseLlena = true;
			
				int numAula = Utils.scanInt("En qué aula quieres insertarlo " + "entre la 1 y la " +(colegio.length) + "?");
				String [] aula = colegio[numAula-1];
				for (int i = 0; i < aula.length; i++) {
					if (aula[i]==null) {
						System.out.println("Posición "+(i+1)+ " libre");
						String nombre = Utils.scanString("Introduce el nombre");
						//aula[i]=nombre;
						colegio[numAula-1][i]=nombre;
						claseLlena=false;
						break;
					}
					if(claseLlena==true) {
						System.out.println("El aula seleccionada ya está llena");
					}
				}
			
		break;
		case 2://Mostrar Alumnos por Aula
			
		break;
		case 3://Mostrar todos los alumnos cuyo nombre empiece por "A".
			
		break;
		case 4://Buscar Alumno por Nombre
			
		break;
		case 5://Borrar Alumno
			
		break;
		case 6://Salir
	
				
		}
	
	
	
	
  }
	
	
	
	
//VARIABLES FINAL
	final static String CUERPO_MENU = "\n\tMENÚ PRINCIPAL\n\nopcion1 Insertar alumno \nopcion2 Mostrar aula \nopcion3 Mostrar aprobados \nopcion4 Buscar por DNI"
			+ "\nopcion5 Borrar alumno \nopcion6 Salir \n";
	
	
//MÉTODOS PARA FUNCIONALIDADES DEL SWITCH
	
	//	CASE 1 : INSERTAR ALUMNO
//	public static void insertaAlumno(String [][] colegio) {
//		//Pedimos el aula donde se va a insertar el alumno guardándolo en su variable mediante el uso del método scanInt
//		boolean claseLlena = true;
//		do {
//			int numAula = Utils.scanInt("En qué aula quieres insertarlo " + "entre la 1 y la " +(colegio.length) + "?");
//			String [] aula = colegio[numAula-1];
//			for (int i = 0; i < aula.length; i++) {
//				if (aula[i]==null) {
//					System.out.println("Posición "+(i+1)+ " libre");
//					String nombre = Utils.scanString("Introduce el nombre");
//					//aula[i]=nombre;
//					colegio[numAula-1][i]=nombre;
//					claseLlena=false;
//					break;
//				}
//				if(claseLlena==true) {
//					System.out.println("El aula seleccionada ya está llena");
//				}
//			}
//		}while(claseLlena!=true);
//	}
	

}
