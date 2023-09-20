package curso_java.ejercicios.A6_POO.A1_POO;

public class Alumno {

//Atributos
	String nombre;
	String apellidos;
	String dni;
	int nota;

//Constructores

	// Vacío
	public Alumno() {
	}

	// para inicializar con nombre, apellidos y dni
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	// para inicializar con nombre, apellidos, dni y nota
	public Alumno(String nombre, String apellidos, String dni, int nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota = nota;
	}
	
	//Para no hacer tanto codigo igual, podemos sobrecargar los constructores
	//igual que los métodos.

//Métodos
	public void estudiar() {
		System.out.println("El alumno " + nombre);
		if (nota >= 5) {
			switch (nota) {
			case 5:

			case 6:

			case 7:

			case 8:

			case 9:
				System.out.println("ha estudiado mucho");
				break;
			case 10:
				System.out.println("es un crack");
				break;

			}
		} else if (nota == 0) {
			System.out.println("no ha estudiado nada");
		} else {
			System.out.println("ha estudiado poco");
		}
	}

}
