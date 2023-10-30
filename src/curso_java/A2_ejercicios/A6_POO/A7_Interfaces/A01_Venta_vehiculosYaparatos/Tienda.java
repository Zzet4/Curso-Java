package curso_java.A2_ejercicios.A6_POO.A7_Interfaces.A01_Venta_vehiculosYaparatos;

public class Tienda {

	
	public SistemaEncendido[]  abrirTienda() {
		
		//Método encenderse (solo 1 parametro. No puede ser el objeto usuario)
		//Podrá encender cualquier vehículo o cualquier aparato.
		
		//Creamos un objeto de cada tipo
		//Creamos un usuario al que le asignamos los objetos
		Coche coche1 = new Coche(5);
		Moto moto1 = new Moto(2);
		Movil movil1 = new Movil("Android");
		TV tv1 = new TV(3);
		Juguete juguete1 = new Juguete("Rojo");
		Usuario usuario1 = new Usuario(movil1, tv1, moto1, coche1, juguete1);
		
		
		SistemaEncendido [] arrayProductos= new SistemaEncendido[5];
			arrayProductos[0] = coche1;
			arrayProductos[1] = moto1;
			arrayProductos[2] = movil1;
			arrayProductos[3] = tv1;
			arrayProductos[4] = juguete1;
			
			return arrayProductos;
			
	}
	
	
	public void encenderse(SistemaEncendido [] arrayProductos) {
		for (SistemaEncendido producto : arrayProductos) {
			if(producto!=null) {
				producto.encender();
			}
		}
	}

	public static void main(String[] args) {
		
		Tienda tienda1 = new Tienda();
		SistemaEncendido [] arrayProductos = tienda1.abrirTienda();
		tienda1.encenderse(arrayProductos);
	
		//Llamamoos al metodo encender con cada uno de los objetos
		
		
		
		
		
	}

}
