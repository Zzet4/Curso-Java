package curso_java.A2_ejercicios.A5_Metodos;

import java.util.Scanner;

import curso_java.A3_Utilidades.Utils;

public class A3_MenuConMetodos {
	public static void main(String[] args) {

		/*
		 * 
		 * Vamos a realizar un menú lo más automatizado posible con métodos. Para ello
		 * vamos a crear un array bidimensional simulando un colegio con 3 aulas
		 * diferentes. aula 1 - con 3 mesas aula 2 - con 2 mesas aula 3 - con 1 mesa /*
		 * 1. Insertar Alumno. - Solicitar aula donde se va a insertar. - Pedir nombre
		 * del alumno - Guardar la información en la primera posicion del aula
		 * "si la hubiera".
		 * 
		 * 2. Mostrar Alumnos por Aula - Solicitamos el aula que se desea visualizar y
		 * lo mostramos con el siguiente formato.
		 * 
		 * EJ: Aula 1: Nombre1 Nombre2 ...
		 * 
		 * 3. Mostrar todos los alumnos cuyo nombre empieza por "A". 4. Buscar Alumno
		 * por nombre - Solicitar el nombre de un alumno a buscar - Con el nombre como
		 * dato vamos a indicar en que aula está ese alumno.
		 *
		 * 5. Borrar Alumno - Solicitar el nombre de un alumno y si esta en el colegio
		 * se borra (igualando su posicion a null) 6. Salir
		 */

//===================================================================================================================================================		

//Generamos el array descrito en el enunciado.
		// forma directa, tenemos dos formas de generar un array bidimensional de forma
		// directa, es decir conociendo su dimensión.

		// Primera forma, en esta forma podemos definir el tamaño sin necesidad de meter
		// la información. No obstante rellenamos la primera mesa
		// del primer aula con "pepe" para demostrar que también podemos rellenar los
		// datos de esta manera.
		String[][] colegio = new String[3][];
		colegio[0] = new String[3];
		colegio[0][1] = "pepe";
		colegio[1] = new String[2];
		colegio[2] = new String[1];

		// Segunda forma, en esta forma debemos meter la información.
		// String [][] colegio2 = {{"pepe", "juan", "jose"},{"paco",
		// "miguel"},{"rogustiano"}};

// Pintamos el menú con el método pintaMenu pasandole como parametro la variable donde tenemos guardado el String con el cuerpo del menu
		// ojo, la variable cuerpoMenu es de tipo final static para convertirla en una
		// constante inmutable y debe estar declarada fuera del metodo
		// main

		int opcionMP = Utils.pintaMenu(CUERPO_MENU, "Seleccione la opción deseada");

// Ahora creamos el Switch del menú en si mismo, añadimos un do while para controlar el repintado del menú
		// (Los metodos para los diferentes casos están en esta misma clase, pero fuera
		// del metodo main)

		switch (opcionMP) {
		case 1:// Insertar Alumno.
			insertarAlumno(colegio);
			break;
		case 2:// Mostrar Alumnos por Aula
			consultaAula(colegio);
			break;
		case 3:// Mostrar todos los alumnos cuyo nombre empiece por "A".
			muestraAprobados(colegio);
			break;
		case 4:// Buscar Alumno por Nombre
			buscarAlumno(colegio);
			break;
		case 5:// Borrar Alumno
		
			break;
		case 6:// Salir

		}

	}

//VARIABLES FINAL
	final static String CUERPO_MENU = "\n\tMENÚ PRINCIPAL\n\nopcion1 Insertar alumno \nopcion2 Mostrar aula \nopcion3 Mostrar aprobados \nopcion4 Buscar por DNI"
			+ "\nopcion5 Borrar alumno \nopcion6 Salir \n";

//MÉTODOS PARA FUNCIONALIDADES DEL SWITCH

	// CASE 1 : INSERTAR ALUMNO
	public static void insertarAlumno(String[][] colegio) {
		// Pedimos el aula donde se va a insertar el alumno guardándolo en su variable
		// mediante el uso del método scanInt
		boolean claseLlena = true;

		int numAula = Utils.scanInt("En qué aula quieres insertarlo " + "entre la 1 y la " + (colegio.length) + "?");
		String[] aula = colegio[numAula - 1];
		for (int i = 0; i < aula.length; i++) {
			if (aula[i] == null) {
				System.out.println("Posición " + (i + 1) + " libre");
				String nombre = Utils.scanString("Introduce el nombre");
				// aula[i]=nombre;
				colegio[numAula - 1][i] = nombre;
				claseLlena = false;
				break;
			}
			if (claseLlena == true) {
				System.out.println("El aula seleccionada ya está llena");
			}
		}
	}

	// CASE 2 : MOSTRAR LOS ALUMNOS DE UNA CLASE
	public static void consultaAula(String[][] colegio) {
		for (int i = 0; i < colegio.length; i++) {
			System.out.println("Aula: " + (i + 1));
			for (int j = 0; j < colegio[i].length; j++) {
				String datosAlumno = colegio[i][j];
				if (datosAlumno != null) {
					String[] datosAlumnosArray = datosAlumno.split(":");

					System.out.println(
							"\t" + datosAlumnosArray[0] + " " + datosAlumnosArray[1] + " " + datosAlumnosArray[2]);
				}
			}
		}
	}

	// CASE 3 : MOSTRAR LOS ALUMNOS APROBADOS

	public static void muestraAprobados(String[][] colegio) {
		for (String[] aulaFE : colegio) {
			for (String datosAlumno : aulaFE) {
				if (datosAlumno != null) {
					String[] datosAlumnosArray = datosAlumno.split(":");
					int nota = Integer.parseInt(datosAlumnosArray[2]);
					if (nota >= 5) {
						System.out.println(
								"\t" + datosAlumnosArray[0] + " " + datosAlumnosArray[1] + " " + datosAlumnosArray[2]);
					}
				}
			}
		}
	}




	// CASE 4 :BUSCAR ALUMNO POR DNI

	public static void buscarAlumno (String[][] colegio) {
		System.out.println("Introduce el dni del alumno a buscar");
		Scanner scan2 = new Scanner(System.in);
		String dni = scan2.nextLine();
		
		boolean alumnoEncontrado = false;
		for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
				String datosAlumno = colegio[i][j];
				//Me aseguro de que haya información en esa posición
				if (datosAlumno!=null) {
					String dniAlumno = datosAlumno.split(":")[1];
					if (dni.equalsIgnoreCase(dniAlumno)) {
						System.out.println("El alumnos está en el aula "+(i+1));
						alumnoEncontrado=true;
						//Cuando hemos encontrado para que no sigan los bucles
						//Ponemos i y j en sus valores máximos
	//								i=colegio.length;
	//								j=colegio[i].length;
					}
				}
				
			}
			
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
	}





	// CASE 5 :BORRAR ALUMNO POR DNI

		public static void borrarAlumno (int [][] colegio) {

			System.out.println("Introduce el dni del alumno a borrar");
			Scanner scan = new Scanner(System.in);
			int dni = scan.nextInt();
			
			boolean alumnoEncontrado = false;
			for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
				for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
					int datosAlumno = colegio[i][j];
					//Me aseguro de que haya información en esa posición
					if (datosAlumno!=0) {
						
						if (dni==dni) {
							colegio[i][j]=0;
							alumnoEncontrado=true;
							System.out.println("Alumno borrado");
						}
					}
					
				}
				
			}
			if (!alumnoEncontrado) {
				System.out.println("El alumno con dni "+dni+" no está en el colegio");
			}

		}

		
		
		
		

}




















































