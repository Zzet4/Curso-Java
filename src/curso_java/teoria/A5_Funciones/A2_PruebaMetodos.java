package curso_java.teoria.A5_Funciones;

public class A2_PruebaMetodos {
	public static void main (String [] args) {
			
		
		
		
		boolean numeroPar = numeroParCaracteres("asñdlifj");
		System.out.println("El número de caracteres introducidos es par? " + numeroPar);
		
		
	}

	//Creamos un método para que a partir de una cadena dada como String nos devuelva true si el número de caracteres es par.
	static boolean numeroParCaracteres (String cadena) {
		int numCaracteres = cadena.length();
		boolean esPar = false;
		
		if (numCaracteres%2==0) {
			esPar = true;
		}else {esPar = false;
		}
	
	return esPar;
		
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
