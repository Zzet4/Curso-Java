package curso_java.teoria.A2_condicionales;

public class A2_Condicional_Switch {
	public static void main (String [] args) {
		
		
//El Switch es como un IF simplificado y limitado.
//Utilizamos el Switch en los casos en los que queremos evaluar la condición de UNA SOLA variable.
//sustitulle al IF en los casos mas sencillos pero solo puede evaluar una variable, es decir no acepta || ni &&
		// con switch (variable){ representamos la variable que vamos a evaluar
		// con los diferentes case "condicion" evaluamos la condición .equals para el valor entre parentesis.
		// con el default representamos el else, es decir si no se cumple ninguna de las condiciones de los case
		// con el break decidimos donde para de ejecutarse el switch. empezará por arriba y desde el primer case 
		// que se cumpla seguiráejecutando hasta que se encuentre el break.
		
//		
//		String color = "azul";
//		
//		switch (color) {
//		case "azul": System.out.println("el color es azul.");
//		case "amarillo" : System.out.println("el color es amarillo");break;
//		default: System.out.println("es otro color");
//		}
//		
		
//otro ejemplo
		
		String diaDeLaSemana = "lunes";
		
		switch (diaDeLaSemana){
		case "lunes": System.out.println("Este es el primer día de la semana");
		case "martes": System.out.println("Este es el segundo día de la semana");
		case "miercoles": System.out.println("Este es el tercer día de la semana");
		case "jueves": System.out.println("Este es el cuarto día de la semana");
		case "viernes": System.out.println("Este es el quinto día de la semana");
		case "sabado": System.out.println("Este es el sexto día de la semana");
		case "domingo": System.out.println("Este es el séptimo día de la semana");
		default: System.out.println("el día no es correcto.");break;
		}
		
//Veamos un ultimo ejemplo en 3 versiones.
		
		//Versión1
		
		String mesDelAño = "enero";
		
		switch (mesDelAño){
		case "enero": System.out.println("Estamos en invierno");
		case "febrero": System.out.println("Estamos en invierno");
		case "marzo": System.out.println("Estamos en invierno");
		case "abril": System.out.println("Estamos en primavera");
		case "mayo": System.out.println("Estamos en primavera");
		case "junio": System.out.println("Estamos en primavera");
		case "julio": System.out.println("Estamos en verano");
		case "agosto": System.out.println("Estamos en verano");
		case "septiembre": System.out.println("Estamos en verano");
		case "octubre": System.out.println("Estamos en otoño");
		case "noviembre": System.out.println("Estamos en otoño");
		case "diciembre": System.out.println("Estamos en otoño");break;
		default: System.out.println("la opción introducida no es válida");
		}
		
		//Versión2
		
		String mesDelAño2 = "enero";
				
		switch (mesDelAño){
		case "enero": 
		case "febrero": 
		case "marzo": System.out.println("Estamos en invierno");
		case "abril": 
		case "mayo": 
		case "junio": System.out.println("Estamos en primavera");
		case "julio": 
		case "agosto": 
		case "septiembre": System.out.println("Estamos en verano");
		case "octubre": 
		case "noviembre":
		case "diciembre": System.out.println("Estamos en otoño");break;
		default: System.out.println("la opción introducida no es válida");
		}
				
		//Versión3
				
		String mesDelAño3 = "enero";
		String estacion = "";
		
		switch (mesDelAño){
		case "enero": 
		case "febrero": 
		case "marzo": estacion = "invierno";
		case "abril": 
		case "mayo": 
		case "junio": estacion = "primavera";
		case "julio": 
		case "agosto": 
		case "septiembre": estacion = "verano";
		case "octubre": 
		case "noviembre":
		case "diciembre": estacion = "otoño";
		default: System.out.println("la opción introducida no es válida");break;
		}
		if (!estacion.equals("")) {
		System.out.println("Estamos en " + estacion);
	
		}
	}
}
