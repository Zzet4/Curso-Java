package curso_java.A2_ejercicios.A9_Mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Estadio {

	public static void main(String[] args) {
	
		Estadio bernabeu = new Estadio();
//		bernabeu.generarEquipos();
		

		Jugador jugador1 = new Jugador("Jugador1", 28, "Delantero");
		Jugador jugador2 = new Jugador("Jugador2", 25, "Centro");
		Jugador jugador3 = new Jugador("Jugador3", 26, "Defensa");
		List<Jugador> jugadoresRealMadrid = new ArrayList<Jugador>();
			jugadoresRealMadrid.add(jugador1);
			jugadoresRealMadrid.add(jugador2);
			jugadoresRealMadrid.add(jugador3);
			
			
			
		Jugador jugador4 = new Jugador("Jugador4", 24, "Delantero");
		Jugador jugador5 = new Jugador("Jugador5", 29, "Centro");
		Jugador jugador6 = new Jugador("Jugador6", 24, "Defensa");
		List<Jugador> jugadoresBarsa = new ArrayList<Jugador>();
			jugadoresBarsa.add(jugador4);
			jugadoresBarsa.add(jugador5);
			jugadoresBarsa.add(jugador6);
		
			
			
		Jugador jugador7 = new Jugador("Jugador7", 21, "Delantero");
		Jugador jugador8 = new Jugador("Jugador8", 20, "Centro");
		Jugador jugador9 = new Jugador("Jugador9", 22, "Defensa");
		List<Jugador> jugadoresAtleti = new ArrayList<Jugador>();
		jugadoresAtleti.add(jugador7);
		jugadoresAtleti.add(jugador8);
		jugadoresAtleti.add(jugador9);
			
			
		Equipo RealMadrid = new Equipo("Real Madrid", 35, 14, jugadoresRealMadrid);
		Equipo barsa = new Equipo("Futbol Club Barcelona", 27, 5, jugadoresBarsa);
		Equipo atleti = new Equipo("Atlético de Madrid", 11, 0, jugadoresAtleti);
		
			
		//mapa con 3 equipos y 3 jugadores en cada equipo
		Map<Equipo, List<Jugador>> liga = new HashMap();
		liga.put(RealMadrid, jugadoresRealMadrid);
		liga.put(barsa, jugadoresBarsa);
		liga.put(atleti, jugadoresAtleti);

		
		
		
		//1. mostrar solo los nombres de los jugadores.
		Collection<List<Jugador>> listasJugadores = liga.values();
		for(List<Jugador> lista : listasJugadores) {
			for(Jugador jugador : lista) {
				System.out.println(jugador.getNombre());
			}
		}
		
		
		
		//2. mostrar la información de un equipo y todos los datos de sus jugadores
		
		Set<Equipo> equipos = liga.keySet();
		for(Equipo equipo : equipos) {
			System.out.println(equipo);
			List<Jugador> lista = liga.get(equipo);
			for(Jugador jugador : lista) {
				System.out.println(jugador.getNombre());
			}
		}
		
		
		
		
		
		
		
		
		
	}	
		

		

	
	
	public void generarEquipos() {
		
		Equipo RealMadrid = new Equipo("Real Madrid", 35, 14, null);
		Equipo barsa = new Equipo("Futbol Club Barcelona", 27, 5, null);
		Equipo atleti = new Equipo("Atlético de Madrid", 11, 0, null);
		
		
		Jugador jugador1 = new Jugador("Jugador1", 28, "Delantero");
		Jugador jugador2 = new Jugador("Jugador2", 25, "Centro");
		Jugador jugador3 = new Jugador("Jugador3", 26, "Defensa");
		
		
		Jugador jugador4 = new Jugador("Jugador4", 24, "Delantero");
		Jugador jugador5 = new Jugador("Jugador5", 29, "Centro");
		Jugador jugador6 = new Jugador("Jugador6", 24, "Defensa");
		Jugador jugador7 = new Jugador("Jugador7", 21, "Delantero");
		Jugador jugador8 = new Jugador("Jugador8", 20, "Centro");
		Jugador jugador9 = new Jugador("Jugador9", 22, "Defensa");

		
	}
}
