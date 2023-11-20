package curso_java.A2_ejercicios.A92_Ficheros.Ficheros3;

public class DireccionBibliotecaFile {
	private String nombreCalle;
	private int numero;
	private int codigoPostal;
	private String localidad;
	private String provincia;
	private String pais;
	public DireccionBibliotecaFile(String nombreCalle, int codigoPostal, String localidad, String provincia) {
		super();
		this.nombreCalle = nombreCalle;
		this.numero = 0;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = "Espania";
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
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
	@Override
	public String toString() {
		return "DireccionBibliotecaFile [nombreCalle=" + nombreCalle + ", numero=" + numero + ", codigoPostal="
				+ codigoPostal + ", localidad=" + localidad + ", provincia=" + provincia + ", pais=" + pais + "]";
	}
	
	
	
	
	

}
