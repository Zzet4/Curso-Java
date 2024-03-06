package curso_java.A2_ejercicios.A94_EjercicioRepaso;

public enum TornilloEnum {
	
	Tornillo1 ("rojo",10, 1, 2),
	Tornillo2 ("verde",15, 2, 2.50),
	Tornillo3 ("azul",20, 3, 3);
	
	private String color;
	private int longitud;
	private int diametro;
	private double precio;
	
	
	private TornilloEnum(String color, int longitud, int diametro, double precio) {
		this.color = color;
		this.longitud = longitud;
		this.diametro = diametro;
		this.precio = precio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public int getDiametro() {
		return diametro;
	}


	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	


}
