package curso_java.ejercicios.A6_POO.A4_POO_CarreraCaballos;

import curso_java.utilidades.Utils;

public class GranPremio {
	
//Atributos
	
	private int id;
	private String nombre;
	private Carrera [] carreras;
	
//Constructores
	
	public GranPremio(int id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}
	
//Getter & ÇSetters

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

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}

	
//Metodo iniciarGranPremio
	
	public void iniciarGranPremio(Apostante [] apostante) {
		System.out.println("\n\n----COMIENZA EL GRAN PREMIO DE " + this.nombre + "----\n\n");
		
		
		for(Carrera carrera : carreras) {
			System.out.println("Bienvenidos a la " + carrera.getNombre());
			
			for(Apostante datoApostante : apostante) {				
				System.out.println(datoApostante.getNombre());
				datoApostante.preguntaDorsal();
				datoApostante.preguntaApuesta();
			}
			
			int resultadoCarrera = carrera.iniciarCarrera();
			for(Apostante datoApostante : apostante) {	
				if(resultadoCarrera == datoApostante.getDorsalApostado()) {
					//datoApostante.setSaldo() = datoApostante.getApuesta() * 5;
				}else {
					//datoApostante.setSaldo() -= datoApostante.getApuesta();
					
				}
			}
		}
	}
	
	
}
