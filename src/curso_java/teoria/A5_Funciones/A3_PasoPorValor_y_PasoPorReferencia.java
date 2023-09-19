package curso_java.teoria.A5_Funciones;

public class A3_PasoPorValor_y_PasoPorReferencia {
	public static void main(String [] args) {
		
		
		
/*
 * 
 * PASO POR VALOR
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
		
		
//		String dato = "Hola";
//		modificaDato(dato);
//		System.out.println(dato);

		int numero = 7;
		numero = modificaNumero(numero);
		System.out.println(numero);
		
	}
	public static void modificaDato(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	
	public static int modificaNumero(int num) {
		num = num +2;
		System.out.println(num);
		
		return num;
		
		
		
		
		
		
		
		
		
		
	}

}
