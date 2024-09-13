package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Reservas;
import ec.edu.espe.modelo.Usuario;

/**
 * Interfaz de repositorio para la entidad Reservas.
 * Extiende JpaRepository para operaciones CRUD básicas.
 */
public interface ReservasRepository extends JpaRepository<Reservas, Long> {

    /**
     * Busca reservas cuyo usuario tenga un nombre que contenga el texto especificado, ignorando mayúsculas y minúsculas.
     * 
     * @param nombre el texto a buscar dentro del nombre del usuario asociado a las reservas.
     * @return una lista de reservas cuyo usuario tenga un nombre que contiene el texto especificado.
     */
    List<Reservas> findByUsuarioNombreContainingIgnoreCase(String nombre);

    /**
     * Busca reservas asociadas a un usuario específico.
     * 
     * @param usuario el usuario para el cual se desea buscar las reservas.
     * @return una lista de reservas asociadas al usuario especificado.
     */
    List<Reservas> findByUsuario(Usuario usuario);
}
