package ec.edu.espe.modelo;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "transacciones")
@NoArgsConstructor
@AllArgsConstructor

public class Transacciones {

	@ Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name="Tipo")
	private String tipo;// ingreso gasto
	private double monto;
	private String descripcion;
	
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	/**
	 * @param id
	 * @param tipo
	 * @param monto
	 * @param descripcion
	 * @param fechaCreacion
	 */
	public Transacciones(long id, String tipo, double monto, String descripcion, Date fechaCreacion) {
		this.id = id;
		this.tipo = tipo;
		this.monto = monto;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * 
	 */
	public Transacciones() {
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
