package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import java.util.List;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;
import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxUnirseException;

public class Caballeria extends Peloton {



	/**
	 * @param vitalidad
	 * @param ataque
	 * @param defensa
	 * @param nombre
	 * @param unidades
	 * @throws MaxEstadisticasException
	 */
	public Caballeria(int ataque, int defensa, String nombre)throws MaxEstadisticasException {
		super(ataque, defensa, nombre);
	}

	@Override
	public int atacar() {
		System.out.println("La caballería de los Nephalem carga contra los ejercitos demoniácos");
		return super.atacar();
		
	}

	@Override
	public int defender(int ataque) {
		System.out.println("\nLa caballería de los Nephalem se proteje de la embestida de la máquina de asedio");
		return super.defender(ataque);
	}
	



	
	
}
