package curso_java.ejercicios.A6_POO.A4_POO_CarreraCaballos;

public class CasaDeApuestas {

	public static void main(String[] args) {
	Caballos caballo1 = new Caballos(01, "dori", 01, 3, 60, 300);
	Caballos caballo2 = new Caballos(02, "nemo", 02, 2, 50, 200);
	Caballos caballo3 = new Caballos(03, "piecito", 03, 4, 75, 400);
	
//llamamos al metodo correr de la clase Caballos con objetos de tipo Caballos
//	caballo1.correr();
//	caballo2.correr();
//	caballo3.correr();
	
	//Creamos un array de caballos que será la parrilla de salida de una carrera
	Caballos [] arrayCaballos = new Caballos[3];
		arrayCaballos[0]=caballo1;
		arrayCaballos[1]=caballo2;
		arrayCaballos[2]=caballo3;
	
	//Creamos un objeto carrera para invocar a su método inicarCarrera y le pasamos los parámetros de su constructor. numero, nombre, parrilla de
		//salida y distancia en metros del recorrido.
	Carrera carrera1 = new Carrera(01, "Carrera 1", arrayCaballos, 2500);
		
	//invocamos al método iniciarCarrera con el objeto carrera1 anteriormente creado.
	carrera1.inicarCarrera(arrayCaballos);
	

	}

}
