package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;
import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxUnirseException;
import curso_java.A3_Utilidades.UtilsDB;

public class TristanBBDD {
	public static void main(String [] args) {
		TristanBBDD tristan = new TristanBBDD();
		tristan.empezarGuerra();
		
	}
	
	
	private void empezarGuerra() {
		
		
		
		
	}
	
	
//Metodo para traer los pelotones de la tabla tb_peloton de la base de datos guerra	
	private List<Peloton> getPeloton() throws SQLException, MaxUnirseException, MaxEstadisticasException{
		List<Peloton> pelotones = null;
		Connection connection = UtilsDB.getInstance();
		
		try(
			
			Statement stmt =  connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_PELOTON");
		){
			pelotones = new ArrayList<Peloton>();
			while(rs.next()){
				long id = rs.getLong("ID");
				String tipo = rs.getString("tipo");
				String nombre = rs.getString("nombre");
				int ataque = rs.getInt("ataque");
				int defensa = rs.getInt("defensa");

				if (tipo.equals("jinetesTristan")) {
					Peloton jinetes = new MaquinaAsedio(ataque, defensa, nombre);
					jinetes.setId(id);
					pelotones.add(jinetes);
				}else {
					Peloton carro = new Caballeria(ataque, defensa, nombre);
					carro.setId(id);
					pelotones.add(carro);
				}
			}

		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return pelotones;
	}
	

	
	
	
	
//Metodo para traer los guerreros de la tabla tb_guerreros de la base de datos guerra y los unimos a los pelotones obtenidos del metodo anterior
	private List<Peloton> reclutamiento(List<Peloton> pelotones)throws SQLException, MaxUnirseException, MaxEstadisticasException{
		List<Peloton> guerreros = null;
		Connection connection = UtilsDB.getInstance();
		
		try(
			Statement stmt =  connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_GUERRERO");
		){
			guerreros = new ArrayList<Peloton>();
			while(rs.next()){
				String nombre = rs.getString("nombre");
				int ataque = rs.getInt("fuerza");
				int defensa = rs.getInt("resistencia");
				int vehiculo_ID = rs.getInt("vehiculo_id");

				Guerrero guerrero = new Guerrero(nombre, "", defensa, ataque );
				for(Peloton peloton : pelotones) {
					peloton.unirse(guerrero);
				}	
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return guerreros;
		
		
	}
	
	
	
	
//Metodo para general la lista que unifique los vehículos llenos
	private List<Peloton> getPelotonGuerreros()throws SQLException, MaxEstadisticasException, MaxUnirseException{ //Podemos hacer el throws en la declaracion
																													// de este método o hacer dentro ya los
																													//try catch para controlarlo aqui en vez	
																													//de hacerlo en el metodo empezarGuerra.
		List<Peloton> pelotonesFinales = getPeloton();
		pelotonesFinales = reclutamiento(pelotonesFinales);
		
		

		return pelotonesFinales;
	}
	
	
	

}

