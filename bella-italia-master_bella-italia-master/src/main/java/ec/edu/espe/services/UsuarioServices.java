package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Usuario;

/**
 * Interfaz que define los servicios disponibles para la gestión de usuarios.
 */
public interface UsuarioServices {
    
    /**
     * Obtiene una lista de todos los usuarios.
     * @return Lista de todos los usuarios registrados.
     */
    List<Usuario> listAll();
    
    /**
     * Busca usuarios cuyo nombre, apellido, correo, o ciudad contengan el texto especificado.
     * @param texto Texto a buscar dentro de los campos nombre, apellido, correo o ciudad del usuario.
     * @return Lista de usuarios que coinciden con el criterio de búsqueda.
     * @throws Exception Si ocurre algún error durante la búsqueda.
     */
    List<Usuario> searchByText(String texto) throws Exception;
    
    /**
     * Obtiene un usuario según su identificador.
     * @param id Identificador del usuario a buscar.
     * @return El usuario encontrado.
     * @throws Exception Si no se encuentra un usuario con el identificador especificado.
     */
    Usuario getUsuarioById(Long id)throws Exception;
    
    /**
     * Guarda un nuevo usuario en el sistema.
     * @param objUsuario Usuario a guardar.
     * @return El usuario guardado.
     * @throws Exception Si ocurre algún error durante la operación.
     */
    Usuario saveUsuario(Usuario objUsuario) throws Exception;
    
    /**
     * Actualiza la información de un usuario existente.
     * @param usuario Usuario con la información actualizada.
     * @return El usuario actualizado.
     * @throws Exception Si ocurre algún error durante la operación.
     */
    Usuario updateUsuario(Usuario usuario)throws Exception;

    /**
     * Elimina un usuario según su identificador.
     * @param id Identificador del usuario a eliminar.
     * @return true si se eliminó correctamente, false si no se encontró el usuario.
     * @throws Exception Si ocurre algún error durante la operación.
     */
    boolean deleteUsuarios(Long id)throws Exception;
}
