package curso_java.teoria.A6_POO.Herencia;

//Tambien llamada clase hija

public class Elefante extends Animal{ //Con el extends indicamos que hereda de otra clase, en este caso de la clase padre o Superclase
	

	
	
	
	
	
public void metodo1 () throws Exception{  //Este constructor por si solo daría error ya que no existe un constructor vacío en su clase padre
										// de la cual hereda.
	}

public Elefante(String x, int y) { //Este constructor ha sido creado con source > GENERATE CONSTRUCTOR FROM SUPERCLASS
	super(x, y);					// De esta manera el constructor hijo "llama por telefono a su padre para preguntarle
									// que atributos necesita."
									// Cuando creemos un objeto con este constructor de la clase hija, este constructor tomará como referencia
									// los atributos que su padre le diga pero el objeto en si pertenece a la hija

}


Elefante elefante1 = new Elefante ("Dumbo", 5); //Creamos a Dumbo de la clase Elefante con los atributos heredados de la clase padre "Animal"
Animal animal1 = new Animal ("animalico", 2); // Creamos el objeto animalito con la variable animal1 del tipo Animal
Animal elefante2 = new Elefante ("pisoni", 3); //pisoni es un objeto de la clase elefante aunque elefante1 es una variable de tipo animal.
												//Si bien, pisoni es un objeto de tipo Elefante no puede invocar a los métodos de la clase		
												//Elefante ya que su variable está apuntando a otra clase, la clase animal.
												//Pisoni solo puede llamar a los métodos de la clase animal.

//Para solucionar este problema podemos decirle a java que Elefante2 es un Elefante, aunque sea una variable que apunta a la clase Animal.
//de esta forma, Elefante2 pueda utilizar los metodos de la clase Elefante
//Esto se hace así:










}
