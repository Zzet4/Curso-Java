package curso_java.teoria.A6_POO.Herencia;

public class Animal { //Tambien llamada clase padre
	
	
	private String nombre;
	private int edad;
	
	
	//Creamos un constructor con todos los atributos como parametros. OJO, ESTO ELIMINA EL CONSTRUCTOR VACÍO POR DEFECTO
	public Animal(String dato1, int dato2) {
		super();
		this.nombre = dato1;
		this.edad = dato2;
	}

	//En este caso, al desaparecer el constructor vacío hay que tener en cuenta que cualquier constructor de alguna de las clases hijas
	//Que heredan de esta devolverá un error por que siempre que creas un constructor, este llama al constructor vacío de su clase padre.
	//En esta caso ya no existe por eso falla.
	
	//Aquí tenemos dos opciones:
		//1. Creamos un constructor vacío aqui en la clase padre para que las clases hijas puedan llamarlo en sus constructores.
			//	public Superclase() {
			//		
			//	}
	
		//2. Crear un constructor igual en la clase hija, para lo que utilizamos el boton derecho > source > GENERATE CONSTRUCTOR FROM SUPERCLASS
	

	public String getDato1() {
		return nombre;
	}



	public void setDato1(String dato1) {
		this.nombre = nombre;
	}



	public int getDato2() {
		return edad;
	}



	public void setDato2(int dato2) {
		this.edad = edad;
	}
	
	
	
	
	

	
	
	
}
