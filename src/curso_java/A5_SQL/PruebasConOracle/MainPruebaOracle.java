package curso_java.A5_SQL.PruebasConOracle;

import java.sql.Connection;
import java.sql.SQLException;

import proyectoExamen.es.curso.utilsProyectoExamen.UtilsDB;

public class MainPruebaOracle {
	public static void main(String[] args) {
		MainPruebaOracle prueba = new MainPruebaOracle();
		
		
		
		try {
			Connection conexion = UtilsDB.getInstanceOracle();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
