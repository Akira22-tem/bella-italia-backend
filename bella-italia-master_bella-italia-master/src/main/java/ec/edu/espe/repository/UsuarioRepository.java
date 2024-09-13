package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Usuario;

/**
 * Interfaz de repositorio para la entidad Usuario.
 * Extiende JpaRepository para operaciones CRUD básicas.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    /**
     * Método para buscar usuarios por parte del nombre, ignorando mayúsculas y minúsculas.
     * @param texto Texto a buscar dentro del nombre de usuario.
     * @return Lista de usuarios que contienen el texto especificado en su nombre.
     */
    List<Usuario> findByNombreContainingIgnoreCase(String texto);
}
