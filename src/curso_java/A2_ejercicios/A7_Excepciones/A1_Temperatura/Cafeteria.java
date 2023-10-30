package curso_java.A2_ejercicios.A7_Excepciones.A1_Temperatura;


//CLASE Y ATRIBUTOS
public class Cafeteria {
	private String nombre;

//GETTERS & SETTERS
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

//CONSTRUCTORES
public Cafeteria(String nombre) {
	super();
	this.nombre = nombre;
}

//METODO MAIN
	public static void main(String[] args) {
		//CREACIÓN OBJETOS NECESARIOS Y LLAMADAS A MÉTODOS.
		
		//Creamos el objeto Cafeteria (migas) para poder invocar al método abrirCafetería ya que la llamada se hace desde este metodo "main"
		// que es estático por lo que se necesita un objeto para llamar a un metodo no estático desde uno estático.
		Cafeteria migas = new Cafeteria("Migas");
		migas.abrirCafeteria(); //Todo tiene que pasar en este método.
		
		
		
		
		
		
	}
//METODOS CAFETERÍA.
	
	public void abrirCafeteria() {
		
	//CREACIÓN DE OBJETOS.

		//Creamos los objeto ClienteCafetería
		ClienteCafeteria paco = new ClienteCafeteria("Paco");
		
		
		
		boolean cafeOk;
		do {
			//Creamos los objeto CoffeCup
			CoffeCup capuchino = new CoffeCup();
			System.out.println("La temperatura del cafe son: " + capuchino.getTemperatura() + " grados.");
			cafeOk = true;
			
			try {
				paco.tomarTazaCafe(capuchino);
			}catch(TooColdTemperatureException e) {
				System.out.println("El cliente necesita otro café, el suyo estaba muy frío");
				cafeOk = false;
			
			}catch(TooHotTemperatureException e) {
				System.out.println("El cliente necesita otro café, el suyo estaba muy caliente");
				cafeOk = false;
				
			}finally {
				System.out.println("Esto se imprime si o si");
			}
		
		}while(!cafeOk);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
