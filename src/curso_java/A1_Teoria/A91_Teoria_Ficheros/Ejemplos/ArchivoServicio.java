package curso_java.A1_Teoria.A91_Teoria_Ficheros.Ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){ //Este método para crear un archivo se utiliza cuando hay mucha información que se va a añadir.
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))){ //Con el parametro a false sobreescribirá el archivo
        	//con el parametro a true simplemente escribirá lo que le indiquemos a continuación de lo que ya hay.

            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo escribiendo en un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){

            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "JoseLuis5");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre) throws IOException{
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(fileReader);
        
        String linea;
        while ( (linea = reader.readLine()) != null){
            sb.append(linea).append("\n");
        }
        
//        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
//
//            String linea;
//            while ( (linea = reader.readLine()) != null){
//                sb.append(linea).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return sb.toString();
    }
    
    
    
    
    //METODO PARA MOSTRAR EL CONTENIDO DE UNA CARPETA Y EVALUAR SI CADA ELEMENTO DEL DIRECTORIO ES OTRO DIRECTORIO O UN FICHERO Y MÁS INFORMACIÓN.
    public void mostrarContenidoDirectorio(String directorio) {
    	File dir = new File(directorio);
    	File file1 = new File(directorio, "fichero1.txt");
    	File file2 = new File(dir, "fichero1.txt");
    	//Hemos creado un objeto de tipo File
        
        if(dir.isDirectory()) {//Con el método .isDirectory miramos si el objeto creado es un directorio.
        	String[] ficheros = dir.list(); //dir.list() devuelve un array de Strings con los elementos del directorio.
        	for (String nombreFichero : ficheros) {//Recorremos el array "ficheros"
				System.out.print(nombreFichero + " ");//En cada vuelta del bucle concatenamos el nombre del fichero con un espacio en blanco
				String nuevoFichero = directorio+nombreFichero;//En cada vuelta del bucle crearemos una variable de tipo String donde concatenaremos
															  //el String del directorio + el nombre del fichero
				File file = new File(nuevoFichero);//por cada vuelta del bucle creamos un nuevo objeto de tipo File pasándole la ruta del String del 
													//nuevoFichero creado en la linea anterior.
				
				//Hacemos un if para determinar si es un fichero o un directorio con el método .isdirectory.
				if(file.isDirectory()) {
					System.out.println("Es un directorio");
				}else {
					System.out.println("Es un fichero");
					System.out.println("Tiene permisos de lectura? " + file.canRead());//método para saber si hay permisos de lectura
					System.out.println("El tamaño es: " + file.length()); //Muestra el tamaño en bytes del fichero
					System.out.println("Ruta absoluta: "+file.getAbsolutePath());
					System.out.println("Oculto: "+file.isHidden());
					System.out.println("Se puede ejecutar: "+file.canExecute());
					System.out.println("Se puede escribir: "+file.canWrite());
				}
					
			}
        }else {
        	System.err.println("No es un directorio");
        }
    }
}
