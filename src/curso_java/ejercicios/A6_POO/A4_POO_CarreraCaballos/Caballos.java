package curso_java.ejercicios.A6_POO.A4_POO_CarreraCaballos;

public class Caballos {

//Creación de atributos
	private int id;
	private String nombre;
	private int dorsal;
	private int edad;
	private int velocidad;// Entre 40 y 80
	private int peso;// Entre 200 y 400
	private int avance;

//Creación de getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//El atributo avance solo tiene un get pero no un set ya que solo debe modificarse en el metodo pero no de forma externa
	public int getAvance() {
		return avance;
	}


//Creación de constructores

	public Caballos(int id, String nombre, int dorsal, int edad, int velocidad, int peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
		//No metemos en el constructor el atributo avance ya que debe empezar a 0
	}

//Creación de Metodos
	
	//Metodo para resetear los metr

	public void resetea () {
		this.avance=0;
	}
	// Metodo correr
	public int correr () { 
		
		int random20 = ((int)(Math.random()*20)+1);
		int velocidadRandom = this.velocidad * random20;
		
		int random3a = ((int)(Math.random()*3)+1);
		int pesoRandom = this.peso * random3a;
		
		int random3b = ((int)(Math.random()*3)+1);
		int edadRandom = this.edad* random3b;
		
		int avanceCaballo = velocidadRandom-pesoRandom-edadRandom;
		//Hacemos este if por que la aleatoriedad puede hacer que el avanceCaballo sea negativo, en ese caso lo igualamos a cero, en caso de que
				//avanceCaballo sea positivo, asignamos dicho valor al atributo de ese caballo en concreto
				if(avanceCaballo>0) {
					this.avance += avanceCaballo;
				}else {
					avanceCaballo = 0;
				}
		System.out.println("El caballo con dorsal número " + this.dorsal + " ha avanzado " + avanceCaballo + " metros");
		
		
		
		
		return avanceCaballo;
		
		
	}
	
	
}	
	

	
	
	
	
	
	
	
	
	
	
	


