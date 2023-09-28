package curso_java.ejercicios.A6_POO.A4_CarreraCaballos;

import curso_java.utilidades.Utils;

public class Apostante {
	
//Atributos
	private String nombre;
	private int saldo;
	private int apuesta;
	private int dorsalApostado;
	
	

	
//Constructores
	public Apostante(String nombre, int saldo, int apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}
	
	
	
	
	
//Getter & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSaldo() {
		return saldo;
	}
//	public void setSaldo(int saldo) {        //Este set no tiene sentido ya que hemos creado un método para modificar el saldo
//		this.saldo = saldo;					 //que se llama actualizaSaldo
//	}
	public int getApuesta() {
		return apuesta;
	}
	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}
	public double getDorsalApostado() {
		return dorsalApostado;
	}
	public void setDorsalApostado(int dorsalApostado) {
		this.dorsalApostado = dorsalApostado;
	}

//Metodo
	
	public int preguntaApuesta () {
		
		int apuesta = Utils.scanInt("¿Cuanto dinero desea apostar?");
		this.apuesta = apuesta;
		return apuesta;
	}

	public int preguntaDorsal () {
		
		int dorsal = Utils.scanInt("¿A que dorsal deseas apostar?");
		this.dorsalApostado = dorsal;
		return dorsal;
	}
	
	public void actualizaSaldo (int importe) {  //Creamos un método que
		this.saldo += importe;
	}
	
	
}
