package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A1_Orquesta;

public class Guitarra extends Instrumento{
	
	private int numCuerdas;

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}


	
//METODOS
	
	@Override   //Estamos sobreescribiendo el metodo afinar de su clase padre,
	public void afinar () {
		System.out.println("La guitarra se ha afinado.");
	}
	
	

}
