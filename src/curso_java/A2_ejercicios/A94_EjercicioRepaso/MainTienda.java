package curso_java.A2_ejercicios.A94_EjercicioRepaso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainTienda {

	public static void main(String[] args) {
		//Crear 3 tornillos y una ferretería con 3 tornillos.
		
		//Creando tornillos desde la clase tornillo
		Tornillo tornilloNaranja = new Tornillo("Naranja", 30, 2, 2);
		Tornillo tornilloMorado = new Tornillo("Morado", 35, 2, 2.5);
		Tornillo tornilloAmarillo = new Tornillo("Amarillo", 40, 2, 3);
		
		//Creando tornillos utilizando el constructor que acude a la clase enum TornilloEnum
		Tornillo tornillo1 = new Tornillo(TornilloEnum.Tornillo1);
		Tornillo tornillo2 = new Tornillo(TornilloEnum.Tornillo2);
		Tornillo tornillo3 = new Tornillo(TornilloEnum.Tornillo3);
		
		
		
		//Creando el array con los seis tornillos anteriores.
		Tornillo [] tornillosA1 = new Tornillo[6];
			tornillosA1[0] = tornilloNaranja;
			tornillosA1[1] = tornilloMorado;
			tornillosA1[2] = tornilloAmarillo;
			tornillosA1[3] = tornillo1;
			tornillosA1[4] = tornillo2;
			tornillosA1[5] = tornillo3;
		Tornillo [] tornillosA2 = {tornillo1, tornillo2, tornillo3 };
		
		//Creando una ferretería desde la clase ferretería
		Ferreteria ferreteria1 = new Ferreteria(1, "Ferreteria_Paco", "calle_paco", tornillosA1);
		
		
		//Creando una ferretería desde el fichero.properties
		Ferreteria ferreteria2 = new Ferreteria(tornillosA2);
		
		
		//Mostraremos el sumatorio de los precios de los tornillos
		
			//MÉTODO CON FOR EACH
		double sumatorioPrecioTornillos = 0;
		for(Tornillo tornillo : ferreteria1.getTornillos()) {
			sumatorioPrecioTornillos += tornillo.getPrecio();
		}
		System.out.println("El sumatorio de precios para los tornillos es: " + sumatorioPrecioTornillos);
		List<Tornillo> listaTornillos = Arrays.asList(ferreteria1.getTornillos());

		
		
		
			//METODO CON FUNCION LAMBDA
		Stream<Tornillo> streamTornillos = Arrays.asList(ferreteria1.getTornillos()).stream();
		sumatorioPrecioTornillos = streamTornillos.mapToDouble(torni->torni.getPrecio()).sum();
		System.out.println(sumatorioPrecioTornillos);
		
		
	}

}
