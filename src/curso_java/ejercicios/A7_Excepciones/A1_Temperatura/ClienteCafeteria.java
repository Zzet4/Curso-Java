package curso_java.ejercicios.A7_Excepciones.A1_Temperatura;


//CLASE Y ATRIBUTOS
public class ClienteCafeteria {
	String nombre;

//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//CONSTRUCTORES
	public ClienteCafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
//MÉTODOS CLIENTE CAFETERÍA
	public void tomarTazaCafe (CoffeCup taza) throws TooHotTemperatureException, TooColdTemperatureException {
		boolean cafeOK = true;
	
		if(taza.getTemperatura()<20) {
			cafeOK = false;
			System.out.println("Esta muy frío");
			throw new TooHotTemperatureException();
			
		}else if (taza.getTemperatura()>80) {
			cafeOK = false;
			System.out.println("Esta muy caliente");
			throw new TooColdTemperatureException();
		}
	//return cafeOk;
	}
	
	
	
	
	
	

}
