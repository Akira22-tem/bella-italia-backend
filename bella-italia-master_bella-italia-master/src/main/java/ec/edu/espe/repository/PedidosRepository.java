package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Pedidos;

/**
 * Interfaz de repositorio para la entidad Pedidos.
 * Extiende JpaRepository para operaciones CRUD básicas.
 */
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

    /**
     * Busca pedidos cuyo estado contenga el texto especificado.
     * 
     * @param texto el texto a buscar dentro del estado de los pedidos.
     * @return una lista de pedidos cuyo estado contiene el texto especificado.
     */
    List<Pedidos> findByEstadoContaining(String texto);
}