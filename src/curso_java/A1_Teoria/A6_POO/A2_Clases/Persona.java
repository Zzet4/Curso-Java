package curso_java.A1_Teoria.A6_POO.A2_Clases;

//POJO (Plain Old Java Object)
public class Persona {
	
	//Las variables que estan dentro de un método se reconocen como variables locales
	//Las variables que se declaran fuera de los metodos, como las siguientes, se denominan variables de instancia.
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	
//Declaracion de constructores
		
	//El constructor por defecto es tal que así y asigna null, 0 y boolean por defecto a todos los atributos.
	public Persona() {
	}
	
	//Si declaramos un constructor con un parametro que se llame igual que el atributo, JAVA se confunde y aplica el valor de ese atributo
	//(Variable de instancia).
	//es por esto que debemos declarar la variable dentro del constructor con la palabra reservada this.
	public Persona(String apellidos){
		this.apellidos = apellidos;		
	}
	
	
	
//Declaración de métodos.
	public void correr () {
		System.out.println(nombre + " esta corriendo");
		if (edad<25) {
			System.out.println(" muy rápido");
		}else{System.out.println("muy despacio");
	
		}
	}
	
}
