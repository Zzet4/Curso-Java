package curso_java.A2_ejercicios.A93_Hibernate.Hibernate2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.Entities.Usuario;
import curso_java.A3_Utilidades.UtilsFechas.UtilsFecha;
import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;

public class MainHibernate2 {
	private static final Logger logger = LogManager.getLogger(MainHibernate2.class);

	public static void main(String[] args) {
		MainHibernate2 servicio = new MainHibernate2();
		
		
		servicio.insertaUsuarios("EjemploOracle"); // ESTE MÉTODO INSERTA LOS USUARIOS DEFINIDOS EN SU INTERIOR.
													// LO IDEAL SERÍA DISEÑAR EL MÉTODO DE TAL FORMA QUE LE PASEMOS
													// COMO PARÁMETROS LOS USUARIOS QUE QUEREMOS INSERTAR.
		
		
		List<Usuario> usuarios = servicio.consultaUsuarios("EjemploOracle"); //INVOCAMOS AL MÉTODO DE CONSULTA IGUALÁNDOLO
																			// A UNA LISTA YA QUE ES SU RETURN.
																			// AHORA PODEMOS MANIPULAR LOS DATOS DE LA LISTA
																			// POR EJEMPLO PARA AÑADIRLOS A UN FICHERO.
		
		String ruta = ".\\src\\curso_java\\A2_ejercicios\\A93_Hibernate\\Hibernate2\\CarpetaFichero\\fichero1.txt"; // RUTA DONDE QUEREMOS CREAR EL 
																													// ARCHIVO
		
		servicio.crearFichero(ruta, usuarios); // CON ESTE MÉTODO CREAMOS EL FICHERO Y ESCRIBIMOS EN EL UNA LINEA POR CADA USUARIO DE 
											   // LA LISTA QUE 
	}
	
	
	
	
	//--- PRIMERA PARTE DEL EJERCICIO ---//
//	=========================================================
//	Consultar la tabla TB_USUARIO y guardar registros en fichero
//	El fichero tendrá cabecera con los nombres de las columnas
//	ID;NOMBRE;APELLIDOS;DNI;FECHAALTA...
//	1;N1;A1;yyymmdd;...
	

	//DECLARAMOS MÉTODOS PARA:
		//-- CREAR LA CONEXIÓN Y LA TABLA DEL ENTITY
		//-- INSERTAR LOS USUARIOS EN LA TABLA
		//-- CONSULTAR LOS ALUMNOS DE LA TABLA
		//-- CREAR UN FICHERO CON CABECERA
		//-- PASAR LOS DATOS DE ESOS ALUMNOS AL FICHERO
	


