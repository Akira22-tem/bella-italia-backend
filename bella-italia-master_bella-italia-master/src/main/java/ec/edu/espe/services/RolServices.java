package ec.edu.espe.services;

import java.util.List;
import ec.edu.espe.modelo.Rol;

/**
 * Interfaz para definir los servicios relacionados con los roles.
 * Proporciona métodos para las operaciones CRUD y búsqueda de roles.
 */
public interface RolServices {

    /**
     * Recupera una lista de todos los roles.
     * 
     * @return una lista de roles.
     */
    List<Rol> listAll();

    /**
     * Busca roles que coincidan con el texto dado.
     * 
     * @param texto el texto para buscar.
     * @return una lista de roles que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al buscar roles.
     */
    List<Rol> searchByText(String texto) throws Exception;
    
    /**
     * Recupera un rol por su ID.
     * 
     * @param id el ID del rol a recuperar.
     * @return el rol con el ID dado.
     * @throws Exception si ocurre un error al recuperar el rol.
     */
    Rol getRolById(Long id) throws Exception;
    
    /**
     * Guarda un nuevo rol en el sistema.
     * 
     * @param rol el rol a guardar.
     * @return el rol guardado.
     * @throws Exception si ocurre un error al guardar el rol.
     */
    Rol saveRol(Rol rol) throws Exception;

    /**
     * Actualiza un rol existente.
     * 
     * @param rol el rol a actualizar.
     * @return el rol actualizado.
     * @throws Exception si ocurre un error al actualizar el rol.
     */
    Rol updateRol(Rol rol) throws Exception;

    /**
     * Elimina un rol por su ID.
     * 
     * @param id el ID del rol a eliminar.
     * @return true si el rol fue eliminado con éxito, false en caso contrario.
     * @throws Exception si ocurre un error al eliminar el rol.
     */
    boolean deleteRol(Long id) throws Exception;
}
