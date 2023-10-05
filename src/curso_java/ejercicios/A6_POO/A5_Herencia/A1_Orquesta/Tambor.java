package curso_java.ejercicios.A6_POO.A5_Herencia.A1_Orquesta;

public class Tambor extends Instrumento{
	
	private String material;


	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material = material;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
//MÉTODOS.
	  
	@Override    //Estamos sobreescribiendo el metodo afinar de su clase padre,
	public void afinar () {
		System.out.println("El tambor se ha afinado.");
	}
	
	public void aporrear () {
		System.out.println("Aporreando Tambor");
	}
	
	

}
