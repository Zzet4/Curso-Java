package A91_Teoría_Mapas;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PruebaMapas {

	public static void main(String[] args) {
		
		
		
		
		
		/*LOS MAPAS SON ESTRUCTURAS QUE SIRVEN PARA GUARDAR INFORMACIÓN
		* SON COMO LAS LISTAS, O COLECCIONES, CON LA DIFERENCIA DE QUE
		*CADA POSICIÓN TIENE UNA CLAVE Y UN VALOR Y PODEMOS JUGAR CON ELLAS PARA ACCEDER
		*A LA INFORMACIÓN QUE GUARDAN. LA CLAVE PUEDE SER UN INTEGER Y EL VALOR UN STRING
		*O LA CLAVE PUEDE SER UNA LISTA Y EL VALOR OTRA LISTA
		*O COMO EN EL CASO DE ESTE EJEMPLO LA CLAVE PUEDE SER UN STRING(DNI) Y LA CLAVE
		*ES UN OBJETO DE TIPO ALUMNO, DE ESTA FORMA PODEMOS HACER BÚSQUEDAS FÁCILES
		*POR CLAVE(DNI) O POR VALOR DONDE RECUPERAREMOS UN ATRIBUTO DEL OBJETO ALUMNO.
		*/
		
		//Declaramos un mapa y entre diamantes le metemos los genéricos de su clave y de su valor
		//lo llamampos mapa1 y lo inicializamos con la clase HashMap volviendo a indicar sus genéricos
		Map<Integer, String> mapa1 = new HashMap<Integer, String>();
		
		//Añadir información al mapa
		mapa1.put(1, "Amarillo");
		mapa1.put(2, "Rojo");
		mapa1.put(3, "Verde");
		mapa1.put(4, "Naranja");
		
		//Antes la key 1 valia amarillo ahora la cambiamos a azul
		//Si queremos guardar el antiguo valor antes de actualizar
		//guardamos en una variable la sustitución.
		//ahora el valor antiguo se ha quedado guardadeo en "datoAntiguo"
		//pero la posición del mapa se ha actualizado a azul.
		
		String datoAntiguo = mapa1.put(1, "Azul");
		System.out.println(datoAntiguo);
		
		//Si queremos recuperar el valor actual de esa posición del mapa
		//simplemente accedemos a su posicion con el metodo get(clave)
		//pensemos en la calve como una etiqueta para ese valor, si hacemos
		//.get(clave), nos devuelve el valor asociado a esa clave o (etiqueta)
		
		System.out.println(mapa1.get(1));
		
		//Para saber si el mapa esta vacío usamos el método .isEmpty();
		boolean mapaVacio = mapa1.isEmpty();
		
		//Para borrar posiciones del mapa le indicamos entre parentesis la clave que queremos borrar con el 
		//metodo .remove(1);
		mapa1.remove(3);
		
		
		//Para sustituír un objeto del mapa usamos el método .replace(claveAntigua, valorAntiguo, valorNuevo);
		mapa1.replace(4, "Naranja", "Rosa");
		//Solo reemplazará si el valorAntiguo existe en la lista
		
		//Para consultar el tamaño del mapa usamos el método .size();
		mapa1.size();
		
		
		//metodo containsKey(1), preguntamos al mapa si contiene una posición con la key 1, en este caso
		// 1 no tiene mucho sentido pero si hacemos un mapa de alumnos donde las key son los dni y el valor
		// asociado a cada key es una lista con sus datos si tiene mas sentido, sería por ejemplo
		System.out.println(mapa1.containsKey(34423423));
		
		
		//Exactamente igual para buscar si alguna posición del mapa contiene algun valor, por ejemplo amarillo
		//utilizamos la funcion containsValue(A);
		System.out.println(mapa1.containsValue("Azul"));
		
		
		//Para consultar el conjunto de keys de un mapa usamos el método keySet();
		System.out.println(mapa1.keySet());
		//podemos guardarlos en una lista y recorrerlos con un foreach para realizar operaciones
		//por ejemplo acceder cada clave o al valor de cada clave
		Set<Integer> claves = mapa1.keySet();
		for (Integer num : claves) {
			//Accedemos a cada clave
			System.out.println(num);
			//Accedemos al valor de cada clave
			System.out.println(mapa1.get(num));
		}
		
		
		
		//Para recuperar una colección con todos los valores usamos el método .values();
		System.out.println(mapa1.values());
		
		//Que también podemos guardar en una variable para recorrer de nuevo con un foreach
		Collection<String> valores = mapa1.values();
		for (String valor : valores) {
			System.out.println(valor);
		}
		
		//si queremos recuperar tanto la calve como el valor a la vez utilizamos el método
		//.entrySet(); que nos devuelve un set de objetos tipo Entry.
		//Cada objeto de tipo Entry tiene en su interior una posicion del mapa por lo que cada
		//Entry del Set recibido tiene dentro una clave de tipo Integer y un valor de tipo String
		
		Set<Entry<Integer, String>> entries = mapa1.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
		//System.out.println(mapa1.containsValue(""));

	}

}
