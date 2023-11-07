package curso_java.A2_ejercicios.A8_Colecciones.E3_Mapa_Bibliotecas.Entities_DTO;

public class Direccion1 {
	//ATRIBUTOS
	private int idDireccion;
	private String nombre;
	private int numero;
	private int codPostal;
	private String localidad;
	private String provincia;
	private String pais;
	
	
	//MÉTODO CONSTRUCTOR
	public Direccion1(int idDireccion, String nombre, int numero, int codPostal, String localidad, String provincia,
			String pais) {
		super();
		this.idDireccion = idDireccion;
		this.nombre = nombre;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	
	//GETTERS & SETTERS.
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Direccion1 [idDireccion=" + idDireccion + ", nombre=" + nombre + ", numero=" + numero + ", codPostal="
				+ codPostal + ", localidad=" + localidad + ", provincia=" + provincia + ", pais=" + pais + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



