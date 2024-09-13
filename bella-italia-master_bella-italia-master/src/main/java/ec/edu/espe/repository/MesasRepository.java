package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Mesas;

/**
 * Interfaz de repositorio para la entidad Mesas.
 * Extiende JpaRepository para operaciones CRUD básicas.
 */
public interface MesasRepository extends JpaRepository<Mesas, Long> {

    /**
     * Busca mesas cuyo estado contenga el texto especificado.
     * 
     * @param texto el texto a buscar dentro del estado de las mesas.
     * @return una lista de mesas cuyo estado contiene el texto especificado.
     */
    List<Mesas> findByEstadoContaining(String texto);
}