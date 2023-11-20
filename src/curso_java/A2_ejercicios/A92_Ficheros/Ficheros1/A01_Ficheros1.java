package curso_java.A2_ejercicios.A92_Ficheros.Ficheros1;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class A01_Ficheros1 {
	private static final Logger logger = LogManager.getLogger(A01_Ficheros1.class);
	private static int contadorJPGs = 0;
//	
//	+En todas las carpetas cuantos ficheros jpg hay
//	Mostrar el nombre de todos los ficheros en cuyo nombre 
//	tengamos el año actual. Intentad obtener el año mediante programación
//	Vais a renombrar (asdasd.txt.done) el fichero que tenga en el nombre el año siguiente 
//	pero en el mes actual en el que estamos
//	Ese fichero renombrado lo vais a mover a un directorio que no existe con el nombre que querais 
	
//UTILIZA LOS LOGS
	

	public static void main(String[] args) {
	
		A01_Ficheros1 mainFichero = new A01_Ficheros1();
		mainFichero.explorarDirectorio(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\dir1");
		System.out.println("\n\n=================================================================================================\n\n");
		mainFichero.explorarDirectorio(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\dir2");
		System.out.println("\n\n=================================================================================================\n\n");
		mainFichero.explorarDirectorio(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\dir2\\dir3");
		System.out.println("\n\n=================================================================================================\n\n");
		mainFichero.explorarDirectorio(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\dir2\\dir4");
		System.out.println("\n\n=================================================================================================\n\n");
		mainFichero.crearCarpeta(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\","Nueva_Carpeta");
		System.out.println("\n\n=================================================================================================\n\n");
		mainFichero.renombrarArchivo(".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\dir2\\dir3\\",
				"fichero_202411.txt",
				".\\src\\curso_java\\A1_Teoria\\A91_Teoria_Ficheros\\Directorios_prueba\\directorios2\\Nueva_Carpeta\\",
				"Archivo_Renombrado");
		System.out.println("\n\n=================================================================================================\n\n");
			
	}
	
	
	public static void explorarDirectorio (String rutaDirectorio) {
		File dir = new File(rutaDirectorio);
		String [] elementosDirectorio = dir.list();//.list lista en un array de strings los elementos delntro del directorio dir.
		//También podemos crear un array de objetos tipo File con el método listFiles() es decir, todos los elementos los coloca en el 
		//array pero en vez de como String, los coloca como objetos de tipo File
		//File [] files = rutaDirectorioEnFile.listFiles();
	
		
		int contador = 0;
		List<String> listaFicheros2023 = new ArrayList<String>();
		
		
		System.out.println("Comenzamos la exploración del directorio con ruta:\n" + rutaDirectorio + "\n");
		for(String nombreElemento : elementosDirectorio) {
			//concatenamos la rutaDirectorio con el nombre de cada elemento dentro de la lista que hemos creado con .list en un nuevo string.
			String nuevoElemento = rutaDirectorio+nombreElemento;
			//creamos un nuevo objeto de tipo File con la ruta completa incluyendo el nombre del elemento tal y como hemos guardado en 
			//el string nuevoElemento.
			File elementoFile = new File(nuevoElemento);
			
			//Creamos un IF que determine si el objeto de tipo File con nombre elementoFile es un directorio o un archivo.
			//En caso de ser un directorio haremos unas acciones y en caso de ser un fichero haremos otras.
			
			if( elementoFile.isDirectory()){
				System.out.println(nombreElemento + " es un directorio");
			}else {
				System.out.print("\t" + nombreElemento + " ====> es un fichero");
				
				//BUSCAMOS SI EL FICHERO ES UN .JPG
				if(elementoFile.getName().endsWith(".jpg")) {
					contador ++;
					System.out.print(" con extensión (.jpg) ");
					System.out.println("Que pesa " + elementoFile.length() + "bytes");
				}else {System.out.println("");}
				
				//GUARDAMOS EN UNA LISTA LLAMADA LISTAFICHEROS2023 PARA DESPUÉS PINTARLA POR PANTALLA
				if(elementoFile.getName().contains("23") || elementoFile.getName().contains("2023")) {
					listaFicheros2023.add(elementoFile.getName());
				}
			}
		}
		System.out.println("\nEn el dierctorio de la ruta:\n " + rutaDirectorio + "\n hay un total de " + contador + " archivos con extensión (.jpg)");
		System.out.println("\nEn el dierctorio de la ruta:\n " + rutaDirectorio + "\n hay un total de " + listaFicheros2023.size() + " archivos en cuyo nombre aparece el año 2023: \n");
		for(String fichero : listaFicheros2023) {
			System.out.println("\t" + fichero);
		}
	}
	
	
	public static void crearCarpeta(String ruta, String nombreCarpeta) {
		File buscador = new File(ruta);
		String[] listaElementos = buscador.list();
		boolean existe = false;
		File file = new File(ruta+nombreCarpeta);
		for(String elemento : listaElementos) {
			if (elemento.equalsIgnoreCase(nombreCarpeta) && file.isDirectory()) {
				existe = true;
			}
		}
		
		if(!existe) {
			System.out.println(file.mkdir());
		}else {
			System.out.println("Esta carpeta ya existe");
		}
	}
	
	
	
	
	public static void renombrarArchivo(String rutaOrigen, String ficheroOrigen, String rutaDestino, String renombre) {
		File renombrador = new File(rutaOrigen+ficheroOrigen);
		File renombrado = new File(rutaDestino+renombre);
		renombrador.renameTo(renombrado);
	}
	
	
	
	
//=================================== MÉTODOS CONCURRENTES ====================================//

	public void contarJPGs (File directorio) {
		logger.debug("Buscando jpgs en directorio "+ directorio.getAbsolutePath());
		File[] files = directorio.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				contarJPGs(file);
			}else {
				logger.debug("Encontrado un fichero");
				if(file.getName().endsWith(".jpg")) {
					logger.debug("es un jpg");
					contadorJPGs++;
				}
			}
		}
		
		System.out.println("hay " + contadorJPGs + " archivos con extensión.jpg");
	}
	
/*
 * LO QUE VEMOS ARRIBA ES UN MÉTODO CONCURRENTE. VAMOS A ESPLICAR SU FUNCIONAMIENTO CON UN EJEMPLO.
 * 
 * NECESITAMOS UN MÉTODO QUE NOS CUENTE EL NÚMERO DE FICHEROS CON LA EXTENSIÓN .JPG QUE HAY EN UNA ESTRUCTURA DE CARPETAS
 * LO COMPLEJO AQUÍ ES QUE NO SOLO DEBE MIRAR SI EXISTEN ESTE TIPO DE ARCHIVOS EN UNA CARPETA, SI NO TAMBIÉN EN TODAS LAS CARPETAS
 * CONTENIDAS DENTRO DE ESTA.
 * 
 * ES DECIR, TIENE QUE IR MIRANDO TODAS LAS CARPETAS Y SUBCARPETAS DE LA ESTRUCTURA PARA ENCONTRAR TODOS LOS .JPGs QUE HAYA.
 * VAMOS A IR DESGRANANDO LINEA A LINEA LO QUE VA PASANDO EN EL METODO.
 * 
 * 
1 	public void contarJPGs (File directorio) {
2		logger.debug("Buscando jpgs en directorio "+ directorio.getAbsolutePath());
3		File[] files = directorio.listFiles();
4		for (File file : files) {
5			if (file.isDirectory()) {
6				contarJPGs(file);
7			}else {
8				logger.debug("Encontrado un fichero");
9				if(file.getName().endsWith(".jpg")) {
10					logger.debug("es un jpg");
11					contadorJPGs++;
12				}
13			}
14		}
15		System.out.println("hay " + contadorJPGs + " archivos con extensión.jpg");
16	}
 * 
 * =============================================================================================================
 * 
 * Fila1 - DECLARAMOS EL MÉTODO PASANDOLE COMO ARGUMENTO UN OBJETO DE TIPO FILE AL QUE LLAMAMOS DIRECTORIO
 * Fila2 - METEMOS UN LOGER.DEBUG QUE NOS PINTE Y NOS GUARDE EN ARCHIVO EL MENSAJE BUSCANDO JPGS EN DIRECTORIO + DIRECTORIO.GETABSOLUTEPATH() QUE NOS DA LA RUTA ABSOLUTA
 * Fila3 - CREAMOS UN ARRAY DE TIPO FILE A LA QUE LLAMAMOS FILES Y LA INICIALIZAMOS CON LA LLAMADA AL MÉTODO .LISTFILES() DESDE EL OBJETO DIRECTORIO.
 * 			ESTO NOS CREARÁ UN ARRAY DE OBJETOS DE TIPO FILE CON TODOS LOS ELEMENTOS DENTRO DE LA CARPETA DEFINIDA EN EL DIRECTORIO QUE PASAMOS COMO PARAMETRO.
 * Fila4 - INICIAMOS UN BUCLE FOR QUE NOS VA A RECORRER EL ARRAY DEVOLVIÉNDONOS EN CADA VUELTA EL OBJETO DE TIPO FILE DEL ARRAY
 * Fila5 - DECLARAMOS UN IF CUYA CONDICION DE ENTRADA ES SI EL FILE DE ESA VUELTA DEL BUCLE FOR ES UN DIRECTORIO O NO FILE.ISDIRECTORY()
 * Fila6 - EN CASO DE SER UN DIRECTORIO ENTRA POR EL IF Y SE VUELVE A LLAMAR AL MÉTODO --> contarJPGs(file);.
 * 			ES AQUÍ DONDE SE PRODUCE LA CONCURRENCIA, AL ENCONTRAR UN DIRECTORIO, EL MÉTODO SE VUELVE A LLAMAR A SI MISMO PARA
 * 			REPETIR EL PROCESO DE BÚSQUEDA DENTRO DE ESE MISMO DIRECTORIO Y A SU VEZ ESTO TAMBIÉN MIRARA SI HAY MAS DIRECTORIOS DENTRO
 * 			DE ESTE SUBDIRECTORIO, METIÉNDOSE CADA VEZ MÁS EN UN NIVEL MAS ABSTRACTO DE CONCURRENCIA Y DEJANDO EL MÉTODO ANTERIOR EN PAUSA
 * 			CUANDO TERMINE EL METODO EN LOS SUBDIRECTORIOS IRÁ RETOMANDO DE NUEVO LOS MÉTODOS QUE DEJO EN PAUSA HASTA TERMINAR EL MÉTODO
 * 			ORIGINAL.
 * Fila7 - ESTA LINEA TIENE EL ELSE DEL IF QUE COMPROBABA SI EL OBJETO FILE ES UN DIRECTORIO O NO.
 * 			AL NO SER UN DIRECTORIO QUIERE DECIR QUE ES UN FICHERO Y ENTRA POR EL ELSE
 * Fila8 - EN LA FILA 8 METEMOS OTRO LOGUER QUE INFORMA DE QUE ES UN FICHERO
 * Fila9 - CREAMOS UN NUEVO IF DESPUÉS DE ENTRAR POR EL ELSE CUYA CONDICION DE ENTRADA ES SI EL NOMBRE --> (FILE.GETNAME()) TERMINA EN .JPG --> .ENDSWITH(".JPG")
 * Fila10 - EN ESTA LINEA ENTRA Y PONEMOS OTRO LOGGER QUE NOS INFORMA DE QUE ES UN ARCHIVO .JPG
 * Fila11 - EN ESTA LINEA AUMENTAMOS 1 AL CONTADOR DE JPGS QUE UTILIZAREMOS DESPUÉS PARA EL PRINT DEL NUMERO TOTAL DE JPGS
 * 			NOTESE QUE LA VARIABLE contadorJPGs HA SIDO DECLARADA COMO UN ATRIBUTO DE INSTANCIA EN LA PARTE DE ARRIBA DE LA CLASE.
 * 			ESTO SE HA HECHO ASÍ POR QUE SI DECLARÁSEMOS ESTA VARIABLE DENTRO DEL MÉTODO SE REINICIARÍA A CERO CADA VEZ QUE SE VUELVE
 * 			A LLAMAR AL MÉTODO DEBIDO A LA CONCURRENCIA 
 * Fila12 - 
 * Fila13 - 
 * Fila14 - 
 * Fila15 - HACEMOS EL SYSOUT DEL NÚMERO TOTAL DE FICHEROS CON EXTENSIÓN .JPG
 * */
	
	
	
	
	
	
//=================================== MÉTODOS PARA FECHAS ====================================//
	
/*
 * Creamos una variable de tipo LocalDateTime llamado datetime y lo inicializamos con LocalDateTime.now() que nos crea un objeto;
 * ahora esta variable apunta a un objeto que contiene la fecha completa de hoy con la hora incluída.
 * - LocalDateTime datetime = LocalDateTime.now();
 * 
 * A partir de aqui, podemos acceder a los métodos de la clase LocalDateTime como recuperar el año, el día o el mes:
 * 
 * 
 * 
 * utilizamos el metodo .getYear() con la variable datetime para conseguir el año actual, nos lo devuelve como int
 * - int fechaActual = datetime.getYear();
 * 
 * podemos convertirlo directamente a tipo String de la siguiente manera:
 * - String.valueOf(fechaActual);
 * 
 * O directamente:
 *  String.valueOf(datetime.getYear());
 *  
 * 
 * String mesString = datetime.getMonth() --> te devuelve el mes en un String (ingles)
 * int mesInt = datetime.getMonthValue(); --> te devuelve el mes en un int
 * int anioInt = datetime.getYear(); --> te devuelve el año en un int
 * 
 * 
 * 
 * */
	
	
	
	
	
	
	
	
}