	//MÉTODO PARA INSERTAR REGISTROS EN UNA TABLA CON HIBERNATE
	public void insertaUsuarios (String persistenceUnit) {
		// DESDE UTILSHIBERNATE LLAMAMOS A LA UTILIDAD QUE NOS VA A DAR LA CONEXIÓN VERIFICANDO EN EL PERSISTENCE.XML
		// LOS ENTITIES QUE TIENE DEFINIDOS DENTRO DE LA PERSISTENCE UNIT QUE LE PASAMOS COMO PARÁMETRO
		logger.debug("================== iniciando conexión ==========================\n");
		EntityManager em = UtilsHibernate.getEM(persistenceUnit);
		logger.debug("================== conexión establecida ==========================\n");
		
		//CREAMOS 3 OBJETO DEL TIPO DEL ENTITY QUE TENEMOS VINCULADO CON HIBERNATE, (USUARIO)
		// A DOS DE ELLOS LE DAMOS TODOS LOS ATRIBUTOS DEL CONSTRUCTOR COGIENDO LA FECHA DE ESTE MOMENTO
		//    POR MEDIO DEL METODO GENERAFECHA DE LA CLASE UTILSFECHA
		// AL TERCER OBJETO NO LE METEMOS FECHAALTA PORQUE EN SU CONSTRUCTOR YA ESTÁ DEFINIDA LA DEL MOMENTO ACTUAL
		// REFIRIÉNDOSE AL MOMENTO DE LA CREACIÓN DEL OBJETO.
		Usuario usuario4 = new Usuario(4, "Usuario4", "Apellido4", "44444444A", UtilsFecha.generaFecha());
		Usuario usuario5 = new Usuario(5, "Usuario5", "Apellido5", "55555555A", UtilsFecha.generaFecha());
		Usuario usuario6 = new Usuario(6, "Usuario6", "Apellido6", "66666666A");
		
		// UNA VEZ TENEMOS LA CONEXIÓN EN EL OBJETO EM PODEMOS OPERAR CON EL.
		// TODAS LAS OPERACIONES QUE NO SEAN CONSULTA NECESITAN DE LLAMAR AL METODO .GETTRANSACTION().BEGIN();
		// Y DEL MÉTODO GETTRANSACTION().COMMIT(); EN CASO DE HABER REALIZADO LA OPERACIÓN CON ÉXITO O EL 
		// .GETTRANSACTION().ROLLBACK(); EN CASO DE HABER DETECTADO ALGÚN FALLO.
		// ESTA DECISIÓN LA TOMAREMOS BASÁNDONOS EN UN TRY CATCH
		// DENTRO DEL TRY CATCH LLEVAREMOS A CABO LA INSERCIÓN DE NUEVOS REGISTROS MEDIANTE EL MÉTODO .PERSIST
		// PASÁNDOLE COMO PARÁMETRO EL OBJETO CREADO QUE QUEREMOS INSERTAR.
		
		logger.debug("================== iniciando inserción ==========================\n");
		try {
			em.getTransaction().begin();
			em.persist(usuario4);
			em.persist(usuario5);
			em.persist(usuario6);
			em.getTransaction().commit();
			logger.debug("================== inserción finalizada con éxito ==========================\n");
		} catch (Exception e) {
			logger.debug("================== inserción fallida ==========================\n");
			em.getTransaction().rollback();
		}
	}
	
	
	
	
	
	
	
	
	
	//MÉTODO PARA CONSULTAR SELECT * DE UNA TABLA CON HIBERNATE
	public List<Usuario> consultaUsuarios (String persistenceUnit) {
		// DESDE UTILSHIBERNATE LLAMAMOS DE NUEVO A LA UTILIDAD QUE NOS VA A DAR LA CONEXIÓN VERIFICANDO EN EL PERSISTENCE.XML
		// LOS ENTITIES QUE TIENE DEFINIDOS DENTRO DE LA PERSISTENCE UNIT QUE LE PASAMOS COMO PARÁMETRO
		logger.debug("================== iniciando conexión ==========================\n");
		EntityManager em = UtilsHibernate.getEM(persistenceUnit); 
		logger.debug("================== conexión establecida ==========================\n");
		
		// CON EL OBJETO EM QUE TIENE LA CONEXIÓN VAMOS A HACER UN SELECT * DE LA TABLA TB_USUARIOS
		// RECORDEMOS QUE A HIBERNATE TENEMOS QUE DARLE LA CLASE DEL ENTITY NO LA TABLA.
		logger.debug("================== iniciando la consulta ==========================\n");
		
		// CREAMOS UNA LISTA DE TIPO USUARIO PARA GUARDAR EL LISTADO DE OBJETOS QUE NOS DEVUELVE LA QUERY
		// CON EL OBJETO EM (QUE TIENE LA CONEXIÓN), LLAMAMOS AL MÉTODO .CREATEQUERY Y LE PASAMOS COMO PARÁMETROS:
		
		// "FROM USUARIO --> PARA INDICARLE EL ENTITY QUE GENERÓ LA TABLA QUE DEBE CONSULTAR
		// USUARIO.class --> PARA INDICARLE DE QUE TIPO VAN A SER LOS OBJETOS QUE VA A DEVOLVER CON LA QUERY
		
		// FINALMENTE ENCADENAMOS EL METODO .GETRESULTLIST PARA QUE LOS GUARDE EN UNA LISTA COMO YA DEFINIMOS ANTES.
		List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
		// ESTE METODO CON ESTOS PARÁMETROS EQUIVALE A UN SELECT * DE LA TB_USUARIO.
		logger.debug("================== consulta finalizada ==========================\n");
		
		// CON UN BUCLE FOR RECORREMOS LA LISTA PARA CONSULTAR LOS OBJETOS USUARIO RESCATADOS CON LA QUERY
		logger.debug("================== imprimiendo resultado de la consulta ==========================\n");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		return usuarios;
	}
	
	
	
	
	
	
	
