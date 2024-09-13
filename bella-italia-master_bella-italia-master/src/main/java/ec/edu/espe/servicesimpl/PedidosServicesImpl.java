package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Pedidos;
import ec.edu.espe.repository.PedidosRepository;
import ec.edu.espe.services.PedidosServices;

/**
 * Implementación de la interfaz PedidosServices.
 * Proporciona la lógica de negocio para las operaciones CRUD y búsqueda de Pedidos.
 */
@Service
public class PedidosServicesImpl implements PedidosServices {

    @Autowired
    private PedidosRepository pedidosRepository;

    /**
     * Recupera una lista de todos los Pedidos.
     * 
     * @return una lista de Pedidos.
     */
    @Override
    public List<Pedidos> listAll() {
        return pedidosRepository.findAll();
    }

    /**
     * Busca Pedidos que coincidan con el texto dado, basándose en el estado.
     * 
     * @param texto el texto para buscar.
     * @return una lista de Pedidos que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al buscar Pedidos.
     */
    @Override
    public List<Pedidos> searchByText(String texto) throws Exception {
        List<Pedidos> pedidos = pedidosRepository.findByEstadoContaining(texto);
        return pedidos;
    }

    /**
     * Recupera un Pedido por su ID.
     * 
     * @param id el ID del Pedido a recuperar.
     * @return el Pedido con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar el Pedido.
     */
    @Override
    public Pedidos getPedidosById(Long id) throws Exception {
        Optional<Pedidos> pedidos = pedidosRepository.findById(id);
        return pedidos.orElse(null);
    }

    /**
     * Guarda un Pedido en el repositorio.
     * 
     * @param pedidos el Pedido a guardar.
     * @return el Pedido guardado.
     * @throws Exception si ocurre un error al guardar el Pedido.
     */
    @Override
    public Pedidos savePedidos(Pedidos pedidos) throws Exception {
        return pedidosRepository.save(pedidos);
    }

    /**
     * Actualiza un Pedido existente.
     * 
     * @param pedidos el Pedido a actualizar.
     * @return el Pedido actualizado.
     * @throws Exception si ocurre un error al actualizar el Pedido.
     */
    @Override
    public Pedidos updatePedidos(Pedidos pedidos) throws Exception {
        return pedidosRepository.save(pedidos);
    }

    /**
     * Elimina un Pedido por su ID.
     * 
     * @param id el ID del Pedido a eliminar.
     * @return true si el Pedido fue eliminado con éxito, false en caso contrario.
     */
    @Override
    public boolean deletePedidos(Long id) {
        if (!pedidosRepository.existsById(id)) {
            return false;
        }
        pedidosRepository.deleteById(id);
        return true;
    }
}