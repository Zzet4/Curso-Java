package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public class Paciente extends Persona{
	
	private String [] sintomas; 

	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Paciente(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @return the sintomas
	 */
	public String[] getSintomas() {
		return sintomas;
	}



	/**
	 * @param sintomas the sintomas to set
	 */
	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}



	
	
	
//MÉTODOS.
	@Override
	public void comer() {
		System.out.println(this.getNombre() + " está comiendo en la cafetería.");
	}
	
	
	
	

}
