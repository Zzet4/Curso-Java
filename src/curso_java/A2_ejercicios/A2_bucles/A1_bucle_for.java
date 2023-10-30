package curso_java.A2_ejercicios.A2_bucles;

public class A1_bucle_for {
	public static void main(String[] args) {

//Sacar un bucle que cuente los pares ascendentemente de 0 a 50 y los impares de forma descendente de 50 a 0 
//en la misma linea.

//		for ( int num=0  ; num<=50  ; num += 2  ) {
//			System.out.println(num + "   " + (49-(num--)));
//		}

		
		
		// otra forma de hacerlo es meter dos variables en el bucle, una para los pares y otra para los impares, haciendo que cada una varíe
		// en función de nuestras necesidades

		for (int numPar = 0, numImpar = 49; numPar <= 50; numPar += 2, numImpar -= 2) {
			System.out.println(numPar + "\t" + numImpar);
		}

	}

}
