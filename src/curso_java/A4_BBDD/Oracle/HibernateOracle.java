package curso_java.A4_BBDD.Oracle;

import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;

public class HibernateOracle {
	public static void main (String [] args) {
		
		// PROBAMOS LA CONEXIÓN QUE SINCRONIZARÁ TODOS LOS ENTITIES QUE ESTÉN 
		// DEFINIDOS EN LA PERSISTENCE UNIT QUE HEMOS DEFINIDO 
		EntityManager em = UtilsHibernate.getEM("EjemploOracle");
		
		
		
		
		
		
		
		
	}

}
