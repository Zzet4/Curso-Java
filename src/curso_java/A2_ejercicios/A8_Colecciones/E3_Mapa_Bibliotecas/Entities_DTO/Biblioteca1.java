package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO;

public class Biblioteca1 {
	private int idBiblioteca;
	private String nombre;
	private Direccion1 direccion;
	//AUNQUE LA TABLA NO TIENE UN CAMPO DIRECCIÓN, SE LO PONEMOS A LA CLASE BIBLIOTECA POR QUE REALMENTE
	//CADA BIBLIOTECA TIENE UNA DIRECCIÓN ASOCIADA QUE DESPUÉS PODREMOS RECUPERAR MEDIANTE CONSULTAS SQL
	
	
	//CONSTRUCTOR DE BIBLIOTECA
	public Biblioteca1(int idBiblioteca, String nombre, Direccion1 direccion) {
		super();
		this.idBiblioteca = idBiblioteca;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	
	//GETTERS & SETTERS
	public int getIdBiblioteca() {
		return idBiblioteca;
	}
	public void setIdBiblioteca(int idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion1 getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion1 direccion) {
		this.direccion = direccion;
	}
	
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Biblioteca1 [idBiblioteca=" + idBiblioteca + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
