package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public class Enfermo extends Persona{

	private String enfermedad;


	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Enfermo(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the enfermedad
	 */
	public String getEnfermedad() {
		return enfermedad;
	}

	/**
	 * @param enfermedad the enfermedad to set
	 */
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	
	
//MÉTODOS.
	
	
	@Override
	public void comer() {
		System.out.println(this.getNombre() + " está comiendo en la habitación.");
		
	}
	
	
	
	
	
	
	
	

}
