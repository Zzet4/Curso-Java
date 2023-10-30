package curso_java.A2_ejercicios.A2_bucles;

import java.util.Scanner;

public class A8_bucle_DoWhile_Menu {
	public static void main(String[] args) {

// Crea un menu con las siguientes opciones que al usuario para seleccionar una opción y le devuelva lo siguiente segun su elección:
//  1. Opcion1 - Has elegido la opción 1
//	2. Opcion2 - Has elegido la opción 1
//	3. Opcion3 - Has elegido la opción 1
//	4. Opcion4 - Has elegido la opción 1
//	5. Salir - Adiós

		// variables



		// Inicio del do while
//		do {
//			
//		// Print del menú e imput y captura
//		System.out.println("1. Mostrar los meses de cada estación\n2. Opción 2\n3. Opción 3\n4. Opción 4\n5. Opción 5\n\nSeleccione una opcion:");
//		Scanner scan = new Scanner(System.in);
//		int opcionElegida = scan.nextInt();
//
//		// Switch
//				switch (opcionElegida) {
//				case 1:
//					System.out.println("Seleccione una estación del año: ");
//					Scanner scan2 = new Scanner(System.in);
//					String estacionDelAnio = scan2.nextLine();
//					String outMesesEstacion = "";
//		
//					switch (estacionDelAnio) {
//					case "verano":
//						outMesesEstacion = "Julio, Agosto y Septiembre.";
//						break;
//					case "primavera":
//						outMesesEstacion = "Octubre, noviembre y Diciembre";
//						break;
//					case "otoño":
//						outMesesEstacion = "Enero, Febrero y Marzo.";
//						break;
//					case "invierno":
//						outMesesEstacion = "Abril, Mayo y Junio.";
//						break;
//					default:
//						System.out.println("seleccion incorrecta.");
//						break;
//		
//					}
//					if (!outMesesEstacion.equals("")) {
//						System.out.println("La estación elegida es " + estacionDelAnio + " y los meses que incluye son: " + outMesesEstacion);
//					}
//					break;
//				case 2:
//				case 3:
//				case 4:
//					System.out.println("has elegido la opción " + opcionElegida);
//					break;
//				case 5:
//					System.out.println("Adios");
//					break;
//				default:
//					System.out.println("Opción incorrecta");
//					break;
//				}
//			}while(opcionElegida!=5);
		
		
		// OJO, después del while pedimos que evalue el valor de "opcionElegida pero al ser esta una variable declarada e inicializada dentro del
		// cuerpo del bucle do while, esta no puede ser reconocida fuera de el.
		// Para solucionarlo debemos declarar la variable fuera del bucle e inicializarla ya dentro o declararla fuera con un valor neutro y cambiarla dentro.
		// A continuación se repite el código teniendo esto en cuenta.
		
		
		
		
			int opcionElegida;
			//int opcionElegida = 0;
			
		do {
			
			// Print del menú e imput y captura
			System.out.println("1. Mostrar los meses de cada estación\n2. Opción 2\n3. Opción 3\n4. Opción 4\n5. Opción 5\n\nSeleccione una opcion:");
			Scanner scan = new Scanner(System.in);
			opcionElegida = scan.nextInt();

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
						System.out.println("has elegido la opción " + opcionElegida + "\n\n");
						break;
					case 5:
						System.out.println("Adios");
						break;
					default:
						System.out.println("Opción incorrecta");
						break;
					}
				}while(opcionElegida!=5);
		
		
		
		
		
		
		
	}
}
