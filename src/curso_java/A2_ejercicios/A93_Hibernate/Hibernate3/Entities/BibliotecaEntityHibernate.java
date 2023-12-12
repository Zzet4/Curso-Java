package curso_java.A2_ejercicios.A93_Hibernate.Hibernate3.Entities;

import curso_java.A2_ejercicios.A93_Hibernate.relations.unounounidireccional.entities.Direccion;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


// @TRANSIENT SE UTILIZA PARA QUE HIBERNATE NO COJA EL ATRIBUTO COMO COLUMNA DE LA TABLA

@Entity
@Table(name = "TB_BIBLIOTECAS_H")
public class BibliotecaEntityHibernate {

	// ATRIBUTOS
	@Id
	@SequenceGenerator(name = "BIBLIOTECAGEN", sequenceName = "BIBLIOTECA_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BIBLIOTECAGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private int id;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	
	//@JoinColumn(name= "FK_DIR", foreignKey = @ForeignKey (name = "FK_DIRECCIONES"))
	private String nombre;

	private Direccion direccion;

	// MÉTODO CONSTRUCTOR
	public BibliotecaEntityHibernate(int id, String nombre, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// METODO CONSTRUCTOR VACÍO
	public BibliotecaEntityHibernate() {
		super();
	}

	
	// MÉTODO TO_STRING
	@Override
	public String toString() {
		return "BibliotecaEntityHibernate [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	

	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
