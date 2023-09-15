package curso_java.ejercicios.A5_Metodos;

public class A1_Metodos {
	public static void main (String [] args) {
		
		
		//A)
		String anioNacimiento = "1988"; //Guardamos en la variable anioNacimiento de tipo String el año que el usuario introduce
		int edad = calculaEdad(anioNacimiento); //para darle valor a la variable del return, edad, aplicamos el método con su parámetro.
		System.out.println("tienes " + edad + " años"); //imprimimos la variable que buscábamos obtener con el metodo "calculaEdad"
		
		
		//B)
		int numero = 5;
		pintaTablaMultiplicar(numero);
		
		
		//C)
		pintaTablas();
		
	
		//D1)
		String texto = "Hola";
		int numRepeticiones = 3;
		String [] resultado = juntaDatos(texto,numRepeticiones);
	
		
		//E)
		
		int distanciaMet=250;
		int tiempoMet=120;
		
		calculaVelocidadCoche(distanciaMet, tiempoMet);
		
		
		}
	
	
	
	

	
	

		/*
		 * 
		 * EJERCICIO 1
		 * Crea los siguientes metodos "static" fuera del metodo main()
		 * 
		 * 
		 *A) CALCULAR LA EDAD DE ALGUIEN PIDIENDO EL AÑO DE NACIMIENTO
		 * int calculaEdad (String anioNacimiento)
		 * 
		 *B) PINTA LA TABLA DE MULTIPLICAR DEL NÚMERO QUE SE PIDA POR CONSOLA
		 * void pintaTablaMultiplicar (int numero)
		 * 
		 *C) PINTA LAS 10 TABLAS DE MULTIPLICAR
		 * 
		 *D) REPETIR EL TEXTO QUE PASEMOS TANTAS VECES COMO NUMERO DE REPETICIONES.
		 * Strings [] juntaDatos (String texto, int numRepeticiones)
		 * 	#Facil, devolver el texto tantas veces como indique el numRepeticiones 
		 * 	#Dificil, además el texto que pasemos debe cambiar en cada repetición. Debe tener un caracter menos por cada vuelta.
		 * 		EJ. texto="Hola", numRepeticiones=3 => {Hola, Hol, Ho}
		 * 
		 * 
		 * E) UN METODO PARA CALCULAR LA VELOCIDAD DE UN COCHE
		 * 	#Le pasamos la distancia recorrida en km y el tiempo en segundos
		 * */
		//==========================================================================================================================
	
	
	
	
	
	//A)------------
	//Declaramos un metodo estático de tipo int con el parametro anioNacimiento de tipo String
	static int calculaEdad (String anioNacimiento) {
		
		int anioNum = Integer.parseInt(anioNacimiento); //Convertimos el String anioNacimiento en int anioNum.
		int edad = 2023-anioNum; //Con el anioNacimiento convertido a int, se lo restamos a 2023 y lo guardamos en la variable edad
		return edad; //Al ser un metodo de tipo int, la ultima linea tiene que ser return y la variable de tipo int
	}
	
	
	
	
	//B)-----------
	static void pintaTablaMultiplicar (int numero) {
		int tabla = 0;
		System.out.println("\nTABLA DEL " + numero);
		for ( int i=0  ; i<11  ; i++  ) {
			int multiplicacion = numero*i;
			System.out.println(numero + " X " + i + " = " + multiplicacion);
		}
	}
	
	
	
	//C)-----------
	
	public static void pintaTablas() {
		
		for ( int i=0  ; i<=10  ; i++  ) {
			for ( int j=1  ; j<=10  ; j++  ) {
				System.out.println(i + " x " + j + " = " + (i*j)); 
			}
			System.out.println("=======================");
		}
	}
	
	
	
	//D1)----------
	static String [] juntaDatos (String texto, int numRepeticiones) {
		String [] resultado = new String [numRepeticiones];
		
		
		for ( int i=0  ; i<numRepeticiones  ; i++  ) {
			resultado[i]=texto;
			
		}
		
		for (String dato : resultado) {
			System.out.println(dato);
		}
		return resultado;
	}
	
	
	
	//E)----------
	public static int calculaVelocidadCoche (int distanciaMet, int tiempoMet) {
		
		int tiempoEnHoras = (tiempoMet*60)*60;
		int resultado = distanciaMet/tiempoMet;
		System.out.println(resultado);
		return resultado;
	}
	
	
	
	
	//Estructura de un método
	
	
	//	'control de entrada'   'metodo estático o dinámico'    'tipo del método'   'Nombre del metodo'  '(parámetro del método)'
	//			- si el método es de tipo String o int necesitamos que la ultima linea sea return 'variable'
	//			- si el metodo es de tipo void, no devolverá ningun dato por lo que no es necesaria la ultima linea return
	
	
	//Conocemos como SOBRECARGA DE MÉTODOS cuando declaramos varios metodos con el mismo nombre pero distinto numero o tipo de rámetros
	
	
	
	
	
	
	
}
