package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A2_Hospital;

public class Paciente extends Persona{
	
	private String [] sintomas; 



	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param sintomas
	 */
	public Paciente(int id, String nombre, int edad, String[] sintomas) {
		super(id, nombre, edad);
		this.sintomas = sintomas;
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
