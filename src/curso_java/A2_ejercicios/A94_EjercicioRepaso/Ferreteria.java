package curso_java.A2_ejercicios.A94_EjercicioRepaso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ferreteria {
	
	private int id;
	private String nombre;
	private String direccion;
	private Tornillo [] tornillos;
	
	
	
	public Ferreteria(int id, String nombre, String direccion, Tornillo[] tornillos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tornillos = tornillos;
	}
	
	public Ferreteria(Tornillo [] tornillos) {
		super();
		Properties prop = new Properties();
		try {
			FileInputStream archivo = new FileInputStream("src/curso_java/A2_ejercicios/A94_EjercicioRepaso/DatosFerreteria.properties");
			prop.load(archivo);
		} catch (FileNotFoundException e) {
			System.out.println("Ha habido un error");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("Ha habido un error");
			e.printStackTrace();
		}
		
		this.id = Integer.parseInt(prop.getProperty("id.ferreteria"));
		this.nombre = prop.getProperty("nombre.ferreteria");
		this.direccion = prop.getProperty("direccion.ferreteria");
		this.tornillos = tornillos;
		}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Tornillo[] getTornillos() {
		return tornillos;
	}
	public void setTornillos(Tornillo[] tornillos) {
		this.tornillos = tornillos;
	}
	
	
	
	

}
