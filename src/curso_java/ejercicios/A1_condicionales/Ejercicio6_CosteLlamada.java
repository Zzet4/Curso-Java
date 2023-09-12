package curso_java.ejercicios.A1_condicionales;

import java.util.Scanner;

public class Ejercicio6_CosteLlamada {
	public static void main (String [] args) {
		
		/*
		Herramienta para calcular el precio de una llamada
		Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
		de tal forma que:
		+ los primeros cinco minutos cuestan 1€, 
		+ los siguientes 3 minutos, 80 céntimos, 
		+ los siguientes dos minutos a 70 céntimos 
		+ y a partir del décimo minuto, 50 céntimos cada minuto.

		Se carga un impuesto del 3% cuando es domingo, y si es otro día, 
		en turno de mañana 15% 
		y en turno de tarde 10%.

		Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada
		 */
		
//---------------------------------------------------------------------------------------------------------------------------------------------
		
//Variables
  //Variables obtenidas como Imput, (dia, hora y duración).
		
		System.out.println("Por favor, seleccione el día de la semana en el que se realizó la llamada");
			Scanner scan = new Scanner(System.in);
		String dia = scan.nextLine();
			
		System.out.println("Ahora seleccione la hora mas cercana al inicio de la llamada (solo horas en punto)");
			Scanner scan2 = new Scanner(System.in);
			int hora = scan2.nextInt();
			
		System.out.println("Por último, seleccione la duración de la llamada en minutos");
			Scanner scan3 = new Scanner(System.in);
			int duracion = scan3.nextInt();
			
			
  //Variables internas (mensajeDeError y costeFinal).			
			
			String mensajeDeError = "Lo siento, el dato introducido no es correcto.";
			double costeFinal = 00.00;
			
			
			
//Cálculo del precio base de la llamada segun la duración.
			
		if (duracion<=0) {
			System.err.println(mensajeDeError + ". El tiempo no puede ser negativo");
		}
		else if (duracion<=5){
			costeFinal = costeFinal + 1;
		}
		else if (duracion<=8) {
			costeFinal = costeFinal + 1 + 0.80;
		}
		else if (duracion<=10) {
			costeFinal = costeFinal + 1 + 0.80 + 0.70;
		}
		else if (duracion>10) {
			costeFinal = (costeFinal + 1 + 0.80 + 0.70) + ((duracion - 10) * 0.50);
		}
		else {System.err.println(mensajeDeError);}
		
		
		
//Cálculo del impuesto aplicable segun día y hora de la llamada.
		
		if (dia.equalsIgnoreCase("domingo")) {
			costeFinal = costeFinal * 1.03;
		}
		else if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles") || 
				 dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("viernes")) {
			if (hora>0 && hora<=15) {
				costeFinal = costeFinal * 1.15;
			}
			else if (hora<=23 || hora==00) {
				costeFinal = costeFinal * 1.10;
			}
			else {System.err.print(mensajeDeError + ". Por favor, introduzca una hora correcta.");
			}
		}	
		else {System.out.println(mensajeDeError + ". Por favor, itroduzca un día de la semana válido");
		} 
		
		
//Mensaje final al cliente
		
		System.out.println("el coste total de su llamada es de [" + costeFinal + "€] impuestos incluídos.");
				
		
		
	}

}
