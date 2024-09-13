package ec.edu.espe.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa una reserva de mesa en el sistema.
 */
@Entity
@Table(name = "reservas")
@NoArgsConstructor
@AllArgsConstructor
public class Reservas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fecha_reserva")
	private Date fechaReserva;

	@Column(name = "fecha_expiracion")
	private Date fechaExpiracion;

	@Column(name = "cantidad_personas")
	private Integer cantidadPersonas;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "mesa_id")
	private Mesas mesas;

	/**
	 * Constructor con todos los atributos.
	 * 
	 * @param id               ID de la reserva.
	 * @param fechaReserva     Fecha de reserva de la mesa.
	 * @param fechaExpiracion  Fecha de expiración de la reserva.
	 * @param cantidadPersonas Cantidad de personas para la reserva.
	 * @param usuario          Usuario que realiza la reserva.
	 * @param mesas            Mesa reservada.
	 */
	public Reservas(Long id, Date fechaReserva, Date fechaExpiracion, Integer cantidadPersonas, Usuario usuario,
			Mesas mesas) {
		this.id = id;
		this.fechaReserva = fechaReserva;
		this.fechaExpiracion = fechaExpiracion;
		this.cantidadPersonas = cantidadPersonas;
		this.usuario = usuario;
		this.mesas = mesas;
	}

	/**
	 * Constructor vacío.
	 */
	public Reservas() {
	}

	/**
	 * Obtener el ID de la reserva.
	 * 
	 * @return ID de la reserva.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establecer el ID de la reserva.
	 * 
	 * @param id ID de la reserva a establecer.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtener la fecha de reserva de la mesa.
	 * 
	 * @return Fecha de reserva de la mesa.
	 */
	public Date getFechaReserva() {
		return fechaReserva;
	}

	/**
	 * Establecer la fecha de reserva de la mesa.
	 * 
	 * @param fechaReserva Fecha de reserva de la mesa a establecer.
	 */
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	/**
	 * Obtener la fecha de expiración de la reserva.
	 * 
	 * @return Fecha de expiración de la reserva.
	 */
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	/**
	 * Establecer la fecha de expiración de la reserva.
	 * 
	 * @param fechaExpiracion Fecha de expiración de la reserva a establecer.
	 */
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/**
	 * Obtener la cantidad de personas para la reserva.
	 * 
	 * @return Cantidad de personas para la reserva.
	 */
	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	/**
	 * Establecer la cantidad de personas para la reserva.
	 * 
	 * @param cantidadPersonas Cantidad de personas para la reserva a establecer.
	 */
	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	/**
	 * Obtener el usuario que realiza la reserva.
	 * 
	 * @return Usuario que realiza la reserva.
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Establecer el usuario que realiza la reserva.
	 * 
	 * @param usuario Usuario que realiza la reserva a establecer.
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Obtener la mesa reservada.
	 * 
	 * @return Mesa reservada.
	 */
	public Mesas getMesas() {
		return mesas;
	}

	/**
	 * Establecer la mesa reservada.
	 * 
	 * @param mesas Mesa reservada a establecer.
	 */
	public void setMesas(Mesas mesas) {
		this.mesas = mesas;
	}
}