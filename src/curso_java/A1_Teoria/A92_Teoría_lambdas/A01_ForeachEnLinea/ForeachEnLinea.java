package curso_java.A1_Teoria.A92_Teoría_lambdas.A01_ForeachEnLinea;

import java.util.ArrayList;
import java.util.List;

import curso_java.A2_ejercicios.A93_Hibernate.Hibernate2.Entity.Producto;
import curso_java.A3_Utilidades.UtilsFechas.UtilsFecha;

public class ForeachEnLinea {

	public static void main(String[] args) {
		// ESTA ES LA FORMA DE IMPRIMIR UN FOREACH EN UNA LINEA SOLO UTILIZANDO INTERFACES FUNCIONALES, ( VER LINEA 28 ).

		Producto producto1 = new Producto("prod1", "tipo1", UtilsFecha.generaFecha(), 10, 50);
		Producto producto2 = new Producto("prod2", "tipo2", UtilsFecha.generaFecha(), 6, 60);
		Producto producto3 = new Producto("prod3", "tipo3", UtilsFecha.generaFecha(), 20, 30);
		List<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);

		
		listaProductos.forEach(producto->System.out.println(producto));

	}

}
