package curso_java.ejercicios.A6_POO.A2_POO;

public class CentroComercial {

	public static void main(String[] args) {
		
		
		DireccionTienda dir1 = new DireccionTienda("N1",2,28850);// ya que dirección no es un atributo normal de la clase tienda si no que es a 
																// a su vez una nueva clase llamada direccionTienda Debemos declarar un objeto de
																//   la clase DireccionTienda que podamos usar para crear el objeto tienda
		Tienda alcampo = new Tienda("Tienda1",1,"Alimentación",dir1);
		Tienda mediaMarkt = new Tienda("Tienda1",1,"Electrónica",dir1);
		Tienda peluqueria1 = new Tienda("Tienda1",1,"Peluquería",dir1);
		Tienda centrosUnico = new Tienda("Tienda1",1,"Centro de depilación",dir1);
		Tienda toysRUs = new Tienda("Tienda1",1,"Juguetería",dir1);

		
		//Para saber la dirección de la tienda "alcampo" debemos ir profundizando en las variables private.
		//En este caso el atributo direccion del objeto alcampo es a su vez otra clase.
		
		
		System.out.println(alcampo.getDireccion().getCodPostal());
		
	}
	
	
	

}
