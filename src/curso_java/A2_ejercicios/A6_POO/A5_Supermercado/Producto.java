package curso_java.A2_ejercicios.A6_POO.A5_Supermercado;


//CLASE Y ATRIBUTOS.
	public class Producto {
		private int id;
		private String nombre;
		private double precio;
		private String tipo;
	
	
	
//GETTER & SETTERS.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
//CONSTRUCTORES.
	public Producto(int id, String nombre, double precio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	
	
//METODOS.
	
	
	

}
