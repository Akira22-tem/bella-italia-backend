package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.espe.modelo.Rol;
import ec.edu.espe.repository.RolRepository;
import ec.edu.espe.services.RolServices;

/**
 * Implementación de la interfaz RolServices.
 * Proporciona la lógica de negocio para las operaciones CRUD y búsqueda de Roles.
 */
@Service
public class RolServicesImpl implements RolServices {
    
    @Autowired
    private RolRepository rolRepository;
    
    /**
     * Recupera una lista de todos los Roles.
     * 
     * @return una lista de Roles.
     */
    @Override
    public List<Rol> listAll() {
        return rolRepository.findAll();
    }
    
    /**
     * Busca Roles que coincidan con el texto dado.
     * 
     * @param texto el texto para buscar.
     * @return una lista de Roles que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al buscar Roles.
     */
    @Override
    public List<Rol> searchByText(String texto) throws Exception {
        List<Rol> roles = rolRepository.findByRolContaining(texto);
        return roles;
    }
    
    /**
     * Recupera un Rol por su ID.
     * 
     * @param id el ID del Rol a recuperar.
     * @return el Rol con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar el Rol.
     */
    @Override
    public Rol getRolById(Long id) throws Exception {
        Optional<Rol> rol = rolRepository.findById(id);
        return rol.orElse(null);
    }

    /**
     * Guarda un Rol en el repositorio.
     * 
     * @param rol el Rol a guardar.
     * @return el Rol guardado.
     * @throws Exception si ocurre un error al guardar el Rol.
     */
    @Override
    public Rol saveRol(Rol rol) throws Exception {
        return rolRepository.save(rol);
    }

    /**
     * Actualiza un Rol existente.
     * 
     * @param rol el Rol a actualizar.
     * @return el Rol actualizado.
     * @throws Exception si ocurre un error al actualizar el Rol.
     */
    @Override
    public Rol updateRol(Rol rol) throws Exception {
        return rolRepository.save(rol);
    }

    /**
     * Elimina un Rol por su ID.
     * 
     * @param id el ID del Rol a eliminar.
     * @return true si el Rol fue eliminado con éxito, false en caso contrario.
     */
    @Override
    public boolean deleteRol(Long id) {
        if (!rolRepository.existsById(id)) {
            return false;
        }
        rolRepository.deleteById(id);
        return true;
    }
}