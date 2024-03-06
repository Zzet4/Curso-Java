package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO;

import java.sql.Connection;
import java.sql.SQLException;

import utils.UtilsDB;

public abstract class ConexionDAO {
	private Connection conexion;
	
	public ConexionDAO() throws SQLException {
		super();
		this.conexion = UtilsDB.getInstance();
	}

	
	//CREAMOS EL GET CONEXION PARA PODER RECUPERAR ESTA CONEXIÓN DESDE CUALQUIER CLASE 
	//QUE HEREDE DE ESTA.
	public Connection getConexion() {
		return conexion;
	}

	
	
	
	
	
	
	
	
	
}
