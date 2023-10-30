package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class Moto extends Vehículo{
	
	private int numRuedas;

	/**
	 * @param numRuedas
	 */
	public Moto(int numRuedas) {
		super();
		this.numRuedas = numRuedas;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La moto tiene " + this.numRuedas + " ruedas y se ha encendido" );
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	

}
