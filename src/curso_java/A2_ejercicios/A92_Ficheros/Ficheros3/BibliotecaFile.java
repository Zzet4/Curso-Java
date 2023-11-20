package curso_java.A2_ejercicios.A92_Ficheros.Ficheros3;

public class BibliotecaFile {
	private String nombreBiblioteca;
	private DireccionBibliotecaFile direccion;
	
	
	public BibliotecaFile(String nombreBiblioteca, DireccionBibliotecaFile direccion) {
		super();
		this.nombreBiblioteca = nombreBiblioteca;
		this.direccion = direccion;
	}
	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}
	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}
	public DireccionBibliotecaFile getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionBibliotecaFile direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "BibliotecaFile [nombreBiblioteca=" + nombreBiblioteca + ", direccion=" + direccion + "]";
	}
	
	
}
