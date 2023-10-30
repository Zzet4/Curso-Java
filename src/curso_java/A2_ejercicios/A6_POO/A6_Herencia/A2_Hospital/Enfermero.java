package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A2_Hospital;

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
	
	
	public Paciente atenderPaciente(Paciente [] arraySalaDeEspera) {
		Paciente pacienteVisto = null;
		
		for (int i=0   ; i<arraySalaDeEspera.length  ; i++  ) {
			if (arraySalaDeEspera[i]!=null) {
				pacienteVisto = arraySalaDeEspera[i];
				arraySalaDeEspera[i]=null;
				break;
			}
		}		
		
		return pacienteVisto;
	}
	
	
	
	
	
	

}
