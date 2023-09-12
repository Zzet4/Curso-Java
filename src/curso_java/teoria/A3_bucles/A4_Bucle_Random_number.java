package curso_java.teoria.A3_bucles;

public class A4_Bucle_Random_number {
	public static void main (String [] args) {
		
		
		
		//Para generar números aleatorios.
		//(int)(Math.random()*6)+1);
		//int --> quiere decir que quitamos la parte decimal y nos quedaremos con la entera
		//Math.random() --> es la clase Math con su metodo random que nos devuelve un número random entre 0 y 1
		//*6) --> simula las caras del dado, en este caso son 6 pero pueden ser las que quieras.
		//+1) --> le sumamos uno por que un dado nunca puede sacar 0 en una tirada y en caso de que 
					//random sacara 0.4 al quedarnos con la parte entera sería 0.		
		
		
		//para imprimir por pantalla el resultado de la tirada
	    System.out.println((int)(Math.random()*6)+1);
		
	    //para imprimir por pantalla el número entre 0 y uno que devuelve la clase Math
		System.out.println(Math.random());
		
		// Para guardarlo dentro de una variable
		int resultado = ((int)(Math.random()*6)+1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
