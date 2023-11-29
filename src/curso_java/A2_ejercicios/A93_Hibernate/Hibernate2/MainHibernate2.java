package curso_java.A2_ejercicios.A93_Hibernate.Hibernate2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		
	}
	
	
	
	
	
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
	public void crearFichero(String nombreFichero) {
	 //Este método para crear un archivo se utiliza cuando hay mucha información que se va a añadir.
	        File archivo = new File(nombreFichero);
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
	
	
}