	//MÉTODO PARA LA CREACIÓN DE UN FICHERO CON CABECERA
	public void crearFichero(String nombreFichero, List<Usuario> listaUsuarios) {
	 //Este método para crear un archivo se utiliza cuando hay mucha información que se va a añadir.
		//CREAMOS UN OBJETO DE TIPO FILE PASÁNDOLE COMO PARÁMETRO UN STRING CON LA RUTA COMPLETA INCLUYENDO EL NOMBRE DEL 
		//ARCHIVO QUE QUEREMOS CREAR.
	        File archivo = new File(nombreFichero);
	        //CREAMOS UN TRY WITHRESOURCES AL QUE LE PASAMOS LA CREACIÓN DEL OBJETO BUFFER PARA QUE SE CIERRE AUTOMÁTICAMENTE AL ACABAR
	        //EL OBJETO BUFFER SERÁ EL ENCARGADO DE ESCRIBIR EN EL FICHERO QUE CREEMOS, POR LO TANTO DEBEMOS PASARLE DOS PARÁMETROS
	        	//1er PARÁMETRO --> EL OBJETO TIPO FILE QUE CREAMOS ANTERIORMENTE
	        	//2o PARÁMETRO --> --FALSE-- SI QUEREMOS QUE EL BUFFER SOBREESCRIBA O --TRUE-- SI QUEREMOS QUE EL BUFER MANTENGA
	        					// EL CONTENIDO DEL ARCHIVO Y ESCRIBA A CONTINUACIÓN.
	        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))){ 
	       
	        	//CON EL MÉTODO BUFFER.APPEND ESCRIBIMOS EN EL FICHERO QUE LE INDICAMOS EN LA CREACIÓN DEL BUFER.
	        	// LE PASAMOS AL MÉTODO EL STRING LITERAL QUE QUERAMOS QUE ESCRIBA, EN ESTE CASO LA CABECERA.
	            buffer.append("ID,NOMBRE,APELLIDOS;DNI;FECHAALTA\n");
	            System.out.println("Se ha creado la cabecera.\n Comienza la escritura del contenido!");
	            
	            //CREAMOS UN BUCLE FOR QUE RECORRA LA LISTA QUE CONSEGUIMOS DE LA SELECT * DE USUARIOS
	            //POR CADA VUELTA DEL BUCLE SACAREMOS LOS DATOS DE CADA USUARIO, LOS GUARDAREMOS EN VARIABLES Y DESPUÉS
	            // HAREMOS UN .APPEND DE ESTOS DATOS EN EL FICHERO.
	            for ( Usuario usuario : listaUsuarios ) {
	            	long idUsuario = usuario.getIdUsuario();
	            	String nombre = usuario.getNombre();
	            	String apellido = usuario.getApellidos();
	            	String dni = usuario.getDni();
	            	
	            	//OJO, AL RECOGER LA FECHA SE NOS MOSTRARÁ EN UN FORMATO QUE NO ES EL QUE QUEREMOS.
	            	// EN LAS PRÓXIMAS LINEAS VAMOS A VER COMO PODEMOS MODIFICAR EL FORMATO.
	            	Date fechaAlta = usuario.getFechaAlta();
	            	
	            	
	            	//DECLARAMOS UN STRING CON EL PATRON EXACTO QUE QUEREMOS PARA LA FECHA
	            	String patronFecha = "yyyyMMdd" ; 
	            	//CREAMOS UN OBJETO DE LA CLASE SIMPLEDATEFORMAT AL QUE LE PASAMOS COMO PARÁMETRO EL PATRON DE LA LINEA ANTERIOR
	            	SimpleDateFormat nuevoFormatoFecha = new SimpleDateFormat(patronFecha);
	            	// CREAMOS UN STRING QUE VA A GUARDAR LA NUEVA FECHA.
	            	// INICIALIZAMOS EL STRING UTILIZANDO EL OBJETO DE LA CLASE SIMPLEDATEFORMAT QUE CREAMOS EN LA LINEA ANTERIOR
	            	// APLICÁNDOLE EL MÉTODO.FORMAT AL QUE LE PASAMOS COMO PARÁMETRO NUESTRA FECHA ORIGINAL DE TIPO DATE.
	            	String FechaAlta = nuevoFormatoFecha.format(fechaAlta);
	     
	            	
	            	buffer.append(idUsuario + ";");
	            	buffer.append(nombre + ";");
	            	buffer.append(apellido + ";");
	            	buffer.append(dni + ";");
	            	buffer.append(FechaAlta + ";");
	            	buffer.newLine(); // EL MÉTODO .NEWLINE METE UN SALTO DE LINEA.
	            }
	            	//buffer.close(); // CERRARÍAMOS EL BUFFER SI NO LO HUBIERAMOS DECLARADO DENTRO DEL TRY WITHRESOURCES.
	            					  // TODOS LOS MÉTODOS QUE INCLUÍMOS EN EL TRY WITH RESOURCES IMPLEMENTAN LA INTERFAZ
	            					  // AUTOCLOSEABLE POR LO QUE SE CERRARÁN AUTOMÁTICAMENTE.
	            System.out.println("El archivo se ha creado con éxito!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        // EL PROCESO TIENE QUE ESTAR DENTRO DE UN TRY CATCH POR LAS POSIBLES IOEXCEPTION QUE PUEDAN APARECER DURANTE EL PROCESO
	        // DE ESCRITURA COMO NO TENER PERMISOS DE ACCESO AL FICHERO O NO ENCONTRADO.		
		
	}
	
	
	
	
	
	//--- SEGUNDA PARTE DEL EJERCICIO ---//
//	=========================================================
//			Crear entity Productos
//			1. Cargar Productos -> Pedir directorio y nombre del fichero con los datos a cargar
//			2. Mostrar Productos
//			3. Mostrar por Fecha -> Pedir fecha y mostrar los productos dados de alta en ese dia
//			4. Mostrar para cada tipo de producto la media de precio y el total de productos
	
	
	// NECESITAMOS LEER EL FICHERO_PRODUCTOS PARA RESCATAR LOS DATOS Y METERLOS EN UNA LISTA
	// CREAREMOS UN ENTITY "PRODUCTO" Y LO VINCULAREMOS AL FICHERO DE CONFIGURACIÓN PERSISTENCE.XML
	// CADA ATRIBUTO DEL ENTITY CORRESPONDERA CON UNA COLUMNA DEL FICHERO_PRODUCTOS"
	// DE ESTA MANERA, COMO YA TENEMOS LOS DATOS DEL FICHERO EN UNA LISTA, PODEMOS HACER EL INSERT DE
	// LOS DATOS EN LA TABLA PRODUCTOS CREADA POR EL ENTITY A TRAVES DE HIBERNATE.
	
	// DESPUÉS MOSTRAREMOS TODOS LOS PRODUCTOS, (SELECT *)
	// A CONTINUACIÓN LOS MOSTRAREMOS DE NUEVO ORDENADOS POR FECHA
	// POR ÚLTIMO HAREMOS UNA SELECT PARA MOSTRAR CADA TIPO DE PRODUCTO, LA MEDIA DE PRECIO Y EL TOTAL UNIDADES.
	
	
	
	public void leerFichero() {
		
		/*
		 Crearemos el archivo de tipo Path para poder después al método readAllLines.
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
		 */
		
		
	}
		
	
}
