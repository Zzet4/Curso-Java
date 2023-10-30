package curso_java.A2_ejercicios.A6_POO.A3_POO;

public class Vestido {
	
	
//Atributos
	private int id;
	private String color;
	private String talla;
	private double precio;
	
	
	
	//Constructores
	public Vestido(int id, String color, String talla, double precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	
	//Getters & Setters
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

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
