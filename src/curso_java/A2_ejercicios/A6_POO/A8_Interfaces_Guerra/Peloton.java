package curso_java.A2_ejercicios.A6_POO.A8_Interfaces_Guerra;

import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxEstadisticasException;
import curso_java.A2_ejercicios.A6_POO.A8_Interfaces_2.A00_Excepciones.MaxUnirseException;

public abstract class Peloton implements Ejercito {
	
	private long id;
	private int vitalidad;
	private int ataque;
	private int defensa;
	private String nombre;
	private List<Guerrero> unidades;
	//La suma de ataque + defensa no puede ser mas de 10
	

	
	
	/**
	 * CONSTRUCTOR PARA QUE LA CLASE HIJA PUEDA HEREDARLO.
	 * @param vitalidad
	 * @param ataque
	 * @param defensa
	 * @param nombre
	 * @param unidades
	 */
	public Peloton(int ataque, int defensa, String nombre) throws MaxEstadisticasException {
		super();
		this.vitalidad = 20;
		if(ataque+defensa>10) {throw new MaxEstadisticasException("El total ataque + defensa no puede superar 10 puntos");}
		this.ataque = ataque;
		this.defensa = defensa;
		this.nombre = nombre;
		this.unidades = new ArrayList<Guerrero>();
	} 
	
	
	
	
	
	
	public long getId() {
		return id;
	}






	public void setId(long id) {
		this.id = id;
	}






	/**
	 * @return the vitalidad
	 */
	int getVitalidad() {
		return vitalidad;
	}






	/**
	 * @param vitalidad the vitalidad to set
	 */
	void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}






	/**
	 * @return the ataque
	 */
	int getAtaque() {
		return ataque;
	}






	/**
	 * @param ataque the ataque to set
	 */
	void setAtaque(int ataque) {
		this.ataque = ataque;
	}






	/**
	 * @return the defensa
	 */
	int getDefensa() {
		return defensa;
	}






	/**
	 * @param defensa the defensa to set
	 */
	void setDefensa(int defensa) {
		this.defensa = defensa;
	}






	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}






	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}






	/**
	 * @return the unidades
	 */
	List<Guerrero> getUnidades() {
		return unidades;
	}






	/**
	 * @param unidades the unidades to set
	 */
	void setUnidades(List<Guerrero> unidades) {
		this.unidades = unidades;
	}






	@Override
	public String toString() {
		return "Peloton [vitalidad=" + vitalidad + ", ataque=" + ataque + ", defensa=" + defensa + ", nombre=" + nombre
				+ ", unidades=" + unidades + "]";
	}






	public void unirse (Guerrero guerrero) throws MaxUnirseException { //Máximo 10 guerreros por peloton.
		if(this.unidades.size()<10) {
			this.unidades.add(guerrero);
		}else {
			MaxUnirseException maximoUnionesSuperado = new MaxUnirseException("Has alcanzado el tamaño máximo (10) del pelotón");
			throw maximoUnionesSuperado;
		}
	}



	@Override
	public int atacar() {
		double randomAtkPeloton = (Math.random()*1);
		double randomAtkUnidades = (Math.random()*0.5);
		
		int fuerzaAtaquePeloton=(int)(this.getAtaque()*randomAtkPeloton);
		int totalAtkUnidades = 0;
		if(this.getUnidades().isEmpty()) {
			System.out.println("Lo siento, en el pelotón no hay guerreros para atacar");
		}else {
			for (Guerrero heroe : this.getUnidades()) {
				totalAtkUnidades += heroe.getFuerza();
			}
		}
		
		int totalAtaque = (int)((fuerzaAtaquePeloton+(totalAtkUnidades*randomAtkUnidades)));
		System.out.println("La fuerza del ataque es de " + totalAtaque + " puntos\n");
		return totalAtaque;
	}



	@Override
	public int defender(int ataque) {
		double randomDefPeloton = (Math.random()*1);
		double randomDefUnidades = (Math.random()*0.5);
		
		int totalDefensa=(int)(this.getDefensa()*randomDefPeloton);
		int totalDefUnidades = 0;
		if(this.getUnidades().isEmpty()) {
			System.out.println("Lo siento, en el pelotón no hay guerreros para defender");
		}else {
			for (Guerrero heroe : this.getUnidades()) {
				totalDefUnidades += heroe.getResistencia();
			}
		}
		totalDefUnidades *= randomDefUnidades;
		totalDefensa += totalDefUnidades;
		System.out.println("La defensa generada es de " + totalDefensa);
		int danio =  ataque - totalDefensa;
		if(danio <= 0) {
			System.out.println("\nLas defensas han aguantado el ataque");
			return 0;
		}else {
			System.out.println("\nEl daño sufrido es de " + danio + "puntos\n");
			return danio;
		}
	}
	
	
	

}
