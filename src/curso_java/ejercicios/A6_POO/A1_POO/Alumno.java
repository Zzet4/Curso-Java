package curso_java.ejercicios.A6_POO.A1_POO;

public class Alumno {
	
	
	//A estas clases que no tienen main por que las usamos unicamente para definir las variables de instancia o Atributos, los constructores y 
	//los métodos se las conoce como POJOs
	//Posteriormente creamos una nueva clase con main llamada alumnoMain para crear los objetos y llamar a sus metodos.

//Atributos o Variables de instancia
	//si declararamos estas variables como estáticas las convertiríamos en variables estáticas de clase y solo podrían ser accedidas por metodos 
	//estátticos. Además todos los objetos de esta clase heredarían el valor de dicha variable estática y los cambios se verían reflejados en todos los
	//objetos a la vez
	String nombre;
	String apellidos;
	private String dni;
	int nota;
//____________________________________________________________________________________________________________________________________________
	//Declaramos el atributo dni como private para que no pueda ser modificado
	//para poder acceder al método pero no modificarlo hay que crear un metodo aparte que sea set y otro para poder obtenerlo que sea get
	//a este proceso le llamamos GETTER Y SETTER
	
	//Este metodo es el que habilita poder modificar el dato del dni
	public void setDni (String dni) {
	this.dni = dni;
}
	
	//Este metodo es el que hay que usar para recogerlo, visualizar y operar con el dato.
	public String getDni () {
		return dni;
	}
	
	//Para no tener que generar los getter y los setter de cada variable de instancia podemos usar boton derecho en la pantalla -> source ->
	//Generate getter and setter -> y luego seleccionamos a que atributos se los queremos generar.
	
	//Vemos aqui el concepto de encapsulacion ya que un atributo declarado como private que no tenga definido el metodo set no puede ser modificado
	//y si tampoco tiene habilitado el método get no podrá nisiquiera consultarse.
	
//_______________________________________________________________________________________________________________________________________________
	
//Constructores

	// Vacío
	public Alumno() {
	}

	// para inicializar con nombre, apellidos y dni
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	// para inicializar con nombre, apellidos, dni y nota
	public Alumno(String nombre, String apellidos, String dni, int nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota = nota;
	}
	
	//Para no hacer tanto codigo igual, podemos sobrecargar los constructores
	//como hacíamos con los métodos, sería así:
	
	
	
	

//Métodos
	//Este metodo no va a ser static ya que lo vamos a invocar con diferentes objetos, es decir, este metodo está orientado a objetos
	// Si hicieramos este metodo static solo tendría acceso a las variables de la clase, a su vez estas deberían ser estáticas tambien.
	//en ese caso el valor de esas variables es heredado para todos los objetos que se creen con esa clase, es decir, igual todos los objetos de
	//la clase Persona se llamarían Javi si hubiéramos definido la variable nombre como static String nombre = javi.
	public void estudiar() {
		System.out.println("El alumno " + this.nombre);
		if (nota >= 5) {
			switch (this.nota) {
			case 5:

			case 6:

			case 7:

			case 8:

			case 9:
				System.out.println("ha estudiado mucho");
				break;
			case 10:
				System.out.println("es un crack");
				break;

			}
		} else if (this.nota == 0) {
			System.out.println("no ha estudiado nada");
		} else {
			System.out.println("ha estudiado poco");
		}
	}
	
	//DENTRO DE LAS CLASES POJO NOOOO DEBE HABER MÉTODOS STATIC, DE HECHO, LOS ÚNICOS METODOS STATIC QUE DEBE HABER SON LOS DE LAS UTILIDADES.

}
