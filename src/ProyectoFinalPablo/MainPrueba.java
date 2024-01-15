package ProyectoFinalPablo;

import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ProyectoFinalPablo.DAO.UsuarioDAOP;
import ProyectoFinalPablo.Entities.UsuarioP;
import curso_java.A3_Utilidades.UtilsJPA.UtilsHibernate;
import jakarta.persistence.EntityManager;

public class MainPrueba {
	private static final Logger logger = LogManager.getLogger(MainPrueba.class);
	
	public static void main(String[] args) {
		logger.debug("Empezando creación de tablas");
		EntityManager em = UtilsHibernate.getEM("ProyectoFinalPablo");
		
		Date fechaNacimiento1 = null;
		Calendar calendario = Calendar.getInstance();

        //calendario.set(2022, Calendar.NOVEMBER, 1, 7, PM, 20, 10, 125);
        calendario.set(Calendar.YEAR, 1988);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 1);
        fechaNacimiento1=calendario.getTime();
        
		UsuarioP usuario1 = new UsuarioP("Alejandro", "Montalvo", "11111111A", "M", "password1", "usuario1@outlook.com", 111111111, fechaNacimiento1);
		UsuarioDAOP usuarioEnlace = new UsuarioDAOP();
		usuarioEnlace.insertaUsuario(usuario1);
	}

}
