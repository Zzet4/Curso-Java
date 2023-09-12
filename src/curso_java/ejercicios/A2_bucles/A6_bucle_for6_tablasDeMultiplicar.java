package curso_java.ejercicios.A2_bucles;

public class A6_bucle_for6_tablasDeMultiplicar {
	public static void main (String [] args) {
		
//Sacar por pantalla todas las tablas de multiplicar del 1 al 10
		
		
	int totTablas = 25;
		
	for ( int i=1  ; i<=totTablas  ; i++  ) {
		System.out.println("\nTabla del " + i );
		for ( int j=1  ; j<=10  ; j++  ) {
			System.out.println(i + " x " + j + " = " + (i*j));
		}
	}
		
		
		
		
		
		
		
	}

}
