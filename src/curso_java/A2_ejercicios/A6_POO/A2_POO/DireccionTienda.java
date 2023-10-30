package curso_java.A2_ejercicios.A6_POO.A2_POO;

public class DireccionTienda {
	
		private String nombreCalle;
		private int numero;
		private int codPostal;
		private String poblacion;
		private String provincia;
		
	
//Para crear los constructores hemos utilizado boton derecho -> source -> create constructor using fields -> seleccionamos los atributos que deseamos 
		//para crear el constructor en cuestión 
		public DireccionTienda(String nombreCalle, int numero, int codPostal) {
			super();
			this.nombreCalle = nombreCalle;
			this.numero = numero;
			this.codPostal = codPostal;
		}
	
		public DireccionTienda(String nombreCalle, int numero, int codPostal, String poblacion, String provincia) {
			super();
			this.nombreCalle = nombreCalle;
			this.numero = numero;
			this.codPostal = codPostal;
			this.poblacion = poblacion;
			this.provincia = provincia;
		}

		

		//Para crear los getter and setters hemos utilizado boton derecho -> source -> create getters and setters -> seleccionamos los atributos que deseamos 
				//para crear el los metodos get y set. 
		
		public String getNombreCalle() {
			return nombreCalle;
		}

		public void setNombreCalle(String nombreCalle) {
			this.nombreCalle = nombreCalle;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getCodPostal() {
			return codPostal;
		}

		public void setCodPostal(int codPostal) {
			this.codPostal = codPostal;
		}

		public String getPoblacion() {
			return poblacion;
		}

		public void setPoblacion(String poblacion) {
			this.poblacion = poblacion;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		
		
}

