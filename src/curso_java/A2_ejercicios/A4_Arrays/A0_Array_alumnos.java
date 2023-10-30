package curso_java.A2_ejercicios.A4_Arrays;

public class A0_Array_alumnos {
	public static void main (String [] args) {
		
/*
 * 
 * Con los siguientes datos
 * "Alumno1:9"
 * "Alumno2:8"
 * "Alumno3:3"
 * "Alumno4:4"
 * "Alumno5:5"
 * "Alumno6:10"
 * "Alumno7:4"
 * 
 * Los nombres de alumno van seguidos de dos puntos y su nota
 * Generar un array con los nombres de los alumnos que han aprobado
 * 
 * 
 * */
		
//En este caso tenemos todos los datos necesarios para generar el array correspondiente por lo que procedemos de la siguiente manera
		
		String [] listado = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4"};
		
//Ahora debemos utilizar los metodos de String para averiguar cuales son los alumnos que han aprobado.
//para ello tenemos que pasar un String a número ya que cada dato es estrictamente un String
		
		
		//primero quitamos los espacios a izquierda y derecha
		for (String valor : listado) {
			valor.trim();
		}
		
		//con el símbolo : como referencia, todo lo que está a su derecha es la nota y todo lo que esta a su izquierda es el nombre
		//mediante los métodos de los Strings separamos los datos y los guardamos en dos arrays distintas, (notas y nombres)
		//aprovechamos al separar el dato de la nota que se convierte en char
		
		int [] notas = new int[7];
		String [] nombres = new String[listado.length];
		
		for ( int i = 0  ; i<=listado.length-1  ; i++ ) {		
			String nombre = listado[i].substring(0,(listado[i].indexOf(":")));
			nombres[i]=nombre;
			
			String notaStr = listado[i].substring((listado[i].indexOf(":")+1));
			int notNum = Integer.parseInt(notaStr);
			notas[i] = notNum;
			
			System.out.println("el " + nombre + " tiene un " + notaStr);
			
		}
		
		//Generar array con función de String.plit
		System.out.println("\nA continuación se muestra la lista de alumnos aprobados (con funcion Split)");
		
		String listaAprob = "";
		for ( int i=0  ; i<=nombres.length-1  ; i++  ) {
			if(notas[i]>=5) {
				 listaAprob+= nombres[i] + ",";
			
			}
		}
		String [] arrayAprob = listaAprob.split(",");
		System.out.println(arrayAprob.length);
		
		for (String nombreApto : arrayAprob) {
			System.out.println(nombreApto);
		}
		
		
		
		//Generar array sin funcion split.
		System.out.println("\nA continuación se muestra la lista de alumnos aprobados (sin funcion Split)");
		
		
			//primer for para sacar el número de alumnos aprobados que no servira de tamaño máximo para el array de alumnos arpobados
		int contadorAprobados = 0;
		for ( int i=0  ; i<=nombres.length-1  ; i++  ) {
			if(notas[i]>=5) {
				contadorAprobados++;
			}
		}
		
			//Declaramos el array de alumnos aprobados con el tamaño del contador obtenido en el anterior bucle for y lo rellenamos de nuevo
			//poniendo la condición de que la nota sea igual o mayor a 5, (ojo, poner un contador a la hora de guardar datos en el nuevo
			//array para que vaya avanzando posiciones solo cuando encuentre un aprobado en las notas.
		String [] arrayAprob2 = new String[contadorAprobados];
		int posicion = 0;
		for ( int i=0  ; i<=nombres.length-1  ; i++  ) {
			if(notas[i]>=5) {
				arrayAprob2[posicion]=nombres[i] + " con un " + notas[i];
				posicion++;
			}
		}
		
			//imprimimos el array de los alumnos aprobados
		
		for (String muestra : arrayAprob2) {
			System.out.println(muestra);
		}
	}
		
}
