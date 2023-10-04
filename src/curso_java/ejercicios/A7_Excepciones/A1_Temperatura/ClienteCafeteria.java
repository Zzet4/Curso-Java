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
	//Declaramos el metodo tomar cafe y en su declaración ""propagamos"" las excepciones para que no salte donde
		//se invoque este al método.
	public void tomarTazaCafe (CoffeCup taza) throws TooHotTemperatureException, TooColdTemperatureException {

	
		if(taza.getTemperatura()<20) {			
			throw new TooColdTemperatureException();	
		}else if (taza.getTemperatura()>80) {
			throw new TooHotTemperatureException();
		}
	
	}
	
	
	
	
	
	

}
