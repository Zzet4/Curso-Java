package curso_java.A2_ejercicios.A6_POO.A2_POO;

public class Tienda {
	
	private String nombre;
	private long id;
	private String tipo;
	private DireccionTienda direccion;
	
	//Para crear los constructores hemos utilizado boton derecho -> source -> create constructor using fields -> seleccionamos los atributos que deseamos 
			//para crear el constructor en cuestión
	public Tienda(String nombre, long id, String tipo, DireccionTienda direccion) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.tipo = tipo;
		this.direccion = direccion;
	}

	
	
	
	
	//Para crear los getter and setters hemos utilizado boton derecho -> source -> create getters and setters -> seleccionamos los atributos que deseamos 
	//para crear el los metodos get para consultar y set para modificar. 
	
	
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public DireccionTienda getDireccion() {
	return direccion;
}

public void setDireccion(DireccionTienda direccion) {
	this.direccion = direccion;

 }
}
