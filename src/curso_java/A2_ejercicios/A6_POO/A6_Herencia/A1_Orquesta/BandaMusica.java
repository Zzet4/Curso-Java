package curso_java.A2_ejercicios.A6_POO.A6_Herencia.A1_Orquesta;

public class BandaMusica {

	public static void main(String[] args) {

		BandaMusica LinkinPark = new BandaMusica();
		

		
		LinkinPark.empezarConcierto();
		
		
	}
	
	
	
	
//MÉTODOS.
	
	public void empezarConcierto() {
		
		Guitarra guitarraEspañola = new Guitarra("Guitarra", "Cuerda", 6);
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra Electrica", "Cuerda", 6, 600);
		Piano pianoDeCola = new Piano("Piano", "Cuerda percutida", 7, "De cola");
		Tambor tambor = new Tambor("Tambor", "Percusión", "Plástico");
		
		
		
		//Como puedo hacer un array con 4 objetos de tipos diferentes cada uno????
		//Declaro un array del tipo de la clase padre y como todos los objetos heredan de esa clase padre, pueden entrar en 
		//Un array de tipo Instrumento en este caso
		
		
		
		
		
		
		Instrumento [] arrayInstrumentos = new Instrumento[4];
			arrayInstrumentos[0]= guitarraEspañola;
			arrayInstrumentos[1]= guitarraElectrica;
			arrayInstrumentos[2]= pianoDeCola;
			arrayInstrumentos[3]= tambor;
			// Otra manera de declarar el array
			// Instrumento [] arrayInstrumentos =  {guitarraEspañola, guitarraElectrica, pianoDeCola, tambor};
			
			
		
		afinarInstrumentos(arrayInstrumentos);
		tocarInstrumentos(arrayInstrumentos);
		
	}
	
	
	
	
	public void afinarInstrumentos (Instrumento [] arrayInstrumentos) {
		for(Instrumento datoInstrumento : arrayInstrumentos) {			
			datoInstrumento.afinar();
		}
		System.out.println("\n\tTodos los instrumentos están afinados");
	}
	
	
	
	
	
	public void tocarInstrumentos (Instrumento [] arrayInstrumentos) {
		for (Instrumento datoInstrumento : arrayInstrumentos) {
			if(datoInstrumento instanceof Tambor) {  //Aqui preguntamos si esta variable (de tipo instrumento) apunta a un objeto de tipo tambor
				((Tambor)datoInstrumento).aporrear();  // En caso de ser así hacemos Cast diciéndole que ese objeto es de tipo tambor.
			}else {datoInstrumento.tocar();
			}
		}
		System.out.println("\n\tTodos los instrumentos están sonando");
	}
	
	
}
