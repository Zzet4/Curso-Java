package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public class Enfermero extends EmpleadoHospital{
	
	private int planta;

	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Enfermero(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the planta
	 */
	public int getPlanta() {
		return planta;
	}

	/**
	 * @param planta the planta to set
	 */
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	
	
//MÉTODOS.
	
	
	public void atenderPaciente(Paciente paciente) {
		
	}
	
	
	
	
	
	

}
