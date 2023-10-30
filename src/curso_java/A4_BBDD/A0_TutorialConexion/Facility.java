package curso_java.A4_BBDD.A0_TutorialConexion;

public class Facility { //Creamos esta clase que se corresponde con la tabla de edificios creada en la base de datos bbdd_prueba2
						//Se pueden ver las sentencias SQL de la creación de la tabla en el fichero Ejercicio_Tabla_Edificios del paquete
						//A5_SQL.
	private long id;
	private long guid;
	private String name;
	private String description;
	private String category;
	private String address;
	private double heigth;
	
	
	
	public Facility() {
		super();
	}

	public Facility(long id, long guid, String name, String description, 
			String category, String address, double heigth) {
		super();
		this.id = id;
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.category = category;
		this.address = address;
		this.heigth = heigth;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the guid
	 */
	public long getGuid() {
		return guid;
	}

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(long guid) {
		this.guid = guid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the heigth
	 */
	public double getHeigth() {
		return heigth;
	}

	/**
	 * @param heigth the heigth to set
	 */
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", guid=" + guid + ", " + (name != null ? "name=" + name + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ (address != null ? "address=" + address + ", " : "") + "heigth=" + heigth + "]";
	}

	

	


}
