package curso_java.ejercicios.A6_POO.A5_Herencia.A1_Orquesta;

public class Piano extends Instrumento {
	
	private int numeroOctavas;
	private String tipoPiano;
	
	
	public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}


	
	public int getNumeroOctavas() {
		return numeroOctavas;
	}


	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}


	public String getTipoPiano() {
		return tipoPiano;
	}


	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}
	
	
	
//MÉTODOS
	
	@Override   //Estamos sobreescribiendo el metodo afinar de su clase padre,
	public void afinar () {
		System.out.println("El piano se ha afinado.");
	}	
	
	
	
	

}
