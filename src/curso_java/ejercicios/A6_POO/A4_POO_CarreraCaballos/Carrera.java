package curso_java.ejercicios.A6_POO.A4_POO_CarreraCaballos;

public class Carrera {
	
	int id;
	String nombre;
	Caballos [] caballo;
	int distancia;
	
//Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Caballos[] getCaballo() {
		return caballo;
	}
	public void setCaballo(Caballos[] caballo) {
		this.caballo = caballo;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
//Constructores
	
	public Carrera(int id, String nombre, Caballos[] caballo, int distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballo = caballo;
		this.distancia = distancia;
	}
	
	
	
//Métodos.
	
	public void inicarCarrera(Caballos [] caballo){
		boolean ganador = false;
		do {
			for (Caballos participante : caballo) {
				participante.correr();
				if(participante.getAvance()>this.distancia){
					ganador = true;
					break;
				}
			}
		}while(ganador==false);
								
	}
			
		//System.out.println("El caballo ganador es");
			
		
}

