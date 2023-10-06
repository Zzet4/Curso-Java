package curso_java.ejercicios.A6_POO.A5_Herencia.A2_Hospital;

public abstract class Persona {

		private int id;
		private String nombre;
		private int edad;
		
		
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}




		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}




		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}




		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		/**
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}




		/**
		 * @param edad the edad to set
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}



public Persona(int id, String nombre, int edad) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.edad = edad;
		}




//METODOS.

		public abstract void  comer();
	

}
