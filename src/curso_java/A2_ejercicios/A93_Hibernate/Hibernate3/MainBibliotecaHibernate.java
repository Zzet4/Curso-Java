package curso_java.A2_ejercicios.A93_Hibernate.Hibernate3;

import java.util.List;

import curso_java.A2_ejercicios.A8_Colecciones.E2_Mapa_Bilbioteca.Biblioteca;
import curso_java.A2_ejercicios.A93_Hibernate.Hibernate3.Entities.BibliotecaEntityHibernate;
import curso_java.A2_ejercicios.A93_Hibernate.relations.unounounidireccional.entities.Direccion;
import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class MainBibliotecaHibernate {

	public static void main(String[] args) {
 
		//CONSEGUIMOS EL ENTITY MANAGER PASANDOLE EL PERSISTENCE UNIT DE ORACLE
		EntityManager em = UtilsHibernate.getEM("EjemploOracle");
		//LE DAMOS LA TRANSACCIÓN AL EM.
		EntityTransaction transaction = em.getTransaction();
		
		//CREAMOS LOS OBJETOS DIRECCIÓN Y BIBLIOTECA
		Direccion direccion1 = new Direccion();
		direccion1.setCalle("Calle1");
		direccion1.setCodigoPostal("28850");
		
		BibliotecaEntityHibernate biblioteca1 = new BibliotecaEntityHibernate();
		biblioteca1.setNombre("Biblio uno");
		biblioteca1.setDireccion(direccion1);
		
		// INICIAMOS LA TRANSACCIÓN PARA CREAR EL PERSIST Y LO METEMOS EN UN TRY CATCH POR SI DA FALLO 
		// QUE PUEDA HACER ROLLBACK.
		try {
			em.getTransaction().begin();
			em.persist(biblioteca1);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	
		// HACEMOS AHORA UNA CONSULTA
		// CONSULTAMOS TODAS LAS BIBLIOTECAS Y NOS DEVOLVERÁ UN OBJETO DE TIPO TYPEDQUERY LLAMADO QUERY
		// QUE DESPUÉS METEREMOS EN UNA LISTA DE BIBLIOTECAS CON EL OBJETO QUERY LLAMANDO AL METODO GETRESULTLIST
		TypedQuery<Biblioteca> query = em.createQuery("FROM BIBLIOTECA", Biblioteca.class);
		List<Biblioteca> bibliotecas = query.getResultList();
		
		
		//PRIMERA FORMA DE IMPRIMIR LA LISTA RECORRIENDO UN FOREACH EN UNA LINEA CON INTERFACES FUNCIONALES
		bibliotecas.forEach(biblioteca -> System.out.println(biblioteca));
		
		//SEGUNDA FORMA DE IMPRIMIR LA LISTA RECORRIENDO UN FOREACH EN UNA LINEA CON INTERFACES FUNCIONALES
		bibliotecas.forEach(System.out::println);
	}

}
