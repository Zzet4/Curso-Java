package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Biblioteca1;
import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO.Libro1;
import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO.BibliotecaDAO;
import curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Queries_DAO.LibroDAO;
import curso_java.A3_Utilidades.Utils;

public class MainBiblioteca {

	
	//ATRIBUTOS
	private Map<Integer, Biblioteca1> mapBibliotecas;
	
	//CONSTRUCTOR
	public MainBiblioteca() {
		super();
		this.mapBibliotecas = new HashMap();
	}

	
	//METODO MAIN
	public static void main(String[] args) {	
		
		MainBiblioteca mainBiblioteca = new MainBiblioteca();
//		mainBiblioteca.inicio();
		
	//=================pirnt del menú principal==============================
		
		int opcionMP = 0;
		do {
			opcionMP = Utils.scanInt("\n\n\n========= MENÚ BIBLIOTECAS =========\n\n" +
				" 1. Biblioteca de Getafe.\n" +
				" 2. Biblioteca de Torrejón de Ardoz.\n" +
				" 3. Biblioteca de Alcala de Henares.\n" +
				" 4. Salir.\n" +
				"\nSeleccione una biblioteca.\n"	);
			
			if (opcionMP!=4) {
				int opcion1 = Utils.scanInt(
						"\n========= MENÚ PRINCIPAL =========\n\n" +
						" 1. Mostrar información.\n" +
						" 2. Mostrar catálogo.\n" +
						" 3. Buscar libro.\n" +
						" 4. Insertar libro.\n" +
						" 5. Modificar libro.\n" +
						" 6. Borrar libro.\n" +
						" 7. Volver\n" +
						"\nSeleccione una opción"
					);
				
				
				switch (opcion1) {
				case 1: // Mostrar información de la biblioteca
					mainBiblioteca.mostrarBiblioteca(opcionMP);
					
					break;
				case 2: // Mostrar catálogo.
					mainBiblioteca.muestraLibros(opcionMP);
					break;
				case 3: // Buscar libro.
					
					break;
				case 4: // Insertar libro.
					
					
					mainBiblioteca.insertarLibro();					
					
					break;
				case 5: // Modificar libro.
					break;
				case 6: // Borrar libro.
					break;
				case 7: //Volver\n
					break;
				
				}			
			}else if (opcionMP==4) {
				System.out.println("Hasta pronto");
			}else {System.out.println("Seleccione una de las opciones del menú\n\n");};
			

		}while(opcionMP!=4);
		
		
		
	}		
			

		
		
		
		
	

	
	public void inicio() {
		
		cargarDatosBiblioteca();
		int opcion = crearMenuPrincipal();
				
	
	}
	
	
	public void cargarDatosBiblioteca() {
		
		try {
			BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
			for(Biblioteca1 biblioteca : bibliotecaDAO.getBibliotecas()) {
				System.out.println(biblioteca);
				mapBibliotecas.put(biblioteca.getIdBiblioteca(), biblioteca);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public int crearMenuPrincipal() {
		
		Set<Entry<Integer, Biblioteca1>> entryBiblioteca = mapBibliotecas.entrySet();
		
		for (Entry<Integer, Biblioteca1> entry : entryBiblioteca) {
			System.out.println(entry.getKey() + ". " + entry.getValue().getNombre());
		}
		
		int opcion = Utils.scanInt("Selecciona una opción.");
		
		return opcion;
	}
	
	
	
	
//==================================================================================================================
//==================================================================================================================
	
	public void muestraLibros(int biblioteca){
		
		try {
			LibroDAO libroDAO = new LibroDAO();
			for(Libro1 libro : libroDAO.mostrarLibros(biblioteca)) {
				System.out.println(libro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void mostrarBiblioteca(int opcionMP) {
		try {
			BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();			
			Biblioteca1 biblioteca = bibliotecaDAO.getBiblioteca(opcionMP);
			System.out.println(biblioteca);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void insertarLibro() {
		try {
			LibroDAO libroDAO = new LibroDAO();
			libroDAO.insertarLibro();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}		

	

////=================pirnt del menú principal==============================
//	System.out.println(
//			"\n========= MENÚ PRINCIPAL =========\n\n" +
//	//Select con las biblios
//
//			" 4. Salir.\n" +
//			"\nSeleccione una biblioteca.\n"	
//		);
//	
//	
////==================prints de la biblioteca de Getafe========================
//	System.out.println(
//		"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//		" 1. Mostrar información.\n" +
//		" 2. Mostrar catálogo.\n" +
//		" 3. Buscar libro.\n" +
//		" 4. Insertar libro.\n" +
//		" 5. Modificar libro.\n" +
//		" 6. Borrar libro.\n" +
//		" 7. Volver\n" 		
//	);
//	
//	
//	System.out.println(
//			"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//			" LA INFORMACIÓN DE LA BIBLIOTECA DE GETAFE ES LA SIGUIENTE:\n" +
//			//AQUI EL SELECT A LA INFO DE LA BIBLIO"" +
//			" 7. Volver\n" 		
//		);
//	
//	System.out.println(
//			"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//			" EL CATÁLOGO DE LA BIBLIOTECA DE GETAFE ES EL SIGUIENTE:\n" +
//			//AQUI EL SELECT AL CATÁLOGO DE LA BIBLIO"" +
//			" 7. Volver\n" 		
//		);
//	
//	System.out.println(
//			"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//			" EL CATÁLOGO DE LA BIBLIOTECA DE GETAFE ES EL SIGUIENTE:\n" +
//			//AQUI EL SELECT AL CATÁLOGO DE LA BIBLIO"" +
//			" 7. Volver\n" 		
//		);
//	
//	System.out.println(
//			"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//			" SELECCIONE EL MÉTODO DE BÚSQUEDA\n" +
//			" 1. Buscar por título.\n" +
//			" 2. Buscar por autor.\n" +
//			" 3. Buscar por ISBN.\n" +
//			" 7. Volver\n" 		
//		);
//	
//	
//	System.out.println(
//			"\n========= BIBLIOTECA DE GETAFE =========\n\n" +
//			" INTRODUZCA LOS DATOS DEL LIBRO QUE DESEA INSERTAR\n" 
//			/*		
//			String tituloAAgregar = Utils.scanString("\nIntroduzca el título del libro ");
//			String autor = Utils.scanString("\nIntroduzca el autor del libro ");
//			int numLibros = Utils.scanInt("\nIntroduzca el numero de libros\n");	
//			*/	
//		);

