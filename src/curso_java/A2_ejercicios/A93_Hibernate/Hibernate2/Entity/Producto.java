package curso_java.A2_ejercicios.A93_Hibernate.Hibernate2.Entity;

import java.util.Date;

import curso_java.A3_Utilidades.UtilsFechas.UtilsFecha;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_PRODUCTOS")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //IDENTIFICADOR DE SECUENCIA GENÉRICO SOLO PARA ORACLE, EN MYSQL ES EL AUTOINCREMENTAL
	private long idProducto;
	/*
	 * SI USAMOS EL IDENTIFICADOR DE SECUENCIA GENÉRICO, LA SECUENCIA AUMENTARÁ 1 CADA VEZ QUE INSERTEMOS
	 * UN REGISTRO EN CUALQUIERA DE LAS CLASES QUE TENGAN DECLARADO ESTE SECUENCIADOR GENÉRICO
	 * EN CASO DE COMPARTIR ESTE SECUENCIADOR TENDRÍAMOS EL PROBLEMA DE QE SI METES UNA FILA EN BIBLIOTECAS TAMBIEN AUMENTA LOS PRODUCTOS
	 * 
	 * PARA EVITARLO CREAMOS UN GENERADOR DE SECUENCIAS INDIVIDUAL PARA CADA ENTITY QUE SOLO LLEVE LA CUENTA DE 
	 * SU TABLA.
	 * 
	@SequenceGenerator(name="PRODUCTOGEN", sequenceName="PRODUCTO_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTOGEN")
	 *  
	 * */
	

	@Column(length=20)
	private String nombre;
	
	@Column(length=30)
	private String tipo;
	
	
	private Date fechaAlta;
	
	
	private int precio;
	
	
	private int unidades;
	

	public Producto(String nombre, String tipo, Date fechaAlta, int precio, int unidades) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaAlta = UtilsFecha.generaFecha();
		this.precio = precio;
		this.unidades = unidades;
	}

	
	//CONSTRUCTOR CON ID
	public Producto(long idProducto, String nombre, String tipo, Date fechaAlta, int precio, int unidades) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaAlta = fechaAlta;
		this.precio = precio;
		this.unidades = unidades;
	}



	public long getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", tipo=" + tipo + ", fechaAlta="
				+ fechaAlta + ", precio=" + precio + ", unidades=" + unidades + "]";
	}




	
	
	
	
	
	
	
}
