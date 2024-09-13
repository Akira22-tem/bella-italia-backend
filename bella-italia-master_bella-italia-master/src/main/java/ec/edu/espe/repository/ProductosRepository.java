package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Productos;

/**
 * Repositorio para la entidad Productos.
 * Proporciona métodos para realizar operaciones CRUD y búsquedas en la base de datos.
 */
public interface ProductosRepository extends JpaRepository<Productos, Long> {

    /**
     * Busca productos cuyo nombre contenga el texto especificado.
     * 
     * @param texto el texto para buscar en los nombres de los productos.
     * @return una lista de productos cuyos nombres contienen el texto especificado.
     */
    List<Productos> findByNombreContaining(String texto);

}
