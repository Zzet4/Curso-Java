package curso_java.A2_ejercicios.A92_Ficheros.Ficheros3;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Insertador {
//	Leer el fichero bibliotecas.txt
//	Por cada linea que haya en el fichero insertar los datos 
//	correspondientes en la tabla TB_biblioteca y TB_direcciones


	public static void main(String[] args) {

		Main_Insertador inicio = new Main_Insertador();
		inicio.libraryCreator(".\\src\\curso_java\\A2_ejercicios\\A92_Ficheros\\Ficheros3\\bibliotecas.txt");

	}

	
	
	public  List<BibliotecaFile> libraryCreator(String fileRoute) {
		//Este método va a explorar el archivo que le indiquemos en el parámetro como ruta. Esto lo vamos a hacer creando un objeto
		//De tipo Scanner llamado S que recorrera el objeto de tipo File con dicha ruta indicándole que el delimitador de cada linea será \n
		//con el método s.useDelimiter("\n");
		
		//Crearemos entonces un iterator con el bucle while y el metodo hasNext() para el objeto s de la siguiente manera
		//while(s.hasNext()) {}
		//el bucle comenzará a leer cada linea del archivo haciendo el corte en el símbolo ("/n") y a cada linea se la denomina como s.next();
		//Ha cada linea la dividiremos por el símbolo | que es el que separa los datos de la siguiente manera
		
		//s.next().split("\\|"); que nos mete los datos separados en un array de Strings de la siguiente manera
		//String [] arrayDatos = s.next().split("\\|");
		//Después, con los datos ya separados en las posiciones del array, iremos recuperándolas una por una para pasárselas como atributos
		//al método constructor de la clase BibliotecaFile y DireccionBibliotecaFile e ir, de esta manera, generando un nuevo objeto en cada vuelta 
		//del bucle.
		//aprovecharemos para meter cada bibliotecaFile y DirecciónBibliotecaFile en sus listas que serán lan  que finalmente devolvamos como return del método.
		
		
		File file = new File(fileRoute); 
		 List<BibliotecaFile> listaBibliotecas = new ArrayList<BibliotecaFile>();
		
		try {
			Scanner s = new Scanner(file);
			s.useDelimiter("\n");
			while(s.hasNext()) {
				String [] arrayDatos = s.next().split("\\|");
				String nombreBilbioteca = arrayDatos[5];
				String nombreCalle = arrayDatos[1];
				int codPostal = Integer.parseInt(arrayDatos[4]);
				String localidad = arrayDatos[2];
				String provincia = arrayDatos[3];
				
				DireccionBibliotecaFile direccionBiblioteca = new DireccionBibliotecaFile(nombreCalle, codPostal, localidad, provincia);
				BibliotecaFile biblioteca = new BibliotecaFile(nombreBilbioteca, direccionBiblioteca);
				listaBibliotecas.add(biblioteca);
			
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("La lista tiene un total de " + listaBibliotecas.size() + " Bibliotecas \n\t");
		for (BibliotecaFile biblio : listaBibliotecas) {
			System.out.println(biblio.getNombreBiblioteca() + "\n" + biblio.getDireccion() + "\n");
		}
		return listaBibliotecas;
	}
	
	//AHORA DEBEMOS INSERTAR LOS DATOS EN LA BASE DE DATOS
	//VAMOS A REPASAR LOS PASOS A SEGUIR.
	
	
	//CREAMOS EL MÉTODO PARA CONECTARNOS A LA BASE DE DATOS:
	private void conexionBBDD(List<BibliotecaFile> listaBibliotecas) {
		
		//Parámetros de conexión
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";
		String query = "INSERT IN TO ?";
		//Aunque estos parámetros ya los tenemos definidos en un método sobrecargado llamado getInstance de la clase Utils
		//que nos devuelve una conexión.
		
		try (
				//Objeto Connection con los parámetros de conexión para inicializar la conexión.
				Connection connection = DriverManager.getConnection(url, username, password);
				//una vez hemos inicializado la conexión procedemos a montar la estructura del prepareStatement con la query que necesitamos.
				PreparedStatement prepareStatement = connection.prepareStatement(query);
		
				//Objeto ResultSet. para ejecutar la cuery a traves del prepareStatement llamando al método executeQuery();
				ResultSet rs = prepareStatement.executeQuery();
				)
		{
			prepareStatement.setString(1, "TB_BIBLIOTECA");
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

		
		
		
		
	}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
