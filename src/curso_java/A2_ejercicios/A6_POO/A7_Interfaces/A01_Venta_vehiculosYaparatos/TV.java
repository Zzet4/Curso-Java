package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class TV extends DispositivoElectronico{
	
	private int numHDMI;

	/**
	 * @param numHDMI
	 */
	public TV(int numHDMI) {
		super();
		this.numHDMI = numHDMI;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the numHDMI
	 */
	public int getNumHDMI() {
		return numHDMI;
	}

	/**
	 * @param numHDMI the numHDMI to set
	 */
	public void setNumHDMI(int numHDMI) {
		this.numHDMI = numHDMI;
	}
	
	
	
	
	
}

