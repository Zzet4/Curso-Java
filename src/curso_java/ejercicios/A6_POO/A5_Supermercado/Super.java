package curso_java.ejercicios.A6_POO.A5_Supermercado;

// ---------------FUNCIONALIDAD---------------
//	abrirSupermercado() --> se crean todos los objetos
//	3 clientes --> añadirProductos al carrito
//	2 cajeras --> cobrar a los clientes (Si el cliente es VIP hacer un 15% de descuento)
//	cada cliente tiene que pagar el importe de la compra

//------------------------------------

//CLASE Y ATRIBUTOS.
public class Super {
	private String nombre;
	private Cajera [] cajeras;
	
	
	
//GETTERS & SETTERS.
public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}
	
	
	
//CONSTRUCTORES.
	public Super(String nombre)  {
		super();
		this.nombre = nombre;
		this.cajeras = new Cajera[2];
	}


	
public void abrirSupermercado(){
//CONSTRUCCIÓN DE OBJETOS
	System.out.println("-------------------BIENVENIDO------------------");
	
	//Construímos productos
	Producto platano = new Producto(01, "platano", 1.50, "fruta");
	Producto manzana = new Producto(02, "manzana", 1, "fruta");
	Producto lechuga = new Producto(03, "lechuga", 0.80, "verdura");
	Producto lomo = new Producto(04, "lomo", 3.50, "carne");
	Producto merluza = new Producto(05, "merluza", 2.50, "pescado");
		//Creamos un array con todos los productos para mostrarlos.
		Producto [] arrayProductos = new Producto[5];
			arrayProductos[0] = platano;
			arrayProductos[1] = manzana;
			arrayProductos[2] = lechuga;
			arrayProductos[3] = lomo;
			arrayProductos[4] = merluza;
			
	//Construímos clientes
	Cliente cliente1 = new Cliente(01, "pepe", true);
	Cliente cliente2 = new Cliente(02, "juan", false);
	//construímos cajeras
	Cajera cajera1 = new Cajera(01, "La Jeny");
	Cajera cajera2 = new Cajera(02, "La Susi");
		//Creamos un array con las cajeras
		Cajera [] arrayCajeras = new Cajera[2];
			arrayCajeras[0]=cajera1;
			arrayCajeras[1]=cajera2;
			
cliente1.meterEnCarrito(arrayProductos);


}
	
	
	
	
	
	
	
	
	
//---------------FUNCIONALIDADES.-------------------
	public static void main(String[] args) {
//Construimos super
	Super ahorramas = new Super("Ahorramas");
	ahorramas.abrirSupermercado();
	

	}

}
