package curso_java.A2_ejercicios.A92_Ficheros.Ficheros3.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO.ConexionDAO;
import curso_java.A2_ejercicios.A92_Ficheros.Ficheros3.DireccionBibliotecaFile;

public class DireccionDAO extends ConexionDAO{

	public DireccionDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void insertardireccion(DireccionBibliotecaFile direccion) {
		
		 String query = "INSERT INTO TB_DIRECCION (NOMBRE, NUMERO, COD_POSTAL, LOCALIDAD, PROVINCIA, PAIS)" + 
		 "VALUES (?,?,?,?,?,?)";
		 
		 PreparedStatement ps;
		try {
			ps = this.getConexion().prepareStatement(query);
			 ps.setString(1, direccion.getNombreCalle());
			 ps.setInt(2, 0);
			 ps.setInt(3, direccion.getCodigoPostal());
			 ps.setString(4, direccion.getLocalidad());
			 ps.setString(5, direccion.getProvincia());
			 ps.setString(6, "Espania");
			 ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
