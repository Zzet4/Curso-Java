package curso_java.A1_Teoria.A2_condicionales;

public class A1_Condicional_IF {
	
	public static void main (String [] args ) {
		
		int numero = 101;
		
		if (numero>10 && numero%2==0) {
		
			System.out.println ("1");
			System.out.println ("2");
			
		}else if (numero == 0) {
			System.out.println ("3");
			System.out.println ("4");
		
	}else {
			System.out.println ("5");
			System.out.println ("6");
			
		}
		
		
		
		//Para IF sencillos que solo tengan el if y el else se puede utilizar lo que conocemos como operador ternario
		//Consta de tres partes, 
		//lo que esta a la izquierda de la interrogación es la condicion
		//lo que esta a la derecha es la condicion para el if
		//lo que está despues de los dos puntos corresponde con el else
		
		int numero4 = 4;
		numero4 = numero%2==0 ? numero/=2 : numero + 1;
		
	}

}
