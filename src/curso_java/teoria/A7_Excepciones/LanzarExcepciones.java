package curso_java.teoria.A7_Excepciones;

public class LanzarExcepciones {

	public static void main(String[] args) {


		
		//Creamos un objeto llamado le de la clase lanzarExcepciones y con el llamamos al metodo test
		// como la llamada es desde el metodo main que es estatico y el metodo al que llamamos no es estatico nos da error en la linea 13
				
		LanzarExcepciones le = new LanzarExcepciones();
		//le.text(); //descomentar esta linea para ver el error.
		
	}

	//creamos un metodo que no es estático para llamarlo desde el main que si es estatico y forzar el error
	public void test(int num) { //leer lineas 33 y 34 antes --> Aqui es donde deberemos hacer el lanzamiento con la sentencia throws IOException 
		
		if (num%2==0) {
			NullPointerException npe = new NullPointerException("Mi error"); // creamos un objeto de tipo NullPointerException llamado npe
			throw npe; // Lanzamos la excepción
			
			//Las excepciones de la clase NullPointerException heredan de la clase RunTimeException
			//Las excepciones que heredan de la clase RunTimeException no es obligatorio controlarlas, se conocen como UNCHECKED EXCEPTIONS
			//Sin embargo otras excepciones si te obliga java a controlarlas como las que heredan de IOExcepcion o las que heredan directamente 
				//de exception. A estas excepciones las conocemso com CHECKED EXCEPTIONS. Veamos un ejemplo.
			
			//throw new IOException("mi error"); //En este caso estamos tambien lanzando un objeto pero no lo hemos guardado en una variable,
											   //Es decir, "lanzamos con throw" directamente la declaración del objeto con "new"
											   //Si descomentamos el throw de la linea 29 observaremos que java nos obliga a capturar el error.
											   //Esto es asi por que es una excepcion de IOException
			//Este tipo de lanzamientos es mejor implementarlos despues de los parametros en la declaración de un método para que nos translade el
			//error a la linea donde se está generando.
			
			
			//Podemos crear nuestras propias clases de excepciones por ejemplo clase MiExcepcion y en su declaración debemos indicar:
			//"extends Exception" para que herede de la clase Exception todos sus atributos.
			
		}
		
	} 
}
