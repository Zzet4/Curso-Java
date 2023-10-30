package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A2_Hospital;

public class EmpleadoHospital extends Persona {
	
	private String turno;

	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public EmpleadoHospital(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
//MÉTODOS.
	
	
	public void fichar() {
		System.out.println(this.getNombre() + " esta fichando.");
		
	}


	@Override
	public void comer() {
		System.out.println(this.getNombre() + " está comiendo en el comedor.");
		
	}
	
	
	
	
	

}
