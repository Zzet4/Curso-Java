package curso_java.A1_Teoria.A5_Funciones;

public class A4_Metodos_VarArgs {
	public static void main (String [] args) {
		
	
		
		metodo1(12, "juan", "jose", "pepe");
	}
	
//=====================================================================================================================
	
	//Cuando encontramos un metodo declarado con su ULTIMO argumento con tres puntos suspensivos entre el tipo y el nombre quiere decir que admite
	//Un numero indeterminado de parametros de ese tipo, pero siempre debe ser el último argumento de la declaración.
	public static void metodo1 (int num, String...nombres) {
		
		//Para recorrerlo la sintaxis es la siguiente como de costumbre.
		for (String nombre : nombres) {
			System.out.println(nombre);
			
		}
	}
}
