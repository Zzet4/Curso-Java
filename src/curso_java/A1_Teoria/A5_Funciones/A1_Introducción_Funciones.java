package curso_java.A1_Teoria.A5_Funciones;

public class A1_Introducción_Funciones {
	public static void main (String [] args) {	
		
		
		System.out.println(args.length);
		
		for (String dato : args) {
			System.out.println(dato);
	}

	
	
	
	
		
	}
	
	
	//LOS MÉTODOS O FUNCIONES SON PORCIONES DE CÓDIGO GUARDADAS PARA PODER SER REUTILIZADAS EN DIFERENTES PUNTOS DEL PROGRAMA.
	//POR EJEMPLO PODEMOS GUARDAR EN UN MÉTODO DE LA CLASE SCANNER LA PORCIÓN DE CÓDIGO QUE CAPTURA UN IMPUT POR CONSOLA PARA PODER
	//USARLO DE FORMA DIRECTA SIN TENER QUE ESCRIBIR SU SINTAXIS CADA VEZ QUE LO NECESITEMOS.
	
	//OJO: LOS MÉTODOS SIEMPRE ESTARÁN DEFINIDOS DENTRO DE LAS CLASES.
	
	
	
	
	//Declaracion de un método o funcion
	//1.Modificador de acceso
	//	+ Public: Modificador que permite el acceso al metodo o funcion desde cualquier otra clase o función
	//	+ Private: Solo se puede acceder desde la clase en la que está declarado
	//	+ Package: Es el valor por defecto por lo que no hace falta poner nada para declarar una función como package
			//Solo la propia clase y las clases del mismo paquete tienen acceso a este metodo o funcion.
	//	+ Protected: como el package pero además tambien tienen acceso clases de otros paquetes siempre y cuando sean hijas de esta clase.
	
	
	//Tipos de metodos o funciones.
	//1.static o Estáticos
	// 	+ Los métodos que són estáticos se crean en memoria en el momento del arranque del programa estándo siempre disponible.
	//		Los métodos estáticos no pueden llamar a los dinámicos ya que estos pueden existir o no en el momento requerido
	//		Por ende los métodos estáticos siempre pueden llamarse entre si
	//		Los métodos estáticos pueden ser invocados desde su clase directamente como los ejemplos de Math.random o 
	
	
	
	
	//2.dinamic o Dinámicos
	//	+ Los métodos dinámicos se crean en memoria en el momento que son necesarios para la ejecución del prográma
	//		Los métodos dinámicos siempre pueden acceder a los métodos estáticos ya que estos se crean en el momento del arranque del programa.
	//		Los métodos dinámicos requieren de la creación de un nuevo objeto para poder ser invocados como por ejemplo
	//			Scanner scan = new Scanner (System.in) --> para crear el objeto "scan"
	//			int nombre = scan.nextInt --> invocamos al metodo nextInt con el objeto scan en la declaración de la variable nombre
	
	
	
	
	
}
