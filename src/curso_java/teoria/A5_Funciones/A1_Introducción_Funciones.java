package curso_java.teoria.A5_Funciones;

public class A1_Introducción_Funciones {
	public static void main (String [] args) {	
		
		
		System.out.println(args.length);
		
		for (String dato : args) {
			System.out.println(dato);
	}

	
	
	
	
		
	}
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
	
	//2.dinamic o Dinámicos
	//	+ Los métodos dinámicos se crean en memoria en el momento que son necesarios para la ejecución del prográma
	//		Los métodos dinámicos siempre pueden acceder a los métodos estáticos ya que estos se crean en el momento del arranque del programa.

	
	
	
	
	
}
