package curso_java.A2_ejercicios.A1_condicionales;

import java.util.Scanner;

//Solicitar al usuario nombre y edad
//Sacar por consola lo siguiente segun el imput:
//entre 0 y 5 un bebe
//entre 6 y 15 niño
//entre 16 y 20 adolescente
//enter 21 Y 40 adulto
//entre 41 y 60 mediana edad
//entre 61 y 80 persona mayor
//entre 81 y 100 anciano


public class Ejercicio4_IF_formulario {
	public static void main (String [] Args) {
		
	System.out.println("Introduzca su nombre:");
	Scanner scan = new Scanner(System.in);
	String nombre = scan.nextLine();
	
	System.out.println("Introduzca su edad: ");
	Scanner scan2 = new Scanner(System.in);
	int edad = scan2.nextInt();
	
	String resultado = "";
	
	
	if (edad<0) {
		resultado = "¿Aun no has nacido??.\nVete a vacilar a tu barrio chaval!!";		
		
	}else if (edad<=5){
		resultado = "Eres un bebe, ¿Donde está tu mamá?";
		
	}else if (edad<=15){
		resultado = "Estas en la niñez";
		
	}else if (edad<=20){
		resultado = "Estas en la adolescencia";
		
	}else if (edad<=40){
		resultado = "Eres una persona adulta";
		
	}else if (edad<=60){
		resultado = "Eres una persona de mediana edad";
		
	}else if (edad<=80){
		resultado = "Eres una persona mayor";
		
	}else if (edad<=100){
		resultado = "Eres una persona de la tercera edad";
		
	}else if (edad<=120){
		resultado = "Dime tu secreto para vivir tantos años!!!";
		
	}else if (edad>120){
		resultado = "O eres una momia o me estas vacilando.";
		
	}else {
		System.out.print("error, por favor, introduzca su edad en formato numero entero.");
		
	}
	
	if (resultado!="") {
		System.out.println("Perfecto!! vamos a comprobar los datos introducidos:\nTu nombre es " + nombre + " y tu edad es " + edad
			+ " años, por lo tanto\n" + resultado);
	}
	
		
	}
	
}
