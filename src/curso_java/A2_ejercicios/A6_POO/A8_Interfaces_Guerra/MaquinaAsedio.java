package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;
import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxUnirseException;

public class MaquinaAsedio extends Peloton {



	/**
	 * @param ataque
	 * @param defensa
	 * @param nombre
	 * @throws MaxEstadisticasException
	 */
	public MaquinaAsedio(int ataque, int defensa, String nombre) throws MaxEstadisticasException {
		super(ataque, defensa, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void unirse(Guerrero guerrero) throws MaxUnirseException {
		// TODO Auto-generated method stub
		super.unirse(guerrero);
	}

	@Override
	public int atacar() {
		System.out.println("La máquina de asedio avanza aplastando todo a su paso");
		return super.atacar();
	}

	@Override
	public int defender(int ataque) {
		System.out.println("\nLos demonios refuerzan el casco de la máquina de guerra para resistir en embate de la caballería nephalem");
		return super.defender(ataque);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
