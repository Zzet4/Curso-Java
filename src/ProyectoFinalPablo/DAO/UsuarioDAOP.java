package ProyectoFinalPablo.DAO;

import ProyectoFinalPablo.Entities.UsuarioP;
import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;

public class UsuarioDAOP {

	private EntityManager em;
	
	public UsuarioDAOP() {
		em = UtilsHibernate.getEM("ProyectoFinalPablo");
	}
	
	// MÉTODOS DE INTERACCIÓN CON LA BASE DE DATOS.
	public void consultaUsuario(String nombre, String contraseña) {
		
	}
	
	public void insertaUsuario(UsuarioP usuario) {
		this.em.getTransaction().begin();
		this.em.persist(usuario);
		this.em.getTransaction().commit();
	}
	
	public void actualizaUsuario() {
		
	}
	
	public void borraUsuario() {
		
	}
	
	
}
