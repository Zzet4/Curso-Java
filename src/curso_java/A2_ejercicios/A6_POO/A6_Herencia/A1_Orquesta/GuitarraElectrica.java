package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A1_Orquesta;

public class GuitarraElectrica extends Guitarra {
	
	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, double potencia) {
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
	
//METODOS
	
	@Override    //Estamos sobreescribiendo el metodo tocar de su clase padre, como su clase padre no lo tiene, esta lo busca a su vez en 
				//su clase padre también y al final puede traerlo.
	public void tocar () {
		System.out.println("Tocando guitarra Electrica puiiiiiiuuuunnninininioooo.");
	}
	

	
	
	

}
