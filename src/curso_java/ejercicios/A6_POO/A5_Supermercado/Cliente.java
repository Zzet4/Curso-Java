package curso_java.ejercicios.A6_POO.A5_Supermercado;

import curso_java.utilidades.Utils;

//CLASE Y ATRIBUTOS.
public class Cliente {
	private int id;
	private String nombre;
	private boolean vip;
	private Producto [] carrito;
	
	
	
//GETTERS & SETTERS.
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
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public Producto[] getCarrito() {
		return carrito;
	}
	public void setCarrito(Producto[] carrito) {
		this.carrito = carrito;
	}

	
	
//CONSTRUCTORES.
	public Cliente(int id, String nombre, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vip = vip;
		this.carrito = new Producto [5];
	}
	
	
	
//METODOS.
	
	
	public Producto mostrarProductos(Producto [] arrayProductos) {
		String prodSeleccionado = "";
		for(Producto producto : arrayProductos) {
			System.out.print(producto.getNombre() + "\t");	
		}
		prodSeleccionado = Utils.scanString("\nSeleccione un producto para meter en la cesta");
		
		for(Producto producto : arrayProductos) {
			if(prodSeleccionado.equalsIgnoreCase(producto.getNombre())){
				return producto;
			}
		}
		return null;
		
	}
	
	
	//TODO METODO LLENAR CESTA
	public void meterEnCarrito (Producto [] arrayProductos) {	
			for ( int i=0  ; i<this.carrito.length  ; i++  ) {
				System.out.println("------------TENEMOS LOS SIGUIENTES PRODUCTOS-------------\n");
				carrito[i]=mostrarProductos(arrayProductos);
  }	
			System.out.println("\nEl contenido del carrito es el siguiente:\n");
			for (Producto producto : carrito) {
				System.out.println(producto.getNombre());
			}
}
	
	
	//TODO METODO PAGAR.
	public void pagar () {
		
	}

}
