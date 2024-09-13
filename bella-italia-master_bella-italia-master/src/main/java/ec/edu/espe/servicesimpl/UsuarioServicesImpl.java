package ec.edu.espe.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Usuario;
import ec.edu.espe.repository.UsuarioRepository;
import ec.edu.espe.services.UsuarioServices;

/**
 * Implementación de la interfaz UsuarioServices.
 * Proporciona la lógica de negocio para las operaciones CRUD y búsqueda de Usuarios.
 */
@Service
public class UsuarioServicesImpl implements UsuarioServices {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    /**
     * Recupera una lista de todos los Usuarios.
     * 
     * @return una lista de Usuarios.
     */
    @Override
    public List<Usuario> listAll() {
    	// TODO Auto-generated method stub
        return usuarioRepository.findAll();
    }
    
    /**
     * Busca Usuarios que coincidan con el texto dado.
     * 
     * @param texto el texto para buscar.
     * @return una lista de Usuarios que coincidan con el texto de búsqueda.
     */
    @Override
    public List<Usuario> searchByText(String texto) {
    	// TODO Auto-generated method stub
        return usuarioRepository.findByNombreContainingIgnoreCase(texto);
    }
    
    /**
     * Recupera un Usuario por su ID.
     * 
     * @param id el ID del Usuario a recuperar.
     * @return el Usuario con el ID dado, o null si no se encuentra.
     */
    @Override
    public Usuario getUsuarioById(Long id) {
    	// TODO Auto-generated method stub
        return usuarioRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un Usuario en el repositorio.
     * 
     * @param objUsuario el Usuario a guardar.
     * @return el Usuario guardado.
     * @throws Exception si ocurre un error al guardar el Usuario.
     */
    @Override
    public Usuario saveUsuario(Usuario objUsuario) throws Exception {
    	// TODO Auto-generated method stub
        return usuarioRepository.save(objUsuario);
    }
    
    /**
     * Actualiza un Usuario existente.
     * 
     * @param usuario el Usuario a actualizar.
     * @return el Usuario actualizado.
     */
    @Override
    public Usuario updateUsuario(Usuario usuario) {
    	// TODO Auto-generated method stub
        return usuarioRepository.save(usuario);
    }

    /**
     * Elimina un Usuario por su ID.
     * 
     * @param id el ID del Usuario a eliminar.
     * @return true si el Usuario fue eliminado con éxito, false en caso contrario.
     */
    @Override
    public boolean deleteUsuarios(Long id) {
        if (!usuarioRepository.existsById(id)) {
            return false;
        }
        usuarioRepository.deleteById(id);
        return true;
    }
}