package curso_java.A2_ejercicios.A6_POO.A3_POO;

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
				//Cambiamos la ropa de vestido a pantalon y camisa.
				//maniqui2.setVestido(null);
				
		
//CREACIÓN DEL ARRAY DE MANIQUIES PARA PODER MOSTRARLOS LUEGO EN EL ESCAPARATE
				//Debemos crear un array con los dos maniquies para luego poder mostrarlos. Recordemos que los maniquies son objetos por lo tanto 
				//el array debe ser del tipo de dato que va a contener. (el tipo de la clase de los objetos contenidos)
						Maniqui [] arrayManiquies = new Maniqui[2];
						arrayManiquies[0] = maniqui1;
						arrayManiquies[1] = maniqui2;
		
		
		
//USO DE LOS MÉTODOS.
			//maniqui1.vestir(pantalon2, camisa2);
			//maniqui1.desvestir();
			Escaparate.mostrarEscaparate(arrayManiquies);
			Escaparate.mostrarPrecio(arrayManiquies);
				

	}
	
//METODOS DE PARA MOSTRAR EL ESCAPARATE (Fuera del Main).

	//Metodo para mostrar el escaparate con los dos maniquíes tal y como están con su ropa.
	
		public static Maniqui mostrarEscaparate (Maniqui [] arrayManiquies) {
			for(Maniqui muestra : arrayManiquies) {
				System.out.println("El maniqui " + muestra.getId()+ " lleva puesto: ");
				
				if(muestra.getCamisa()!=null) {
					System.out.println("Una camisa");
					System.out.println("\tcolor: " + muestra.getCamisa().getColor());
					System.out.println("\ttalla: " + muestra.getCamisa().getTalla());
					System.out.println("\tprecio: " + muestra.getCamisa().getPrecio());
				}
			
				if(muestra.getPantalon()!=null) {
					System.out.println("Un pantalon");
					System.out.println("\tcolor: " + muestra.getPantalon().getColor());
					System.out.println("\ttalla: " + muestra.getPantalon().getTalla());
					System.out.println("\tprecio: " + muestra.getPantalon().getPrecio());
				}
				
				if(muestra.getVestido()!=null) {
					System.out.println("Un vestido");
					System.out.println("\tcolor: " + muestra.getVestido().getColor());
					System.out.println("\ttalla: " + muestra.getVestido().getTalla());
					System.out.println("\tprecio: " + muestra.getVestido().getPrecio());
					}
				
				
			}		
		return null;
	
		}
		
		//Metodo para mostrar el precio de lo que llevan puesto los maniquies.
		
		
			int precioTotal = 0;
			public static Maniqui mostrarPrecio (Maniqui [] arrayManiquies) {
				
				for(Maniqui muestra : arrayManiquies) {
					int precioTotal = 0;
					System.out.println("El maniqui " + muestra.getId()+ " lleva puesto el siguiente conjunto:  ");
					
					if(muestra.getCamisa()!=null) {
						System.out.println("camisa");
						System.out.println("\tprecio: " + muestra.getCamisa().getPrecio());
						precioTotal += muestra.getCamisa().getPrecio();
					}
				
					if(muestra.getPantalon()!=null) {
						System.out.println("Un pantalon");
						System.out.println("\tprecio: " + muestra.getPantalon().getPrecio());
						precioTotal += muestra.getPantalon().getPrecio();
					}
					
					if(muestra.getVestido()!=null) {
						System.out.println("Un vestido");
						System.out.println("\tprecio: " + muestra.getVestido().getPrecio());
						precioTotal += muestra.getVestido().getPrecio();
					}
					
					System.out.println("El precio total del conjunto del maniquí " + muestra.getId() + " es de " + precioTotal);
					
				}		
			return null;
		
			}
			
}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


