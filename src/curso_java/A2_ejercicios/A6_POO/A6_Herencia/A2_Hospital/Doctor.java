package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A2_Hospital;

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

	public void diagnosticar(Paciente pacienteVisto, Habitacion [] arrayHabitaciones) {
		Enfermo enfermoA = null;
		int randomEnfermo = ((int) (Math.random()*10));
		
		if (randomEnfermo>=6) {
			enfermoA = new Enfermo(pacienteVisto.getId(), pacienteVisto.getNombre(), pacienteVisto.getEdad());
		}else {
			System.out.println("Tomese paracetamol cada 8 horas y descanse.");
		}
		
		boolean pacienteUbicado = false;
		for (Habitacion habitacion : arrayHabitaciones) {
			if(habitacion.getEnfermo()==null) {
				habitacion.setEnfermo (enfermoA);
				pacienteUbicado = true;
				break;
			}
		}
		
		if(pacienteUbicado==false) {
			System.out.println("Lo siento, no tenemos habitaciones disponibles.");
			//trhow
		}
			
	}
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

