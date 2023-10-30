package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;

public class Guerrero {
	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;
	//El ataque + la resistencia no puede ser mayor que 10
	
	
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}
	/**
	 * @param fuerza the fuerza to set
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	/**
	 * @return the resistencia
	 */
	public int getResistencia() {
		return resistencia;
	}
	/**
	 * @param resistencia the resistencia to set
	 */
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	/**
	 * @param nombre
	 * @param tipo
	 * @param fuerza
	 * @param resistencia
	 */
	public Guerrero(String nombre, String tipo, int fuerza, int resistencia) throws MaxEstadisticasException{
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		if(fuerza+resistencia>10) {
			throw new MaxEstadisticasException("El total fuerza + resistencia no puede superar 10");
		}
			this.fuerza = fuerza;
			this.resistencia = resistencia;
	}
	
	
	
	
	
	
}
