package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public class Doctor extends EmpleadoHospital{

	private String especialidad;

	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Doctor(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
//MÉTODOS.
	
	
	
	public void diagnosticar(Paciente paciente) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
