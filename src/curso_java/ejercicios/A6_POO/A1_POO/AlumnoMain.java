package curso_java.ejercicios.A6_POO.A1_POO;

import curso_java.utilidades.Utils;

public class AlumnoMain {
	public static void main (String [] args) {
		
		
		
//CREAMOS LOS OBJETOS
		
		//Creamos un objeto con variable a1 desde el constructor vacío
		Alumno a1 = new Alumno();
			a1.nombre = "fulanito";
			a1.apellidos = "de tal";
			a1.dni = "0000A";
			a1.nota = 10;
			
			
			
		//Creamos un objeto con variable a1 desde el constructor
		//de nombre, apellido, dni
		Alumno a2 = new Alumno("Paco", "Sanchez", "1111B");
		
		
		
		//Creamos un objeto con variable a1 desde el constructor 
		//de nombre, apellido, dni y nota
		Alumno a3 = new Alumno("Jose", "Lopez", "2222C", 6);
		
		
//LLAMAMOS A L METODO PARA CADA OBJETO		
		
		//llamamos al metodo estudiar para cada objeto
		a1.estudiar();
		a2.estudiar();
		a3.estudiar();
		
		
	
//GUARDAMOS TODOS LOS ALMUNOS EN UN ARRAY Y MOSTRAMOS LOS APROBADOS.
		
		//creamos un array y metemos a los almunos
		
		int numAlumnos = Utils.scanInt("¿Cuantos alumnos hay ?");
		Alumno [] alumnos = {a1,a2,a3};
		
		
		//Sacamos solo los aprobados.
		System.out.println("Los alumnos aprobados son: ");
		for ( int i=0 ; i<numAlumnos  ; i++ ) {
				if (alumnos[i].nota>=5) {
						System.out.println(alumnos[i].nombre);	
				}	
			}
			
		}
		
		
	}
	
	
	
	


