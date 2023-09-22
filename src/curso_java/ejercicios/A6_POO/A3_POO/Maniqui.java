package curso_java.ejercicios.A6_POO.A3_POO;

import curso_java.utilidades.Utils;

public class Maniqui {

//Atributos
	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

//Constructores
	public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(int id) {
		this.id = id;
	}

//Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

//Metodos

// Desvestir maniquí
	public void desvestir() {
		this.camisa = null;
		this.vestido = null;
		this.pantalon = null;
	}

	
// Vestir maniquí
	
	//Vestir con pantalon y camisa
	public void vestir(Pantalon pantalon, Camisa camisa) {
			desvestir();
			this.camisa = camisa;
			this.pantalon = pantalon;
			
			System.out.println("\nEl maniquí queda vestido con las siguientes prendas:\n");
			System.out.print("\nCamisa: ");
			System.out.print("\n\tColor: " + camisa.getColor());
			System.out.print("\n\tTalla: " + camisa.getTalla());
			System.out.print("\n\tPrecio: " + camisa.getPrecio() + "€");
			
			System.out.print("\nPantalon: ");
			System.out.print("\n\tColor: " + pantalon.getColor());
			System.out.print("\n\tTalla: " + pantalon.getTalla());
			System.out.print("\n\tPrecio: " + pantalon.getPrecio() + "€");
	
	   }
	
	//Vestir con vestido
	public void vestir(Vestido vestido) {
		desvestir();
			this.vestido = vestido;
	
			System.out.println("\nEl maniquí queda vestido con las siguientes prendas:\n");
			System.out.print("\nVestido: ");
			System.out.print("\n\tColor: " + vestido.getColor());
			System.out.print("\n\tTalla: " + vestido.getTalla());
			System.out.print("\n\tPrecio: " + vestido.getPrecio() + "€");
		
	
	
  }
	
}

