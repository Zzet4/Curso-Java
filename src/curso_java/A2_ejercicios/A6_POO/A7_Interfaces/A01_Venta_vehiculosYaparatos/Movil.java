package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class Movil extends DispositivoElectronico{
	
	private String sistemaOperativo;

	/**
	 * @param sistemaOperativo
	 */
	public Movil(String sistemaOperativo) {
		super();
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public void encender() {
		System.out.println("El movil " + this.sistemaOperativo + " se ha encendido" );
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the sistemaOperativo
	 */
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	/**
	 * @param sistemaOperativo the sistemaOperativo to set
	 */
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	

	
	
	
	
	
	
}
