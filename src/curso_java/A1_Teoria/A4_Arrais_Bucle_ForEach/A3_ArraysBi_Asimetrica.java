package curso_java.A1_Teoria.A4_Arrais_Bucle_ForEach;

public class A3_ArraysBi_Asimetrica {
	public static void main (String [] args) {
		
		
		//Arrays bidimensionales cuyas filas no tienen todas el mismo número de columnas.
		//Ejemplo: no caben los mismos alumnos en todas las clases.
			//las clases son las filas y las columnas los alumnos que caben
		
		
		//simularemos un colegio con 3 clases
			//la clase del indice 0 tiene 2 mesas
			//la clase del indice 1 tiene 3 mesas
			//la clase del indice 2 tiene 5 mesas
		int [][] clasesColegio = new int [3][];
		clasesColegio[0] = new int [2];
			clasesColegio[0][2] = 8;
		clasesColegio[1] = new int [3];
		clasesColegio[3] = new int [4];
		
		for (int i=0 ;  i<clasesColegio.length ; i++  ) {
			for (  int j=0 ; j<clasesColegio.length  ; j++  ) {
				
				
				
		//otra forma de crear un array bidimensional y rellenarlo conociendo los datos es la siguiente
				
			int [][] colegio = {{3,5,8},{2,4},{1}};
				
			}
		}
		
		
		
		
		
		
		
	}

}
