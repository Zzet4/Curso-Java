package curso_java.A2_ejercicios.A94_EjercicioRepaso;

public class Tornillo {
	private String color;
	private int longitud;
	private int diametro;
	private double precio;
	
	
	
	public Tornillo(String color, int longitud, int diametro, double precio) {
		super();
		this.color = color;
		this.longitud = longitud;
		this.diametro = diametro;
		this.precio = precio;
	}
	
	
	
	public Tornillo(TornilloEnum tornillo) {
		super();
		this.color = tornillo.getColor();
		this.longitud = tornillo.getLongitud();
		this.diametro = tornillo.getDiametro();
		this.precio = tornillo.getPrecio();
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
