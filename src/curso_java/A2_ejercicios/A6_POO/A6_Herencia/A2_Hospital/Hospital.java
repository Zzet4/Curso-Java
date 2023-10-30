package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A2_Hospital;

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
		
		Habitacion habitacion1 = new Habitacion(1, null);
		Habitacion habitacion2 = new Habitacion(2, null);
		arrayHabitaciones[0] = habitacion1;
		arrayHabitaciones[1] = habitacion2;
		
		
		String [] setSintomas1 = new String[2];
			setSintomas1[0] = " Bomitos  ";
			setSintomas1[1] = " Dolor de estómago ";
		
		String [] setSintomas2 = new String[2];
			setSintomas2[0] = " Fiebre ";
			setSintomas2[1] = " Malestar general  ";	
		
		String [] setSintomas3 = new String[2];
			setSintomas3[0] = " Inflamación ";
			setSintomas3[1] = " Dolor en la zona  ";
		
		
		Paciente paciente1 = new Paciente(01, "Ana", 20, setSintomas1);
		Paciente paciente2 = new Paciente(02, "Sergio", 28, setSintomas2);
		Paciente paciente3 = new Paciente(03, "María", 50, setSintomas3);
		
		Paciente [] arraySalaDeEspera = new Paciente[3];
		arraySalaDeEspera[0]= paciente1;
		arraySalaDeEspera[1]= paciente2;
		arraySalaDeEspera[2]= paciente3;
			
		setArraySalaDeEspera(arraySalaDeEspera);
		
		
		//Enfermo enfermo1 = new Enfermo(1, "Paco", 50);
		
		Persona [] arrayPersonas = new Persona [arrayHabitaciones.length + arraySalaDeEspera.length];
			arrayPersonas[0] = null;
			arrayPersonas[1] = null;
			arrayPersonas[2] = paciente1;
			arrayPersonas[3] = paciente2;
			arrayPersonas[4] = paciente3;
			
			
		Enfermero enfermero1 = new Enfermero(1, "Enfermero1", 30);
		Doctor doctor1 = new Doctor(01, "Doctor1", 42);
		
		EmpleadoHospital [] arrayEmpleados = new EmpleadoHospital[2];
			arrayEmpleados[0] = enfermero1;
			arrayEmpleados[1] = doctor1;
		
			todosAFichar(arrayEmpleados);
			todosAComer(arrayEmpleados, arrayHabitaciones);
			//enfermero1.atenderPaciente(arraySalaDeEspera);
			doctor1.diagnosticar(enfermero1.atenderPaciente(arraySalaDeEspera), arrayHabitaciones);
			
			Paciente pacienteVisto = enfermero1.atenderPaciente(arraySalaDeEspera);
			doctor1.diagnosticar(pacienteVisto, arrayHabitaciones);
			
			
			
			for (Habitacion habitacion : arrayHabitaciones) {
				if(habitacion.getEnfermo()!=null) {
					System.out.println("La habitación " + habitacion.getNumero() + " tiene ingresado al enfermo " + 
							habitacion.getEnfermo().getNombre());
				}
			}
		
	}
	
	
	public void todosAFichar (EmpleadoHospital [] arryEmpleados) {
		
		for (EmpleadoHospital datoEmpleado : arryEmpleados) {
			datoEmpleado.fichar();
		}
		System.out.println();
	}
	
	public void todosAComer (EmpleadoHospital [] arrayEmpleados, Habitacion [] arrayHabitaciones) {
		for (Habitacion habitacion : arrayHabitaciones) {
			if(habitacion.getEnfermo()!=null) {
				habitacion.getEnfermo().comer();
			}
		}
		
		for (EmpleadoHospital empleado : arrayEmpleados) {
			if(empleado!=null) {
				empleado.comer();
			}
		}
		
		for (Paciente paciente : arraySalaDeEspera) {
			if(paciente!=null) {
				paciente.comer();
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
