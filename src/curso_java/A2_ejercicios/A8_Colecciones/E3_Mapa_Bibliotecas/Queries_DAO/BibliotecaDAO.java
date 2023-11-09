package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A8_Colecciones.E2_Mapa_Bilbioteca.Biblioteca;
import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Biblioteca1;
import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Direccion1;

public class BibliotecaDAO extends ConexionDAO{
//AQUÍ METEREMOS TODOS LOS MÉTODOS DE LA BIBLIOTECA QUE VAN A INTERACTUAR CON LA BASE DE DATOS
	
	//PRIMERO CREAMOS EL ATRIBUTO CONEXIÓN PARA PODER UTILIZAR DICHA CONEXIÓN EN TODOS LOS MÉTODOS
	//Y CREAMOS SU CONSTRUCTOR PARA INICIALIZAR DICHO ATRIBUTO CUANDO CREEMOS UN OBJETO DE TIPO BIBLIOTECADAO.
	
	public BibliotecaDAO() throws SQLException {
		super();
	}

	
//MÉTODOS DE INTERACCIÓN CON LA BASE DE DATOS
	
	//PARA SACAR TODAS LAS BIBLIOTECAS CREAMOS UN MÉTODO  QUE NOS DEVOLVERÁ UNA LISTA DE BIBLIOTECAS
	public List<Biblioteca1> getBibliotecas () throws SQLException{
		List<Biblioteca1> bibliotecas = new ArrayList<Biblioteca1>();
		this.getConexion(); //LLAMAMOS AL MÉTODO DE CONEXIÓN DE SU CLASE PADRE PARA TENERLA DISPONBILE.
		
		//CREAMOS LA FUNCIONALIDAD QUE NOS MOSTRARÁ TODAS LAS BIBLIOTECAS, ESTO LO VAMOS A HACER A TRAVES
		//DE UNA CONSULTA SQL A LA BASE DE DATOS UTILIZANDO LA CONEXIÓN DE ARRIBA.
		//DEBEREMOS CONSULTAR LA TABLA DE BIBLIOTECAS Y LA DE DIRECCIONES.
		
		Statement stmt = this.getConexion().createStatement(); //CREAMOS UN OBJETO STATEMENT Y LO INICIALIZAMOS CON LA CONEXIÓN LLAMANDO
																//AL MÉTODO CREATESTATEMENT.
		String query = "SELECT b.ID_BIBLIOTECA, b.NOMBRE,\r\n"
				+ "d.nombre, d.numero, d.cod_postal, d.localidad, d.provincia, d.pais\r\n"
				+ "FROM TB_BIBLIOTECA AS b JOIN TB_DIRECCION AS d ON d.ID_DIRECCION=b.FK_DIRECCION;";
		ResultSet rs = stmt.executeQuery(query); //CREAMOS EL OBJETO RESULTSET Y LO INICIALIZAMOS CON LA VARIABLE STATEMENT LLAMANDO
												//AL MÉTODO EXECUTEQUERY
		
		//AHORA VAMOS A RECORRER EL OBJETO RESULSET QUE HEMOS OBTENIDO DE LA QUERY
		while (rs.next()) { //CREAMOS EL PUNTERO Y MIENTRASA HAYA DATO EN LA SIGUIENTE POSICIÓN SIGUE EL BUCLE WHILE
							//POR CADA VUELTA CREA UN VARIABLE PARA CADA ATRIBUTO QUE QUEREMOS RELLENAR EN LOS FUTUROS OBJETOS
							//DIRECCIÓN Y BIBLIOTECA.
			int idBiblioteca = rs.getInt("b.ID_BIBLIOTECA");
			String nombre = rs.getString("b.NOMBRE");
			String nombreDir = rs.getString("d.nombre");
			int numero = rs.getInt("d.numero");
			int codPostal = rs.getInt("d.cod_postal");
			String localidad = rs.getString("d.localidad");
			String provincia = rs.getString("d.provincia");
			String pais = rs.getString("d.pais");
			
			//CREAMOS LOS OBJETOS DIRECCION Y BIBLIOTECA Y LE PASAMOS AL CONSTRUCTOR LAS VARIABLES EN LAS QUE HEMOS GUARDADO ARRIBA
			//LOS DATOS EXTRAIDOS DEL RS(RESULTSET) DE LA QUERY
			Direccion1 direccion1 = new Direccion1(0, nombreDir, numero, codPostal, localidad, provincia, pais);
			Biblioteca1 biblioteca1 = new Biblioteca1(idBiblioteca, nombre, direccion1);
			
			//AÑADIMOS EL OBJETO BIBLIOTECA A LA LISTA QUE DEVOLVERÁ LA LISTA EN CADA VUELTA DEL BUCLE
			bibliotecas.add(biblioteca1);
		}
		return bibliotecas;
	}
	
	//PARA SACAR TODAS LAS BIBLIOTECAS CON LA LOCALIDAD COMO PARÁMETRO.
	public List<Biblioteca1> getBibliotecas (int opcion) {
		List<Biblioteca1> bibliotecas = new ArrayList<Biblioteca1>();
		this.getConexion();
		
		return bibliotecas;
	}
	
	//PARA SACAR UNA BIBLIOTECA
	public Biblioteca1 getBiblioteca (int opcionMP) throws SQLException {
		this.getConexion();
		PreparedStatement prepareStatement = this.getConexion().prepareStatement(
				"SELECT b.nombre, d.nombre, d.numero, d.cod_postal, d.localidad, d.provincia, d.pais\r\n"
				+ "FROM tb_biblioteca as b JOIN tb_direccion as d ON d.id_direccion=b.fk_direccion\r\n"
				+ "WHERE id_biblioteca=?;"
				);
		prepareStatement.setInt(1, opcionMP);
			
		ResultSet rs = prepareStatement.executeQuery();
		Biblioteca1 biblioteca = null;
		while(rs.next()) {

			 String nombre = rs.getString("b.nombre");
			 String nombreCalle = rs.getString("d.nombre");
			 int numero = rs.getInt("d.numero");
			 int codPostal = rs.getInt("d.cod_postal");
			 String localidad = rs.getString("d.localidad");
			 String provincia = rs.getString("d.provincia");
			 String pais = rs.getString("d.pais");	
			
			 Direccion1 direccion = new Direccion1(0, nombreCalle, numero, codPostal, localidad, provincia, pais);
			 biblioteca = new Biblioteca1(0, nombre, direccion); 
		}
		
		
		return biblioteca;
	}
	
	
	
	
	
	
}
