package curso_java.ejercicios.A6_POO.A3_POO;

public class Boton {
	
	
//Atributos
	private int id;
	private String color;
	private String forma;
	private String tamanio;
	

	
	
	//Constructores
public Boton(int id, String color, String forma, String tamanio) {
	super();
	this.id = id;
	this.color = color;
	this.forma = forma;
	this.tamanio = tamanio;
	}


//setters & getters

public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getColor() {
	return color;
}




public void setColor(String color) {
	this.color = color;
}




public String getForma() {
	return forma;
}




public void setForma(String forma) {
	this.forma = forma;
}




public String getTamanio() {
	return tamanio;
}




public void setTamanio(String tamanio) {
	this.tamanio = tamanio;
}	
}
