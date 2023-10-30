package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class Usuario {
	
	private Movil movil;
	private TV tv;
	private Moto moto;
	private Coche coche;
	private Juguete juguete;
	/**
	 * @param movil
	 * @param tv
	 * @param moto
	 * @param coche
	 */
	public Usuario(Movil movil, TV tv, Moto moto, Coche coche, Juguete juguete) {
		super();
		this.movil = movil;
		this.tv = tv;
		this.moto = moto;
		this.coche = coche;
	}
	/**
	 * @return the movil
	 */
	public Movil getMovil() {
		return movil;
	}
	/**
	 * @param movil the movil to set
	 */
	public void setMovil(Movil movil) {
		this.movil = movil;
	}
	/**
	 * @return the tv
	 */
	public TV getTv() {
		return tv;
	}
	/**
	 * @param tv the tv to set
	 */
	public void setTv(TV tv) {
		this.tv = tv;
	}
	/**
	 * @return the moto
	 */
	public Moto getMoto() {
		return moto;
	}
	/**
	 * @param moto the moto to set
	 */
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	/**
	 * @return the coche
	 */
	public Coche getCoche() {
		return coche;
	}
	/**
	 * @param coche the coche to set
	 */
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	/**
	 * @return the juguete
	 */
	public Juguete getJuguete() {
		return juguete;
	}
	/**
	 * @param juguete the juguete to set
	 */
	public void setJuguete(Juguete juguete) {
		this.juguete = juguete;
	}
	

	
	
}
