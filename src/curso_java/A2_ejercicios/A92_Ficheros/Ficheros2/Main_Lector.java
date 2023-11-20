package curso_java.A2_ejercicios.A92_Ficheros.Ficheros2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import curso_java.A2_ejercicios.A6_POO.A1_POO.Alumno;

public class Main_Lector {
	//Leer el archivo de la ruta de abajo y crear un objeto por cada linea.
	//D:\Wokspace\PrimerProyecto\\src\\curso_java\\A2_ejercicios\\A92_Ficheros\\Ficheros2\\alumnos.txt
	//meter todos los alumnos en una lista e indicar el tamaño de la lista.
	
	
	//Creamos el Logger
	Logger logger = LogManager.getLogger(Main_Lector.class);
	
	public static void main (String [] args) {

		Main_Lector objetoMain = new Main_Lector();
		
		String archivoString = objetoMain.fileReader(".\\src\\curso_java\\A2_ejercicios\\A92_Ficheros\\Ficheros2\\alumnos.txt");
		System.out.println(archivoString);
		
		List<Alumno> listadoAlumnos = objetoMain.itemGenerator(archivoString);
		System.out.println(listadoAlumnos);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public String fileReader(String nombre) {

		StringBuilder sb = new StringBuilder();
		File archivoFile = new File(nombre);
		
		try (Scanner s = new Scanner(archivoFile)){
			s.useDelimiter("\n");
			while (s.hasNext()) {
				sb.append(s.next()).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	
	public List<Alumno> itemGenerator (String archivoString){
		List<Alumno> listadoAlumnos= new ArrayList<Alumno>();
		int contador = 1;
		
		File archivo = new File(".\\src\\curso_java\\A2_ejercicios\\A92_Ficheros\\Ficheros2\\alumnos.txt");
		try {
			Scanner s1 = new Scanner(archivo);
			s1.useDelimiter("\n");
			while (s1.hasNext()) {
				
				String []  lineaSeparada = s1.next().split("\\|");
				if(lineaSeparada[4].equals("0")) {
					lineaSeparada[4]="false";
				}else if(lineaSeparada[4].equals("1")) {
					lineaSeparada[4]="true";
				}
				
				Alumno alumno = new Alumno(lineaSeparada[0],lineaSeparada[1], lineaSeparada[2],
						Integer.parseInt(lineaSeparada[3]),Boolean.parseBoolean(lineaSeparada[4]));
				listadoAlumnos.add(alumno);
				
				/*
				 * En vez de hacerlo con un objeto de tipo scanner y utilizar el iterator, podríamos haberlo generado de la siguiente manera
				 * 
				 * 
				 * En vez de crear el objeto archivo de tipo File, lo crearemos de tipo Path para poder después al método readAllLines.
				 * 
				 * Path archivoPath = Paths.get(".\\src\\curso_java\\A2_ejercicios\\A92_Ficheros\\Ficheros2\\alumnos.txt");
				 * 
				 * después Creamos la lista de alumnos donde posteriormente los meteremos y en vez de crear un array de Strings, 
				 * crearemos una lista para recorrer cada linea de la siguiente manera
				 * 
				 * List<Alumno> alumnos = new ArrayList();
				 * List <String> lines = Files.readAllLines(path);
				 * 
				 * Por último en vez de generar el objeto de tipo Scanner y el iterator, 
				 * podemos recorrer la lista con un foreach para ir recuperando la info necesaria
				 * 
				 * for (String linea : lineas){
				 *		aquí ya podríamos trocear la linea con el método .split --> line.split("\\|");
				 *		después recogeríamos los datos troceados para ir creando los objetos y metiéndolos en la lista alumnos.
				 * }
				 * 
				 * 
				 * */
				
				
				
				
				
				
				
				
				
				
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return listadoAlumnos;
	}
	

}
