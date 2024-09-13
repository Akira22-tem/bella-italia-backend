package ec.edu.espe.modelo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "provedores")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Proveedores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column
	private String nombre;
	
	@Column
    private String telefono;
	
	@Column
    private String Direccion;
	
	@Column
	private String producto;
	
	@Column
    private String estado; //activo,inactivo, bajo revision
    
	@Column
	private float precioCompra;
	
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;

	@JsonBackReference(value = "provedores-inventario")
	@OneToMany(mappedBy = "provedores")
	private List<Inventario> inventario;

	/**
	 * @param id
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @param producto
	 * @param estado
	 * @param precioCompra
	 * @param fechaIngreso
	 * @param inventario
	 */
	public Proveedores(long id, String nombre, String telefono, String direccion, String producto, String estado,
			float precioCompra, Date fechaIngreso, List<Inventario> inventario) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		Direccion = direccion;
		this.producto = producto;
		this.estado = estado;
		this.precioCompra = precioCompra;
		this.fechaIngreso = fechaIngreso;
		this.inventario = inventario;
	}

	/**
	 * 
	 */
	public Proveedores() {
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return Direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the precioCompra
	 */
	public float getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
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
	 * @return the inventario
	 */
	public List<Inventario> getInventario() {
		return inventario;
	}

	/**
	 * @param inventario the inventario to set
	 */
	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
}
	
	
	
