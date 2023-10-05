package curso_java.ejercicios.A6_POO.A5_Herencia.A1_Orquesta;

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
