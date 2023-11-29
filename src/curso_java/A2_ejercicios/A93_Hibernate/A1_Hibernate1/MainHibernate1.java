package curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.DAO.UsuarioDAO;
import curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.Entities.Usuario;
import curso_java.A3_Utilidades.Utils;
import curso_java.A3_Utilidades.UtilsFechas.UtilsFecha;
import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;

public class MainHibernate1 {
	private static final Logger logger = LogManager.getLogger(MainHibernate1.class);
	
	public static void main(String[] args) {
		logger.debug("Empezando creación de tablas");
		EntityManager em = UtilsHibernate.getEM("EjemploOracle");
		Usuario usuario1 = new Usuario(1, "Usuario1", "Apellido1", "11111111A", UtilsFecha.generaFecha());
		Usuario usuario2 = new Usuario(2, "Usuario2", "Apellido2", "22222222A", UtilsFecha.generaFecha());
		Usuario usuario3 = new Usuario(3, "Usuario3", "Apellido3", "33333333A");
		
		em.getTransaction().begin();
		em.persist(usuario1);
		em.persist(usuario2);
		em.persist(usuario3);
		em.getTransaction().commit();
		logger.debug("============================================");


		//Consultar todos los registros
		System.out.println("Consultar todos los registros");
		UsuarioDAO usuarioDAO1 = new UsuarioDAO();
		List<Usuario> usuarios = usuarioDAO1.getUsers();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		System.out.println("termina");
		
		
		
		
		
		//Consultar por nombre
		System.out.println("Consultar por nombre (usuario2)");
		List<Usuario> usuariosPorNombre = usuarioDAO1.getUsersByName("Usuario2");
		for (Usuario usuario : usuariosPorNombre) {
			System.out.println(usuario);
		}
		System.out.println("termina2");
		
		
		
		
		
		// Consultar por fecha alta --> a partir de la fecha introducida 
		// todos los que se hayan dado de alta después de esa fecha
		System.out.println("Consultar por fecha (objeto de tipo date)");
		Date fecha = UtilsFecha.generaFecha();
		List<Usuario> usuariosporFecha = usuarioDAO1.getUsersByDate(fecha);
		for (Usuario usuario : usuariosporFecha) {
			System.out.println(usuario);
		}
		System.out.println("termina3");
		
		
		
		// Consultar por nombre y borrar de la base de datos todos los de ese nombre
		System.out.println("Consultar por nombre y borrar (String nombre)");
		String nombreABorrar = Utils.scanString("Seleccione el nombre del usuario que desea borrar");
		//List<Usuario> usuariosporFecha = usuarioDAO1.getUsersByDate(fecha);
		usuarioDAO1.deleteUserByName(nombreABorrar);
		System.out.println("termina3");
		
		
		
		
		// Consultar por DNI y modificarlo en los datos si existe.
		String dniABorrar = Utils.scanString("Seleccione el DNI del usuario que desea modificar");
		usuarioDAO1.deleteUserBydni(dniABorrar, new Usuario(5, "paco", "jimenez", "DNIx"));
		
	}
	
	
	

}
