package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Rol;

/**
 * Interfaz de repositorio para la entidad Rol.
 * Extiende JpaRepository para operaciones CRUD básicas.
 */
public interface RolRepository extends JpaRepository<Rol, Long> {

    /**
     * Método para buscar roles por parte del nombre del rol.
     * 
     * @param texto el texto a buscar dentro del nombre del rol.
     * @return una lista de roles que contienen el texto especificado en su nombre.
     */
    List<Rol> findByRolContaining(String texto);
}