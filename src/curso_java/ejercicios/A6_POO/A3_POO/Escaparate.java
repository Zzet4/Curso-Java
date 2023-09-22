package curso_java.ejercicios.A6_POO.A3_POO;

public class Escaparate {

	public static void main(String[] args) {
		
		
		
//CREACIÓN DE LOS OBJETOS.
		
	//objetos de la clase boton
		
		Boton boton1 = new Boton(01, "negro", "redondo", "mediano" );
		Boton boton2 = new Boton(02, "blanco", "cuadrado", "mequeño" );
		
			//Creamos un array para los botones.
			Boton [] arrayBotones = new Boton [2];
				arrayBotones[0] = boton1;
				arrayBotones[1] = boton2;

		
	//objetos de la clase Pantalon
			Pantalon pantalon1 = new Pantalon(01, "Gris", "M", 50, boton1 );
			Pantalon pantalon2 = new Pantalon(02, "negro", "L", 60, boton2 );
			
			
	//objetos de la clase Camisa
			Camisa camisa1 = new Camisa(01, "Azul", "M", 80, boton1 );
			Camisa camisa2 = new Camisa(02, "Roja", "L", 80, boton2 );

			
	//objetos de la clase Vestido
			Vestido vestido1 = new Vestido(01, "Rojo", "M", 100);
			Vestido vestido2 = new Vestido(02, "Negro", "M", 90);
			
			
			
	//objetos de la clase maniqui
			//Maniqui desnudo
			Maniqui maniqui1 = new Maniqui(01);
			
			//Maniqui vestido
			Maniqui maniqui2 = new Maniqui(02,  vestido1,  null,  null);		
		
		
		
//USO DE LOS MÉTODOS.
			maniqui1.vestir(pantalon2, camisa2);
		
		
		

	}
	
//METODOS DE PARA MOSTRAR EL ESCAPARATE.
	
	

}
