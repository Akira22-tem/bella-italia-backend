package ec.edu.espe.modelo;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
 * Entidad que representa un rol de usuario en el sistema.
 */
@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Rol")
    private String rol;
    
    private String descripcion;
    private String estado; // activo o inactivo

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    @OneToMany(mappedBy = "rol")
    @JsonManagedReference(value = "rol-usuario")
    private List<Usuario> usuarios;

    /**
     * Constructor vacío.
     */
    public Rol() {
    }

	
	/**
     * Constructor con todos los atributos.
     * 
     * @param id                 ID del rol.
     * @param rol                Nombre del rol.
     * @param descripcion        Descripción del rol.
     * @param estado             Estado del rol (activo o inactivo).
     * @param fechaCreacion      Fecha de creación del rol.
     * @param fechaActualizacion Fecha de última actualización del rol.
     * @param usuarios           Lista de usuarios asociados a este rol.
     */
    public Rol(Long id, String rol, String descripcion, String estado, Date fechaCreacion, Date fechaActualizacion,
            List<Usuario> usuarios) {
        this.id = id;
        this.rol = rol;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarios = usuarios;
    }
	
	
    /**
     * Constructor sin atributo usuarios, puede existir un rol sin un usuario.
     * 
     * @param id                 ID del rol.
     * @param rol                Nombre del rol.
     * @param descripcion        Descripción del rol.
     * @param estado             Estado del rol (activo o inactivo).
     * @param fechaCreacion      Fecha de creación del rol.
     * @param fechaActualizacion Fecha de última actualización del rol.
     * @param usuarios           Lista de usuarios asociados a este rol.
     */
    public Rol(Long id, String rol, String descripcion, String estado, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
        this.rol = rol;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }


    /**
     * Obtener la lista de usuarios asociados a este rol.
     * 
     * @return Lista de usuarios asociados.
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Establecer la lista de usuarios asociados a este rol.
     * 
     * @param usuarios Lista de usuarios a establecer.
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Obtener el ID del rol.
     * 
     * @return ID del rol.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establecer el ID del rol.
     * 
     * @param id ID del rol a establecer.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtener el nombre del rol.
     * 
     * @return Nombre del rol.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establecer el nombre del rol.
     * 
     * @param rol Nombre del rol a establecer.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtener la descripción del rol.
     * 
     * @return Descripción del rol.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establecer la descripción del rol.
     * 
     * @param descripcion Descripción del rol a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtener el estado del rol.
     * 
     * @return Estado del rol (activo o inactivo).
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establecer el estado del rol.
     * 
     * @param estado Estado del rol a establecer (activo o inactivo).
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtener la fecha de creación del rol.
     * 
     * @return Fecha de creación del rol.
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establecer la fecha de creación del rol.
     * 
     * @param fechaCreacion Fecha de creación del rol a establecer.
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Obtener la fecha de última actualización del rol.
     * 
     * @return Fecha de última actualización del rol.
     */
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Establecer la fecha de última actualización del rol.
     * 
     * @param fechaActualizacion Fecha de última actualización del rol a establecer.
     */
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

}