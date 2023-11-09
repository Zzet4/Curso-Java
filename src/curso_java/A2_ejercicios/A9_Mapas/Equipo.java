package curso_java.A2_ejercicios.A9_Mapas;

import java.util.List;

public class Equipo {
	
	private String nombre;
	private int ligas;
	private int champions;
	private List<Jugador> jugadores;  
	

	public Equipo(String nombre, int ligas, int champions, List<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.ligas = ligas;
		this.champions = champions;
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLigas() {
		return ligas;
	}
	public void setLigas(int ligas) {
		this.ligas = ligas;
	}
	public int getChampions() {
		return champions;
	}
	public void setChampions(int champions) {
		this.champions = champions;
	}
	
	
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ligas=" + ligas + ", champions=" + champions + ", jugadores=" + jugadores
				+ "]";
	}

	
	
	
}
