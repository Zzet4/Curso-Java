package curso_java.ejercicios.A6_POO.A4_POO_CarreraCaballos;

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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public double getApuesta() {
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
	
	
}
