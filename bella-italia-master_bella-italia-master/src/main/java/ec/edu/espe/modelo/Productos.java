package ec.edu.espe.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
/**
 * Entidad que representa un producto en el sistema.
 */
@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
public class Productos {
	
    /**
     * Identificador único del producto.
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    /**
     * Nombre del producto.
     */
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
    /**
     * Descripción del producto.
     */
	@Column(name = "descripcion")
	private String descripcion;
	
    /**
     * Precio del producto.
     */
	@Column(name = "precio", nullable = false)
	private float precio;
	
    /**
     * Cantidad disponible del producto.
     */
	@Column(name = "cantidad", nullable = false)
	private int cantidad;

    /**
     * Lista de inventarios asociados al producto.
     */
	@OneToMany(mappedBy = "productos")
    private List<Inventario> inventario;

    /**
     * Constructor con parámetros.
     * 
     * @param id_productos el identificador del producto
     * @param nombre el nombre del producto
     * @param descripcion la descripción del producto
     * @param precio el precio del producto
     * @param cantidad la cantidad disponible del producto
     * @param inventario la lista de inventarios asociados al producto
     */
    public Productos(long id, String nombre, String descripcion, float precio, int cantidad,
                     List<Inventario> inventario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.inventario = inventario;
    }

    /**
     * Constructor por defecto.
     */
    public Productos() {
        super();
    }

    /**
     * @return el id del producto
     */
    public long getId() {
        return id;
    }

    /**
     * @param id_productos el id del producto a establecer
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre del producto a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion la descripción del producto a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return el precio del producto
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio el precio del producto a establecer
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return la cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad la cantidad del producto a establecer
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return la lista de inventarios asociados al producto
     */
    public List<Inventario> getInventario() {
        return inventario;
    }

    /**
     * @param inventario la lista de inventarios asociados al producto a establecer
     */
    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }
}