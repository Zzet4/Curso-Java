package curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.DAO;

import java.util.Date;
import java.util.List;

import curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.Entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import utils.UtilsHibernate;

public class UsuarioDAO {
	
	private EntityManager em;
	
	public UsuarioDAO() {
		em = UtilsHibernate.getEM("EjemploOracle");
	}
	
	
	public List<Usuario> getUsers() {
		List<Usuario> usuarios;
		usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
		return usuarios;
	}
	
	
	public List<Usuario> getUsersByName(String name) {
		List<Usuario> usuarios;
		Query query = em.createQuery("from Usuario u where u.nombre=?1", Usuario.class);
		query.setParameter(1, name);
		usuarios = query.getResultList();
		return usuarios;
	}
	
	public List<Usuario> getUsersByDate(Date fecha) {
		List<Usuario> usuarios;
		Query query = em.createQuery("from Usuario u where u.fechaAlta>=?1", Usuario.class);
		query.setParameter(1, fecha);
		usuarios = query.getResultList();
		return usuarios;
	}
	
	
	public void insert() {

	}
	
	public void deleteUserByName(String name) {
		List<Usuario> usuarios = getUsersByName(name);
		em.getTransaction().begin();
		
		try {
			for (Usuario usuario : usuarios) {
				em.remove(usuario);
			}
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
		}	
	}
	
	
	
	
	
	public void deleteUserBydni(String dni, Usuario usuarioModificado) {
		List<Usuario> usuarios = getUsersByName(dni);

		TypedQuery<Usuario> query = em.createQuery("frin Usuario where dni=?1", Usuario.class);
		query.setParameter(1, dni);
		em.getTransaction().begin();
		try {
			Usuario user = query.getSingleResult();
			user.setNombre(usuarioModificado.getNombre());
			user.setApellidos(usuarioModificado.getApellidos());
			user.setFechaAlta(usuarioModificado.getFechaAlta());
			em.merge(user);
			em.getTransaction().commit();
			
		}catch(NoResultException nre) {
			System.out.println("Dni " + dni + " no encontrado");
		
		}catch(Exception e) {
			em.getTransaction().rollback();
			
		}
		
		
	}

	

}
