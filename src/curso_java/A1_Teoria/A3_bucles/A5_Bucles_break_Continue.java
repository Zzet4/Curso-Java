package curso_java.A1_Teoria.A3_bucles;

public class A5_Bucles_break_Continue {
	public static void main (String [] args) {
		
		
	//Dentro de un bucle puede darse el caso de que queralmos que una iteración del bucle no siga ejecutándose a partir de
		//cierta condición, es decir no me va a hacer falta que se ejecuten el resto de instrucciones y quiero que salte
		//directamente a la siguiente iteracion del bucle.
		//para ello utilizamos el:
		//continue;
		//
		//
		//En cambio, otras veces queremos que al cumplirse cierta condicion dentro del bucle haga que este se "rompa"
		//y termine sin volver a la siguiente iteracion. Saldría del bucle directamente.
		
		
		for (int i = 0 ; i<10 ; i++ ) {
			System.out.println(i);
			System.out.println("pasa 0");
			if (i%2==0) {
				continue;
			}
			if (i%3==0) {
				break;
			}
			System.out.println("Pasa 1");
			System.out.println("Pasa 2");
			
		}
		
		System.out.println("Fin");
		
		
		
		
		
		//
		
		
		
		
	}
}
