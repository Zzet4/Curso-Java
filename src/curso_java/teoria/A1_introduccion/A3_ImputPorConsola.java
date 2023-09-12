package curso_java.teoria.A1_introduccion;

import java.util.Scanner;

public class A3_ImputPorConsola {
	public static void main (String [] Args ) {
		
		//Como pedir datos por consola al usuario con la función Scanner
		
		System.out.println("Introduzca su nombre: ");
		
	
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		
		
		System.out.println("su nombre es " + nombre);
		
		//primero invocamos a la función Scanner (linea13)
		//después guardamos los datos del imput en una variable, en este caso "nombre". (linea 14).
		
		//veamos un ejemplo con un número en vez de con un string. (ojo, el tipo de la variable cambia a int y la sintaxis de scan.nex también)
		
		System.out.println("Introduzca un número: ");
		
		
		Scanner scan2 = new Scanner(System.in);
		int numero = scan.nextInt();
		
		
		System.out.println("su número es " + numero);
		
		
		
		
	}

}
