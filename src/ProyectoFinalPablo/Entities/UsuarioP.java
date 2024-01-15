package ProyectoFinalPablo.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_USUARIOSP")
public class UsuarioP {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuarioP;
	
	@Column(length=30)
	private String nombre;
	
	@Column(length=40)
	private String apellidos;
	
	@Column(name="dniUsuario", length=9, unique = true)
	private String dni;
	
	@Column(length=1)
	private String sexo;
	
	private String contraseña;
	
	@Column(length=40)
	private String email;
	
	@Column(length=10)
	private int telefono;
	
	private Date fechaNacimiento;
	
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="TB_USUARIOS_ROLES")
    private List<RolP> roles = new ArrayList<RolP>();

		

	//CONSTRUCTORES
	public UsuarioP() {
		super();
	}

	public UsuarioP(String nombre, String apellidos, String dni, String sexo, int idUsuarioP, String contraseña,
			String email, int telefono, Date fechaNacimiento, RolP roles) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
		this.idUsuarioP = idUsuarioP;
		this.contraseña = contraseña;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.roles = List<RolP> roles;
		
	}

	public UsuarioP(String nombre, String apellidos, String dni, String sexo, String contraseña,
			String email, int telefono, Date fechaNacimiento, RolP roles) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
		this.contraseña = contraseña;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.roles = List<RolP> roles;
	}
	
	
	//GETTERS & SETTERS
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdUsuario() {
		return idUsuarioP;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuarioP = idUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public List<RolP> getRoles() {
		return roles;
	}

	public void setRoles(List<RolP> roles) {
		this.roles = roles;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "UsuarioP [idUsuarioP=" + idUsuarioP + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", sexo=" + sexo + ", contraseña=" + contraseña + ", email=" + email + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + ", roles=" + roles + "]";
	}
	




}
