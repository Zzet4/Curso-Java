package curso_java.ejercicios.A6_POO.A5_Herencia.A1_Orquesta;

public abstract class Instrumento {    //con el abstract hacemos que no se puedan crear objetos de esta clase ya que tu nunca vas a crear
										//un instrumento... crearas una trompeta, un tambor o una guitarra pero Instrumento solo es el molde
										//Instrumento es abstracto
	private String nombre;
	private String tipo;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	
	
	
	
//METODOS
	
	
//Metodo toString sobre escrito de la clase objects. este metodo asi sobreescrito sirve para pintar los atributos de un objeto por pantalla
	//En lugar de pintar solo la posicion de memoria del objeto.
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
	
	
	public void afinar () {
		System.out.println("Afinando" + this.nombre);
	}
	
	public void tocar () {
		System.out.println("Tocando " + this.nombre);
	}
	

}
