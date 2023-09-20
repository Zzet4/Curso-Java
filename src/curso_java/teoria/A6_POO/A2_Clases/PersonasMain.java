package curso_java.teoria.A6_POO.A2_Clases;

public class PersonasMain {
	public static void main (String [] args) {
	
	
	Persona p1 = new Persona();
	//declaramos el valor "Eva" para el atributo nombre del objeto al que apunta la variable p1.
	//si no hay declarado ningun constructor los atributos tipo String por defecto se crean como null y los de tipo int por defecto se crean como 0,
	//OJO solo en caso de no haber declarado ningun constructor
	// en la clase. En el momento en el que declaras un constructor, ese se convierte en por defecto.
	p1.nombre="Eva";
	//imprimimos los atributos nombre y edad del objeto al que apunta la variable p1
	System.out.println(p1.nombre);
	System.out.println(p1.edad);
	
	
	//creamos un nuevo objeto
	Persona p2 = new Persona();
	//En este punto hacemos que la variable p1 apunte al mismo objeto al que apunta p2 en el momento de su creación.
	//en este punto se perderían todos los datos del objeto con nombre Eva al que antes apuntaba la variable p1
	//		"un objeto al que no apunta ninguna variable acaba desapareciendo por el garvage collector."
	p1=p2;
	p2.nombre="María";
	
	
	//Creamos una nueva variable y hacemos que apunte al mismo objeto al que ya están apuntando p1 y p2
	Persona p3 = p2;
	//En la linea 26 no hemos creado un objeto nuevo ya que no hay una sentencia new 
	//Simplemente hemos creado una nueva variable que apunta al mismo objeto que p2 pero si hemos creado una 
	
	//================================================================================================
	
	//Creamos dos nuevos objetos
	Persona p4 = new Persona();
	p4.nombre = "Jose";
	p4.edad = 40;
	
	Persona p5 = new Persona();
	p5.nombre = "Jose";
	p5.edad = 18;
	
	
	//Llamamos al metodo correr del objeto al que apunta la variable p4 y lo mismo para la variable p5.
	//cada objeto tiene unos atributos diferentes por lo que el metodo se comportará de distinta manera en cada caso.
	//a esto le llamamos POLIMORFISMO.
	p4.correr();
	p5.correr();
	
	}

}
