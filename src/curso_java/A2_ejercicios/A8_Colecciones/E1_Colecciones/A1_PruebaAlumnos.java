package curso_java.A2_ejercicios.A8_Colecciones.E1_Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import curso_java.A2_ejercicios.A6_POO.A1_POO.Alumno;
import curso_java.A3_Utilidades.Utils;

public class A1_PruebaAlumnos {

	public List<Alumno> insertarAlumnos() {
		// Creamos la lista y la rellenamos con dos objetos de tipo alumno previamente
		// creados y otros dos que creamos en el momento de rellenar
		// su hueco

		Alumno jose = new Alumno("Jose", "Jimenez", "1111");
		Alumno dimitri = new Alumno("Dimitri", "Lauren", "2222");
		Alumno paco = new Alumno("paco", "Martinez", "3333");
		Alumno miguel = new Alumno("Miguel", "Hernandez", "4444");

		List<Alumno> alumnos = new CopyOnWriteArrayList<Alumno>(); // utilizamos CopyAnWriteArrayList para poder recorrer la lista 
																	// y borrar a la vez que la estamos recorriendo. si utilizáramos
																	// la clase ArrayList nos daría fallo por que al leer bloquea posiciones
		boolean insertados = false;
		do {
			String capturaString = "";
			if (alumnos.isEmpty()) {
				alumnos.add(jose);
				alumnos.add(dimitri);
				alumnos.add(paco);
				alumnos.add(miguel);
				insertados = true;
			} else {
				capturaString = Utils.scanString("La lista tiene contenido, ¿desea borrarla?");
				if (capturaString.equalsIgnoreCase("si")) {
					alumnos.clear();
				} else if (capturaString.equalsIgnoreCase("no")) {
					System.out.println("De acuerdo, hasa luego.");
					break;
				} else {
					System.out.println("Respuesta incorrecta, por favor conteste SI o NO");
				}
			}

		} while (insertados == false);

		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}

		return alumnos;
	}

	public void borrarAlumno(List<Alumno> alumnos) {
		String dni = Utils.scanString("Introduzca el DNI del alumno que desea borrar");

		for (Alumno alumno : alumnos) {
			if (dni.equalsIgnoreCase(alumno.getDni())) {
				alumnos.remove(alumno);
			}
		}
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}

	}

	public void modificarNombre(List<Alumno> alumnos) {
		String dni = Utils.scanString("Introduzca el DNI del alumno que desea modificar");

		for (Alumno alumno : alumnos) {
			if (dni.equalsIgnoreCase(alumno.getDni())) {
				alumno.setNombre("Vladimir");
			}
		}
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}

	}

	// ========================================================================================================================================
	public static void main(String[] args) {
		A1_PruebaAlumnos arrancador = new A1_PruebaAlumnos();
		List<Alumno> listadoAlumnos = arrancador.insertarAlumnos();
		arrancador.borrarAlumno(listadoAlumnos);
		arrancador.modificarNombre(listadoAlumnos);

	}

}
