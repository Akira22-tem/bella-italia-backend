
package ec.edu.espe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle")
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int cantidad;

	@ManyToOne
	@JoinColumn(name = "id_productos")
	private Productos productos;

	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedidos pedido;

	/**
	 * @param id_detalle
	 * @param cantidad
	 * @param productos
	 * @param pedido
	 */
	public DetallePedidos(long id, int cantidad, Productos productos, Pedidos pedido) {
		this.id = id;
		this.cantidad = cantidad;
		this.productos = productos;
		this.pedido = pedido;
	}

	public DetallePedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id_detalle
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id_detalle the id_detalle to set
	 */
	public void setId(long id) {
		this.id = id;
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

	/**
	 * @return the pedido
	 */
	public Pedidos getPedido() {
		return pedido;
	}

	/**
	 * @param pedido the pedido to set
	 */
	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}

}
