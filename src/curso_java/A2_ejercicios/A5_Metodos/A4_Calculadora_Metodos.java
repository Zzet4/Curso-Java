package curso_java.A2_ejercicios.A5_Metodos;

import curso_java.A3_Utilidades.Utils;

public class A4_Calculadora_Metodos {
	public static void main (String [] args) {
		
//		Creamos Menú
//
//		1. Suma
//		2. Resta
//		3. Multiplicación
//		4. División
//		5. Científica (difícil) --> Nuevo menú
//									1. Potencia
//									2. Raiz cuadrada
//									3. Seno
//									4. Coseno
//							   <--	5. Volver
//		6. Apagar 
//
//		Que operación quieres realizar:
//		1- Pedir numero, el numero que se introduzca se va a sumar
		
//=============================================================================================================================
	
	int opcionMP = 0;	
	int resultado = 0; //declaramos el valor de resultado inicial, es decir 0.
	
	do {
		opcionMP = Utils.pintaMenu(CUERPO_MENU, "Seleccione la operación que desea realizar.");
	
		switch (opcionMP) {
		
		case 1:// Suma
			resultado = Suma(resultado);
				
			break;
		case 2:// Resta
			resultado = Resta(resultado);
			
			break;
		case 3:// Multiplicación
			resultado = Multiplicacion(resultado);
			
			break;
		case 4:// División
			resultado = Division(resultado);
			
			break;
		case 5:// Científica
		
			break;
		case 6:// Apagar
			System.out.println("Hasta pronto!!");
			break;
		}
			
		
	}while(opcionMP!=6);
}
//==============================================================================================================================
											//METODOS//
	
	
	
	//Declaramos la constante CUERPO_MENU.
	final static String CUERPO_MENU = "\n\t--CALCULADORA--\n\n1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Científica \n6. Apagar \n";

	
//case 1:// Suma
public static int Suma (int resultado) {
	int numeroSuma = Utils.scanInt("Introduzca el número que desea sumar");
	resultado += numeroSuma;
	System.out.println("El resultado de la suma es " + resultado);
	return resultado;
	
}

//case 2:// Resta
public static int Resta (int resultado) {
	int numeroResta = Utils.scanInt("Introduzca el número que desea restar");
	resultado -=  numeroResta;
	return resultado;
}
	
	
//case 3:// Multiplicación
public static int Multiplicacion (int resultado) {
	int numeroMultiplicacion = Utils.scanInt("Introduzca el número que desea multiplicar");
	resultado *= numeroMultiplicacion;
	return resultado;
}
	
	
//case 4:// División
public static int Division (int resultado) {
	int numeroDivision = Utils.scanInt("Introduzca el número que desea dividir");
	resultado /= numeroDivision;
	return resultado;
}
	
	
//case 5:// Científica


	
	
//case 6:// Apagar
	

	







	
	
	
	
	
	
	

}
