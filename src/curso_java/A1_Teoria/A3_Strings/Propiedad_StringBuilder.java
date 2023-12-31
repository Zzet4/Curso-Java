package curso_java.A1_Teoria.A3_Strings;

public class Propiedad_StringBuilder {
	public static void main (String [] args) {
	
/*
 * EL STRING BUILDER ES OTRO MÉTODO QUE PODEMOS UTILIZAR CUANDO TENEMOS QUE CONCATENAR VARIOS STRINGS
 * RECORDEMOS QUE LOS STRINGS SON INMUTABLES POR LO QUE CONCATENAR EL STRING1=HO + EL STRING2=LA NOS DARÍA COMO RESULTADO UN TERCER STRING
 * STRING3=HOLA. DE ESTA MANERA POR CADA CONCATENACIÓN SE GENERARÍA UN NUEVO STRING SATURANDO LA MEMORIA
 * 
 * PARA EVITAR ESTA SITUACIÓN PODEMOS CONVERTIR EL STRING A UN OBJETO (QUE SI ES MUTABLE), USANDO LA CLASE STRING BUILDER
 * CREANDO UN NUEVO OBJETO Y PASÁNDOLE COMO PARAMETRO EL STRING -->
 * StringBuilder query = new StringBuilder(String);
 * AHORA NUESTRO STRING ESTÁ CONTENIDO EN EL OBJETO QUERY DE TIPO STRING BUILDER Y PODEMOS CONCATENARLE TODOS LOS STRINGS QUE QUERAMOS.
 * 
 * ¿COMO CONCATENAMOS AHORA?
 * 
 * query.append(String a concatenar1);
 * query.append(String a concatenar2);
 * 
 * DE ESTA MANERA VAMOS MODIFICANDO EL OBJETO Y FINALMENTE CONSEGUIMOS EL OBJETO DE TIPO STRING BUILDER CON EL STRING FINAL YA CONCATENADO.
 * EN ESTE PUNTO, PARA PODER USAR TODOS LOS MÉTODOS DE LOS STRINGS DEBEMOS CONVERTIR DE NUEVO EL OBJETO A STRING DE LA SIGUIENTE MANERA
 * 
 * query.toString();
 * 
 * AHORA TENEMOS DE NUEVO UN STRING PERO ESTA VEZ CON TODA LA INFORMACIÓN CONCATENADA CON TODOS LOS MÉTODOS DE LOS STRING DISPONIBLES. 
  */

	String string1 = "Hola.";
	String stringAConcatenar1 = " ¿Como esta ";
	String stringAconcatenar2 = "usted?";
	
	//PODRÍAMOS SIMPLEMENTE CONCATENAR LOS STRINGS PERO EN EL PROCESO SE CREARÍA MUCHA BASURA
	
	String saludo1 = string1 + stringAConcatenar1 + stringAconcatenar2;
	System.out.println(saludo1);

	
	//O PODEMOS HACERLO CONVIRTIÉNDOLO A UN OBJETO DE TIPO STRING BUILDER, CONCATENAR Y DESPUÉS VOLVER A CONVERTIR A STRING
	
	StringBuilder saludo2 = new StringBuilder(string1);
	saludo2.append(stringAConcatenar1).append(stringAconcatenar2);
	saludo2.toString();
	System.out.println(saludo2);
	
	
	
	/*
	 * 
	 * Otro método del StringBuilder es para quitar caracteres al final del string.
	 * 
	 * saludo2.setLength(saludo2.length()-2);
	 * Con saludo2.length()-2 le decimos que queremos etablecer la longitud en su longitud actual y luego restarle 2
	 * si pusieramos a secas saludo2(10) estaríamos queriendo establecer la longitud total en 10 caracteres.
	 * 
	 * En nuestro ejemplo quitará la interrogación y la d.	 * 
	 * */
	
	
	saludo2.setLength(saludo2.length()-2);
	
	
	
 }

}
