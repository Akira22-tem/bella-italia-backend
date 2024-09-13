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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
	
	@Column (name = "cantidad")
	private int cantidad;

	@ManyToOne
	@JoinColumn(name = "id_provedores", nullable = false)
	private Proveedores provedores;

	@ManyToOne
	@JoinColumn(name = "id_productos", nullable = false)
	private Productos productos;

	/**
	 * @param id
	 * @param fechaIngreso
	 * @param cantidad
	 * @param provedores
	 * @param productos
	 */
	public Inventario(long id, Date fechaIngreso, int cantidad, Proveedores provedores, Productos productos) {
		this.id = id;
		this.fechaIngreso = fechaIngreso;
		this.cantidad = cantidad;
		this.provedores = provedores;
		this.productos = productos;
	}

	/**
	 * 
	 */
	public Inventario() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the provedores
	 */
	public Proveedores getProvedores() {
		return provedores;
	}

	/**
	 * @param provedores the provedores to set
	 */
	public void setProvedores(Proveedores provedores) {
		this.provedores = provedores;
	}

	/**
	 * @return the productos
	 */
	public Productos getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	
}
