package curso_java.ejercicios.A1_condicionales;

import java.util.Scanner;

public class Ejercicio6_Switch_Menu {
	public static void main(String[] args) {

// Crea un menu con las siguientes opciones para que el usuario pueda
//  seleccionar una de ellas y le devuelva lo siguiente segun su elección:
//  1. Opcion1 - Has elegido la opción 1
//	2. Opcion2 - Has elegido la opción 2
//	3. Opcion3 - Has elegido la opción 3
//	4. Opcion4 - Has elegido la opción 4
//	5. Salir - Adiós


		// imput y captura

		System.out.println(
				"1. Mostrar los meses de cada estación\n2. Opción 2\n3. Opción 3\n4. Opción 4\n5. Opción 5\n\nSeleccione una opcion:");

		Scanner scan = new Scanner(System.in);
		int opcionElegida = scan.nextInt();

		// Switch

		switch (opcionElegida) {
		case 1:
			System.out.println("Seleccione una estación del año: ");
			Scanner scan2 = new Scanner(System.in);
			String estacionDelAnio = scan2.nextLine();
			String outMesesEstacion = "";

			switch (estacionDelAnio) {
			case "verano":
				outMesesEstacion = "Julio, Agosto y Septiembre.";
				break;
			case "primavera":
				outMesesEstacion = "Octubre, noviembre y Diciembre";
				break;
			case "otoño":
				outMesesEstacion = "Enero, Febrero y Marzo.";
				break;
			case "invierno":
				outMesesEstacion = "Abril, Mayo y Junio.";
				break;
			default:
				System.out.println("seleccion incorrecta.");
				break;

			}
			if (!outMesesEstacion.equals("")) {
				System.out.println("La estación elegida es " + estacionDelAnio + " y los meses que incluye son: " + outMesesEstacion);
			}
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("has elegido la opción " + opcionElegida);
			break;
		case 5:
			System.out.println("Adios");
			break;
		default:
			System.out.println("Opción incorrecta");
			break;
		}

		// Hay que elegir con cuidado donde ponemos los break ya que despues de ellos no
		// se seguirá ejecutando el código.

	}
}
