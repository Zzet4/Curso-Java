package curso_java.A4_BBDD.A0_TutorialConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConexionBaseDeDatos {//Creamos la clase ConexionBaseDeDatos.

	public static void main(String[] args) { //Creamos un método main para hacer las llamadas pertinentes al metodo de conexión
//		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
//		conexion.conectaTryWithResources();
		
		System.out.println("Hola");
	}
	
	
	
	
//FUERA DEL MAIN VAMOS A CREAR DOS MÉTODOS: conecta y conectaTryWithResources
	//El método conecta:
		//
	
	//El método conectaTryWithResources:
		//
	
	
//-----MÉTODO CONECTATRYWITHRESOURCES----	

	private void conectaTryWithResources() {
		//Creamos las variables necesarias para establecer la conexión, url, username y password
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";
		
		
		//Declaramos los objetos de las interfaces que vamos a utilizar para conectarnos, lanzar consultas y recoger resultado de consulta.
		//Es necesario meterlos en un try catch ya que su declaración puede generar excepciones de tipo checked.
		//En este ejemplo los declaramos debajo pero los comentamos para que no surtan efecto y los declaramos ya dentro del try catch.
		
		
		//Connection connection = null;//Conexion con la base de datos
		//Statement stmt = null;//Lanzar consulta
		//ResultSet rs = null;//Recoger datos de la consulta
		
		try (
			//Esto es un Try with resources, metemos entre () antes del { los objetos de aquellas interfaces que implementan la interfaz
			// autoCloseable, en este caso los objetos connection, stmt y rs del tipo interfaz Connection Statement y ResultSet
			// implementan la interfaz autoCloseable por lo que cerraran la conexión automáticamente después de usarse.
				Connection connection = DriverManager.getConnection(url, username, password);
					//Declaramos las variables y llamamos a los métodos necesarios para establecer la conexión.
					//Declaramos una variable de tipo Connection y la inicializamos con la clase DriveManager llamando al método getConnection
					//al que le pasamos los parámetros necesarios para la conexión, url, username, password.
				Statement stmt = connection.createStatement();
					//La interface Statement nos va a habilitar la posibilidad de lanzar una consulta a la base de datos una vez 
					//establecida la conexión, creando un objeto que despues ejecutará la consulta
					//Declaramos una variable (stmt) de tipo Statment y la inicializamos con el objeto connection creado anteriormente llamando
					//al método createStatement para generar la estructura que nos permitira realizar la consulta
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
					//Declaramos una variable de tipo ResultSet llamada (rs) en la cual vamos a almacenar el return de la base de datos a 
					//Nuestra consulta. Inicializamos la variable con la variable (stmt) creada anteriormente como estructura que llamara
					//al método .executeQuery al que le pasaremos como parámetro la consulta en cuestión dentro de un String.
			
				
			//as variables connection, stmt y rs deben cerrarse después de ser utilizadas pero como implementan las interfaces
				//Connection Statement y ResultSet respectivamente ya se autocierran por que a su vez implementan la interface autocloseable
				
				//La razón de metet la declaración de estas variables en el () del try es para evitar tener que cerrarlas a mano al final 
				//De la ejecución del bloque de codigo.
								
			) {

			Set<Facility> facilities = new LinkedHashSet<Facility>(); //Creamos una lista de tipo SET que no permite duplicados.
			
			
			//Con un bucle While hacemos el iterable del Set, el método.next()coloca un cursor en la posicion -1 de la lista y pregunta
			//Si hay contenido en la siguiente posicion, si lo hay avanza tras finalizar la iteración del bucle.
			//Recordemos que estamos llamando al método .next() con la variable (rs), que guarda los datos recibidos de la consulta.
			while (rs.next()) {
				
				//Declaramos la variable id de tipo long y la inicializamos con el objeto rs llamando al método getInt("id") para guardar
				// el dato id en la variable id.
				long id = rs.getInt("id");
				
				//Previamente hemos creado una clase (Facility) que corresponde a una tabla de nuestra base de datos cuyos atributos
				//son las columnas de dicha tabla.
				//Creamos un objeto de la clase Facility pasándole como argumentos los valores de todos sus atributos, como estamos dentro
				//del bucle While, en esta primera vuelta podemos hacer los getInt o getString correspondientes para pasárselos al constructor
				//ojo, hay que tener en cuenta que debemos saber de que tipo es cada dato y su equivalencia para decidir si usar el 
				//rs.getString, el rs.getInt o el rs.getDouble.
				Facility facility = new Facility(id,rs.getInt("guid"),rs.getString("name"),
						rs.getString("description"),rs.getString("category"),rs.getString("address"),
						rs.getDouble("heigth"));
			
				//Finalmente añadimos el objeto facility al Set creado en la linea 74.
				facilities.add(facility);
				
			}
			//imprimimos el tamaño del Set para saber cuantos objetos se han creado y guardado en la lista Set.
			System.out.println(facilities.size());

			//Con el catch capturamos las posibles excepciones SQL que puedan haber surgido.
		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} 

	}
	
	

//-----MÉTODO CONECTA----
	
	private void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;//Conexion con la base de datos
		Statement stmt = null;//Lanzar consulta
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();

			rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
			while (rs.next()) {
				
				//Haciendo estos Sysout podemos ir viendo en cada vuelta del bucle los valores de los atributos
				//del objeto que pertenezca a la posicion en la que esta el cursor del .next()
				System.out.println(rs.getLong("id"));
				System.out.println(rs.getInt("guid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("description"));
				System.out.println(rs.getString("category"));
				System.out.println("===============================");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			
			//Aquí cerramos las variables connection, stmt y rs ya que no se pueden quedar abiertas y no las hemos metido en un 
			//tryWithResources que implemente en el parentesis despues del try los autocloseables.
			try {
				if (connection!=null) {
					connection.close();
				}
				if (stmt!=null)
					stmt.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

