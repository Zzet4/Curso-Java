package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public class Hospital {
	
	private String nombre;
	private Habitacion [] arrayHabitaciones;
	private Paciente [] arraySalaDeEspera;
	


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the arrayHabitaciones
	 */
	public Habitacion[] getArrayHabitaciones() {
		return arrayHabitaciones;
	}


	/**
	 * @param arrayHabitaciones the arrayHabitaciones to set
	 */
	public void setArrayHabitaciones(Habitacion[] arrayHabitaciones) {
		this.arrayHabitaciones = arrayHabitaciones;
	}


	/**
	 * @return the arraySalaDeEspera
	 */
	public Paciente[] getArraySalaDeEspera() {
		return arraySalaDeEspera;
	}


	/**
	 * @param arraySalaDeEspera the arraySalaDeEspera to set
	 */
	public void setArraySalaDeEspera(Paciente[] arraySalaDeEspera) {
		this.arraySalaDeEspera = arraySalaDeEspera;
	}


	/**
	 * @param nombre
	 * @param habitaciones
	 * @param salaDeEspera
	 */
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.arrayHabitaciones = new Habitacion[2];
		this.arraySalaDeEspera = new Paciente[3];
	}

	
	
//============================================================================================================================================
//============================================================================================================================================

	
//MÉTODOS.

	public static void main (String [] args) {
		
		Hospital hospital1 = new Hospital("Hospital de Torrejón");
		hospital1.abrirHospital();
		
		
	}

	
	public void abrirHospital() {
		
		
		Paciente paciente1 = new Paciente(01, "Ana", 20);
		Paciente paciente2 = new Paciente(02, "Sergio", 28);
		Paciente paciente3 = new Paciente(03, "María", 50);
		
		Paciente [] arrayPacientes = new Paciente[3];
			arrayPacientes[0]= paciente1;
			arrayPacientes[1]= paciente2;
			arrayPacientes[2]= paciente3;
			
		setArraySalaDeEspera(arrayPacientes);
		
		
		Enfermo enfermo1 = new Enfermo(1, "Paco", 50);
		
		Habitacion habitacion1 = new Habitacion(2, null);
		Habitacion habitacion2 = new Habitacion(2, null);
		
		Enfermero enfermero1 = new Enfermero(1, "Enfermero1", 30);
		Doctor doctor1 = new Doctor(01, "Doctor1", 42);
		
		EmpleadoHospital [] arrayEmpleados = new EmpleadoHospital[2];
			arrayEmpleados[0] = enfermero1;
			arrayEmpleados[1] = doctor1;
		
			todosAFichar(arrayEmpleados);
		
		
	}
	

	
	public void todosAFichar (EmpleadoHospital [] arryEmpleados) {
		
		for (EmpleadoHospital datoEmpleado : arryEmpleados) {
			datoEmpleado.fichar();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
