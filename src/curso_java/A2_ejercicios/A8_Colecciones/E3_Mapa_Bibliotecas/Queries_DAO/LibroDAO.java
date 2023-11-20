package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Libro1;
import curso_java.A3_Utilidades.Utils;

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
		
		String nombreLibro = Utils.scanString("Introduzca el nombre del libro");
		String autorLibro = Utils.scanString("Introduzca el nombre del autor del libro");
		int isbnLibro = Utils.scanInt("Introduzca el isbn del libro");
		String descripcionLibro = Utils.scanString("Introduzca una descripción para el libro");
		int numBiblioteca = Utils.scanInt("Introduzca el número de la biblioteca donde se inserta el libro");
		
		//RESCATAMOS LA CONEXIÓN HEREDADA DE LA CLASE PADRE CONEXIONDAO.
		this.getConexion();
		
		PreparedStatement prepareStatement = this.getConexion().prepareStatement(
				"INSERT INTO TB_LIBRO (NOMBRE, AUTOR, ISBN, DESCRIPCION, FK_BIBLIOTECA)\r\n"
				+ "VALUES (?, ?, ?, ?, ?);\r\n"
				);
		prepareStatement.setString(1, nombreLibro);
		prepareStatement.setString(2, autorLibro);
		prepareStatement.setInt(3, isbnLibro);
		prepareStatement.setString(4, descripcionLibro);
		prepareStatement.setInt(5, numBiblioteca);
		
		ResultSet rs = prepareStatement.executeQuery();
		
		while(rs.next()) {
			 int idLibro = 0;
			 String tituloLibro = rs.getString("NOMBRE");
			 String autor = rs.getString("AUTOR");
			 int isbn = rs.getInt("ISBN");
			 String descripcion = rs.getString("DESCRIPCION");	
			 int Biblioteca = rs.getInt("FK_BIBLIOTECA");
			 Libro1 libro = new Libro1(idLibro, tituloLibro, autor, isbn, descripcion, numBiblioteca);
			 
			 System.out.println("El libro que se va a insertar es el siguiente\n" + libro);
			 
		}	
	}
	
	
	//MÉTODO PARA MODIFICAR UN LIBRO.
	public void modificarLibro() {
		
	}
	
	
	//MÉTODO PARA BORRAR UN LIBRO.
	public void borrarLibro() {
		
	}
	
	
	
	

}
