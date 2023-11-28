package curso_java.A2_ejercicios.A93_Hibernate.A1_Hibernate1.Entities;

import java.time.LocalDate;
import java.util.Date;

import curso_java.A3_Utilidades.UtilsFechas.UtilsFecha;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_USUARIOS")
public class Usuario {
	
	@Id
	@Column(name="idUsuario")
	private long id;
	
	@Column(name="nombreUsuario", length=20)
	private String nombre;
	
	@Column(name="apellidosUsuario", length=40)
	private String apellidos;
	
	@Column(name="dniUsuario", length=10, unique = true)
	private String dni;
	
	
	private Date fechaAlta;
	
	
	//SI TRABAJAMOS CON HIBERNATE DEBE EXISTIR UN CONSTRUCTOR VACÍO OBLIGATORIAMENTE.
	public Usuario() {
	}
	
	//CONSTRUCTOR SIN FECHA DE ALTA
	public Usuario(long id, String nombre, String apellidos, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaAlta = UtilsFecha.generaFecha();
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Usuario(long id, String nombre, String apellidos, String dni, Date fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
	}


	public long getIdUsuario() {
		return id;
	}


	public void setIdUsuario(long idCliente) {
		this.id = idCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date  fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	@Override
	public String toString() {
		return "Usuario [idCliente=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
	
	
}
