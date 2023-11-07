package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Libro1;

public class LibroDAO extends ConexionDAO{

	
//MÉTODO VACÍO PARA HEREDAR LA CONEXION
	public LibroDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}


	
//METODOS PARA LA INTERACCIÓN CON LA BASE DE DATOS.
	
	//MÉTODO PARA MOSTRAR TODOS LOS LIBROS DE UNA BIBLIOTECA
	public List<Libro1>  mostrarLibros(int biblioteca) throws SQLException {
		//CREAMOS LA LISTA DE LIBROS QUE VAMOS A DEVOLVER CON EL MÉTODO
		List<Libro1> libros = new ArrayList<Libro1>();
		//RESCATAMOS LA CONEXIÓN HEREDADA DE LA CLASE PADRE CONEXIONDAO.
		this.getConexion();
		
		//CREAMOS UN OBJETO STATEMENT Y LO INICIALIZAMOS CON LA CONEXIÓN
		//LLAMANDO AL MÉTODO CREATESTATEMENT
		PreparedStatement prepareStatement = this.getConexion().prepareStatement(
				"SELECT ID_LIBRO, NOMBRE, AUTOR, ISBN, DESCRIPCION, FK_BIBLIOTECA\r\n"
				+ "FROM TB_LIBRO\r\n"
				+ "WHERE FK_BIBLIOTECA = ?;");
		prepareStatement.setInt(1, biblioteca);
		
		ResultSet rs = prepareStatement.executeQuery();
		
		while(rs.next()) {
			 int idLibro = rs.getInt("ID_LIBRO");
			 String nombreLibro = rs.getString("NOMBRE");
			 String autor = rs.getString("AUTOR");
			 int isbn = rs.getInt("ISBN");
			 String descripcion = rs.getString("DESCRIPCION");
			 int numBiblioteca = rs.getInt("FK_BIBLIOTECA");
			
			 Libro1 libro = new Libro1(idLibro, nombreLibro, autor, isbn, descripcion, numBiblioteca);
			
			 libros.add(libro);
		}
		return libros;
	}
	
	
	//MÉTODO PARA BUSCAR UN LIBRO.
	public void buscarLibro() {
		
	}
	
	
	//MÉTODO PARA INSERTAR UN LIBRO.
	public void insertarLibro() throws SQLException {
		//RESCATAMOS LA CONEXIÓN HEREDADA DE LA CLASE PADRE CONEXIONDAO.
		this.getConexion();
		
		//CREAMOS UN OBJETO STATEMENT Y LO INICIALIZAMOS CON LA CONEXION
		//LLAMANDO AL MÉTODO CREATESTATEMENT.
		Statement stmt = this.getConexion().createStatement();
		
		//CREAMOS LA QUERY QUE NECESITAREMOS EN LA FUNCIONALIDAD.
		String query = "";
		
		
	}
	
	
	//MÉTODO PARA MODIFICAR UN LIBRO.
	public void modificarLibro() {
		
	}
	
	
	//MÉTODO PARA BORRAR UN LIBRO.
	public void borrarLibro() {
		
	}
	
	
	
	

}
