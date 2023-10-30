package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class Coche extends Vehículo {
	
	private int numPuertas;

	/**
	 * @param numPuertas
	 */
	public Coche(int numPuertas) {
		super();
		this.numPuertas = numPuertas;
	}

	@Override
	public void encender() {
		System.out.println("El coche tiene " + this.numPuertas + " puertas y se ha encendido" );
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}



	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}



	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}






	
	

	
	//Num puertas
	
}
