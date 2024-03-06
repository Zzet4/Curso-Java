package curso_java.A5_SQL.PruebasConOracle.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import proyectoExamen.es.curso.utilsProyectoExamen.UtilsDB;

public class PruebaOracleConexionDAO {
	private Connection conexion;
	

	public PruebaOracleConexionDAO(Connection conexion) throws SQLException {
		super();
		this.conexion = UtilsDB.getInstanceOracle();
	}


	public Connection getConexion() {
		return conexion;
	}
	
		

	
}
