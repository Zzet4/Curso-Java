package curso_java.ejercicios.A6_POO.A3_POO;

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
	
	public void desvestir(Maniqui maniqui) {
		this.camisa = null;
		this.vestido = null;
		this.pantalon = null;
	}
	

}
