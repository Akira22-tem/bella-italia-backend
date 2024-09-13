package ec.edu.espe.modelo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un usuario del sistema.
 */
@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String ciudad;
	private String direccion;
	private String cedula;
	private String password;

	@ManyToOne
	@JoinColumn(name = "id_rol")
	// @JsonBackReference: Evita bucle infinito
	@JsonBackReference(value = "rol-usuario")
	private Rol rol;

	@OneToMany(mappedBy = "usuario")
	@JsonBackReference(value = "usuario-reserva")
	private List<Reservas> reservas;

	@OneToMany(mappedBy = "usuario")
	@JsonBackReference(value = "usuario-pedido")
	private List<Pedidos> pedidos;

	/**
	 * Constructor completo de la clase Usuario.
	 * 
	 * @param id        Identificador del usuario.
	 * @param nombre    Nombre del usuario.
	 * @param apellido  Apellido del usuario.
	 * @param telefono  Teléfono del usuario.
	 * @param correo    Correo electrónico del usuario.
	 * @param ciudad    Ciudad de residencia del usuario.
	 * @param direccion Dirección del usuario.
	 * @param cedula    Número de cédula del usuario.
	 * @param password  Contraseña del usuario.
	 * @param rol       Rol del usuario en el sistema.
	 * @param reservas  Lista de reservas realizadas por el usuario.
	 * @param pedidos   Lista de pedidos realizados por el usuario.
	 */
	public Usuario(long id, String nombre, String apellido, String telefono, String correo, String ciudad,
			String direccion, String cedula, String password, Rol rol, List<Reservas> reservas, List<Pedidos> pedidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.cedula = cedula;
		this.password = password;
		this.rol = rol;
		this.reservas = reservas;
		this.pedidos = pedidos;
	}

	/**
	 * Constructor completo de la clase Usuario.
	 * 
	 * @param id        Identificador del usuario.
	 * @param nombre    Nombre del usuario.
	 * @param apellido  Apellido del usuario.
	 * @param telefono  Teléfono del usuario.
	 * @param correo    Correo electrónico del usuario.
	 * @param ciudad    Ciudad de residencia del usuario.
	 * @param direccion Dirección del usuario.
	 * @param cedula    Número de cédula del usuario.
	 * @param password  Contraseña del usuario.
	 * @param rol       Rol del usuario en el sistema.
	 * @param reservas  Lista de reservas realizadas por el usuario.
	 * @param pedidos   Lista de pedidos realizados por el usuario.
	 */
	public Usuario(long id, String nombre, String apellido, String telefono, String correo, String ciudad,
			String direccion, String cedula, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.cedula = cedula;
		this.password = password;
	}

	/**
	 * Constructor vacío de la clase Usuario.
	 */
	public Usuario() {
		super();
	}

	/**
	 * Método getter para el atributo id.
	 * 
	 * @return El identificador del usuario.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Método setter para el atributo id.
	 * 
	 * @param id El identificador del usuario a establecer.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Método getter para el atributo nombre.
	 * 
	 * @return El nombre del usuario.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter para el atributo nombre.
	 * 
	 * @param nombre El nombre del usuario a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter para el atributo apellido.
	 * 
	 * @return El apellido del usuario.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Método setter para el atributo apellido.
	 * 
	 * @param apellido El apellido del usuario a establecer.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Método getter para el atributo telefono.
	 * 
	 * @return El teléfono del usuario.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método setter para el atributo telefono.
	 * 
	 * @param telefono El teléfono del usuario a establecer.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Método getter para el atributo correo.
	 * 
	 * @return El correo electrónico del usuario.
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Método setter para el atributo correo.
	 * 
	 * @param correo El correo electrónico del usuario a establecer.
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Método getter para el atributo ciudad.
	 * 
	 * @return La ciudad de residencia del usuario.
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Método setter para el atributo ciudad.
	 * 
	 * @param ciudad La ciudad de residencia del usuario a establecer.
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Método getter para el atributo direccion.
	 * 
	 * @return La dirección del usuario.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método setter para el atributo direccion.
	 * 
	 * @param direccion La dirección del usuario a establecer.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método getter para el atributo cedula.
	 * 
	 * @return El número de cédula del usuario.
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Método setter para el atributo cedula.
	 * 
	 * @param cedula El número de cédula del usuario a establecer.
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * Método getter para el atributo password.
	 * 
	 * @return La contraseña del usuario.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Método setter para el atributo password.
	 * 
	 * @param password La contraseña del usuario a establecer.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Método getter para el atributo rol.
	 * 
	 * @return El rol del usuario.
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * Método setter para el atributo rol.
	 * 
	 * @param rol El rol del usuario a establecer.
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	/**
	 * Método getter para el atributo reservas.
	 * 
	 * @return La lista de reservas del usuario.
	 */
	public List<Reservas> getReservas() {
		return reservas;
	}

	/**
	 * Método setter para el atributo reservas.
	 * 
	 * @param reservas La lista de reservas del usuario a establecer.
	 */
	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	/**
	 * Método getter para el atributo pedidos.
	 * 
	 * @return La lista de pedidos del usuario.
	 */
	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	/**
	 * Método setter para el atributo pedidos.
	 * 
	 * @param pedidos La lista de pedidos del usuario a establecer.
	 */
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

}