package curso_java.ejercicios.A1_condicionales;
//Declarar las variables pertinentes, una del año de nacimiento otra con el nombre, otra con el apellido

//y la última con la edad.
//Pintar por pantalla nombre, apellido, edad y si nació en un año par o no.

public class Ejercicio1_Condicionales {
	public static void main(String[] args) {

		String nombre = "Perico";
		String apellido = "De los Palotes";
		int anioNacimiento = 2000;
		int edad = 2023 - anioNacimiento;
		boolean anioNacimientoPar = anioNacimiento % 2 == 0;

			System.out.println(nombre + " " + apellido + " tiene " + edad + " años.\nConteste true o false: ¿nació "
					+ nombre + " en un año par? --> " + anioNacimientoPar);

	
//Aqui lo hacemos también con el condicional IF
			
		
		/*
		if (anioNacimientoPar==true) {
			System.out.println("el año de nacimiento es par");
		}else {
			System.out.println("el año de nacimiento es impar");
			}
		*/

	}
	
}
		