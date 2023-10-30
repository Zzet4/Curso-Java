package curso_java.A2_ejercicios.A1_condicionales;

import java.util.Scanner;

public class Ejercicio5_IF_CosteLlamada2 {
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
		
		
		System.out.println("introduzca el día de la semana de la llamada: ");
		Scanner scan = new Scanner(System.in);
		String dia = scan.nextLine();
		
		System.out.println("introduzca la hora de inicio mas cercana de la llamada (horas en punto): ");
		Scanner scan2 = new Scanner(System.in);
		int hora = scan2.nextInt();
		
		System.out.println("introduzca la duración de la llamada en minutos: ");
		Scanner scan3 = new Scanner(System.in);
		int duracion = scan3.nextInt();
		
		double coste = 0;
		
		if (duracion>0){
			coste += 1;
			if (duracion>5) { 
				coste += 0.80;
				}if (duracion>8) {
					coste +=  0.70;
					}if (duracion>10) {
						coste += ((duracion-10) * 0.50);
					}			
		}		
		if (coste!=0) {
		System.out.println(coste);
		}
	
	if (dia.equalsIgnoreCase("domingo")) {
		coste *= 1.03;
	}else if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles") 
			 || dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("viernes")
			 || dia.equalsIgnoreCase("sabado")) {
		
			if (hora<=15 && hora!=0) {
				coste = coste * 1.15;
			}else {coste*=1.10;}
	}else {System.out.println("error");}
	
	if (coste!=0) {
	System.out.println("El precio es " + coste);
	}
		
	}

}


































