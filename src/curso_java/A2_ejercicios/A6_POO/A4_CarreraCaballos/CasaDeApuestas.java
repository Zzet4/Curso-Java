package curso_java.A2_ejercicios.A6_POO.A4_CarreraCaballos;

import curso_java.A3_Utilidades.Utils;

public class CasaDeApuestas {

//Creamos los objetos caballos.
	public static void main(String[] args) {
	Caballos caballo1 = new Caballos(01, "dori", 01, 3, 60, 300);
	Caballos caballo2 = new Caballos(02, "nemo", 02, 2, 50, 200);
	Caballos caballo3 = new Caballos(03, "piecito", 03, 4, 75, 400);
//Creamos un array de caballos que será la parrilla de salida de una carrera
	Caballos [] arrayCaballos = new Caballos[3];
		arrayCaballos[0]=caballo1;
		arrayCaballos[1]=caballo2;
		arrayCaballos[2]=caballo3;
			//llamamos al metodo correr de la clase Caballos con objetos de tipo Caballos para combrobar que funciona
			//	caballo1.correr();
			//	caballo2.correr();
			//	caballo3.correr();
	
//-----------------------------------------------------------------------------------------------------------------
	
		
		
//Creamos los objetos carrera para invocar a su método inicarCarrera y le pasamos los parámetros de su constructor. numero, nombre, parrilla de
	//salida y distancia en metros del recorrido.
	Carrera carrera1 = new Carrera(01, "Carrera 1", arrayCaballos, 2500);
	Carrera carrera2 = new Carrera(02, "carrera 2", arrayCaballos, 1200);
//Creamos un array de carreras que serán las pruebas incluídas en el Gran Prix.
	Carrera [] arrayCarreras = new Carrera[2];
		arrayCarreras[0] = carrera1;
		arrayCarreras[1] = carrera2;
			//invocamos al método iniciarCarrera con el objeto carrera1 anteriormente creado para comprobar que funciona
			//carrera1.iniciarCarrera();
			//carrera2.iniciarCarrera();
		
//-------------------------------------------------------------------------------------------------------------
	
		
	
//Creamos un objeto de la clase gran premio y le añadimos las carreras creadas.
	GranPremio granPrixSuiza = new GranPremio(01, "GP Suiza", arrayCarreras);
	
//Invocamos al método inicarGranPremio con un objeto Gran Premio de Suiza para combrobar que funciona
	//granPrixSuiza.iniciarGranPremio();
	
	

//----------------------------------------------------------------------------------------------------------------------------------------
	
	
//Parte de los apostantes.
	
	//Creamos los objetos apostantes
	Apostante apostante1 = new Apostante("Juan", 1000, 0);
	Apostante apostante2 = new Apostante("Pepe", 2000, 0);
	//Creamos un array de apostantes.
	Apostante [] arrayApostantes = new Apostante[2];
		arrayApostantes[0] = apostante1;
		arrayApostantes[1] = apostante2;
		
		
	
	//INICIO DE LA APUESTA
	
	
	
		granPrixSuiza.iniciarGranPremio(arrayApostantes);

	}
	


}
