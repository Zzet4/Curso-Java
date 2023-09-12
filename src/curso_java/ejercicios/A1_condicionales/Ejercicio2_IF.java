package curso_java.ejercicios.A1_condicionales;
//vamos a declarar una variable de tipo string y la vamos a llamar mes. Si el mes es enero febrero marzo vamos a poner que es

//invierno, si es abril mayo junio decimos que es primavera, si es julio agosto o septiembre decimos que es verano
//si es octubre noviembre o diciembre decimos que es otoño y si no es ninguno pinta el mes es incorrecto.

public class Ejercicio2_IF {
	public static void main (String [] args ) {
	
		
		//PRIMERA FORMA DE RESOLVERLO
		//Utilizamos un if para la solución
		/*
		
		String mes = "diciembre";
		String estacion = "default";
		
		if (mes == "enero" || mes == "febrero" || mes == "marzo" ) {
			System.out.println ("Estamos en Invierno");
			
		}else if (mes == "abril" || mes == "mayo" || mes == "junio" ) {
			System.out.println ("Estamos en Primavera");
			
		}else if (mes == "julio" || mes == "septiembre" ) {
			System.out.println ("Estamos en Verano");
		
		}else if ( mes == "agosto" ) {
			System.out.println ("Estamos en Verano y de vacaciones en la playa!!!");
		
		}else if (mes == "octubre" || mes == "noviembre" ) {
			System.out.println ("Estamos en Otonio");
			
		}else if ( mes == "diciembre" ) {
			System.out.println ("Estamos en Otonio y de vacaciones navidenias!!!");
		
		}else {
			System.out.println ("el dato introducido no es correcto, por favor introduzca el mes en minusculas");
			
		}
		
		*/
		
		
		
		
		
		/*
		//SEGUNDA FORMA DE RESOLVERLO.
		//Ahora lo hacemos con un solo Sysout:
		 
		String mes = "diciembre";
		String estacion = "default";
		
		if (mes == "enero" || mes == "febrero" || mes == "marzo" ) {
			estacion = "Estamos en invierno";
			
		}else if (mes == "abril" || mes == "mayo" || mes == "junio" ) {
			estacion = "Estamos en Primavera";
			
		}else if (mes == "julio" || mes == "septiembre" ) {
			estacion = "Estamos en Verano";
		
		}else if ( mes == "agosto" ) {
			estacion = "Estamos en Verano y de Vacaciones";
		
		}else if (mes == "octubre" || mes == "noviembre" ) {
			estacion = "Estamos en Otoño";
			
		}else if ( mes == "diciembre" ) {
			estacion = "Estamos en Otoño y es Navidad";
		
		}else {
			estacion = "El més introducido no es correcto";
			
		}
		
		System.out.println(estacion);
		
		*/
		
		//TERCERA FORMA DE RESOLVERLO.
		//Ahora lo hacemos más simplificado aún, con menos else if, (introduciendo vacaciones y navidad en menos else if) con un ejemplo
		//para agosto y otro diferente para diciembre
		//y sin tener que escribir el texto completo "Estamos en" en cada cambio de la variable estación:
		
		String mes = "agosto";
		String estacion = "default";
		
		if ( mes == "enero" || mes == "febrero" || mes == "marzo" ) {
			estacion = "invierno";
			
		}else if ( mes == "abril" || mes == "mayo" || mes == "junio" ) {
			estacion = "primavera";
			
		}else if ( mes == "julio" || mes == "agosto" || mes == "septiembre" ) {
			estacion = "verano";
			if (mes=="agosto") {
				estacion = estacion + " y estamos en vacaciones de verano.";
				}
			
		}else if ( mes == "octubre" || mes == "noviembre" || mes == "diciembre" ) {
			estacion = "otoño";
			if (mes=="diciembre") {
				estacion = estacion + " y estamos en vacaciones de navidad.";
				}
			
		}else {
			System.out.println("Mes incorrecto");
		}
		
		if (estacion=="default") {
			System.out.println("por favor, introduzca algun mes");
			
		}else {
			System.out.println("estamos en " + estacion);
						
			
		}
		
	}
}


