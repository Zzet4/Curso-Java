package curso_java.ejercicios.A6_POO.A1_POO;

import curso_java.utilidades.Utils;

public class AlumnoMain {
	public static void main (String [] args) {
		
//En esta clase alumnoMain camos a crear los objetos dentro del metodo main para poder invocar a sus métodos.
		
		
//CREAMOS LOS OBJETOS
		
		//Creamos un objeto con variable a1 desde el constructor vacío
		Alumno alumno1 = new Alumno();
		alumno1.nombre = "fulanito";
		alumno1.apellidos = "de tal";
		alumno1.setDni("0000A");
		alumno1.nota = 10;
		
	
			
			
		//Creamos un objeto con variable a1 desde el constructor
		Alumno alumno2 = new Alumno("Paco", "Sanchez", "1111B");
		
		//de nombre, apellido, dni. Como este objeto ha sido creado mediante un constructor que no contempla la nota
		//por defecto Paco tendrá un 0
		
		
		
		//Creamos un objeto con variable a1 desde el constructor 
		//de nombre, apellido, dni y nota
		Alumno alumno3 = new Alumno("Jose", "Lopez", "2222C", 6);
		
		
//LLAMAMOS A L METODO PARA CADA OBJETO		
		
		//llamamos al metodo estudiar para cada objeto
		alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();
		
		
	
//GUARDAMOS TODOS LOS ALMUNOS EN UN ARRAY Y MOSTRAMOS LOS APROBADOS.
		
		//creamos un array y metemos a los almunos.
		//OJO, si nos fijamos el tipo del array es Alumno ya que los objetos que va a contener son del "tipo" Alumno, (su clase).
		
		Alumno [] alumnos = {alumno1,alumno2,alumno3};
		
		
		//Sacamos solo los aprobados.
		System.out.println("Los alumnos aprobados son: ");
		for ( int i=0 ; i<alumnos.length  ; i++ ) {
				if (alumnos[i].nota>=5) {
						System.out.println(alumnos[i].nombre);	
				}	
			}
		
		//Si queremos llamar al método pintaAprobados creado un poco más abajo necesitaremos crear un objeto ya que dicho método no es estático.
		//el objeto que creamos debe pertenecer a la misma clase a la que pertenece el método ya que cada objeto tendrá las funciones de su clase
		//es por esto que vamos a llamar al objeto que pintara los aprobados, profesor
		
		AlumnoMain profesor = new AlumnoMain();//usamos el constructor por defecto
		profesor.pintaAprobados(alumnos);//Le decimos al objeto de esta clase que invoque al metodo (no static) de esta misma clase.
											//notese que el parametro que le pasamos al método es el array de alumnos que necesita.
		
			
	}
		
	//En este punto podríamos meter la funcionalidad de pintarAprobados en un método para facilitar el código a futuro.
	//Ojo, fuera del main
	public void pintaAprobados (Alumno [] alumnos) {
		System.out.println("Los alumnos aprobados son: ");
		for ( int i=0 ; i<alumnos.length  ; i++ ) {
				if (alumnos[i].nota>=5) {
						System.out.println(alumnos[i].nombre);	
				}	
			}
		}
}
	
	
	
	


