package ec.edu.espe.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa una mesa en el sistema.
 */
@Entity
@Table(name = "mesas")
@NoArgsConstructor
@AllArgsConstructor
public class Mesas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "mesa")
	private int numero;
	private int capacidad;
	private String estado; // Estado de la mesa (ocupado, reservado, en limpieza)
	private String ubicacion; // Ubicación de la mesa (patio, salón, ventana)
	private String tipo; // Tipo de mesa (individual, familiar, VIP, etc.)

	/**
	 * Constructor vacío.
	 */
	public Mesas() {
	}

	/**
	 * Constructor con todos los atributos.
	 * 
	 * @param id         ID de la mesa.
	 * @param numero     Número de la mesa.
	 * @param capacidad  Capacidad de personas que puede alojar la mesa.
	 * @param estado     Estado actual de la mesa (ocupado, reservado, en limpieza).
	 * @param ubicacion  Ubicación física de la mesa (patio, salón, ventana).
	 * @param tipo       Tipo de mesa (individual, familiar, VIP, etc.).
	 */
	public Mesas(Long id, int numero, int capacidad, String estado, String ubicacion, String tipo) {
		this.id = id;
		this.numero = numero;
		this.capacidad = capacidad;
		this.estado = estado;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
	}

	/**
	 * Obtener el ID de la mesa.
	 * 
	 * @return ID de la mesa.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establecer el ID de la mesa.
	 * 
	 * @param id ID de la mesa a establecer.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtener el número de la mesa.
	 * 
	 * @return Número de la mesa.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Establecer el número de la mesa.
	 * 
	 * @param numero Número de la mesa a establecer.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Obtener la capacidad de la mesa.
	 * 
	 * @return Capacidad de la mesa.
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Establecer la capacidad de la mesa.
	 * 
	 * @param capacidad Capacidad de la mesa a establecer.
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Obtener el estado de la mesa.
	 * 
	 * @return Estado de la mesa.
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Establecer el estado de la mesa.
	 * 
	 * @param estado Estado de la mesa a establecer.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Obtener la ubicación de la mesa.
	 * 
	 * @return Ubicación de la mesa.
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Establecer la ubicación de la mesa.
	 * 
	 * @param ubicacion Ubicación de la mesa a establecer.
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Obtener el tipo de la mesa.
	 * 
	 * @return Tipo de la mesa.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establecer el tipo de la mesa.
	 * 
	 * @param tipo Tipo de la mesa a establecer.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}