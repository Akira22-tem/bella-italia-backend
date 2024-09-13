package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Pedidos;

/**
 * Interfaz para definir los servicios relacionados con los pedidos.
 * Proporciona métodos para listar, buscar, obtener, guardar, actualizar y eliminar pedidos.
 */
public interface PedidosServices {

    /**
     * Recupera una lista de todos los pedidos.
     * 
     * @return una lista de todos los pedidos registrados.
     */
    List<Pedidos> listAll();

    /**
     * Busca pedidos que contengan el texto dado en su estado.
     * 
     * @param texto el texto para buscar en el estado de los pedidos.
     * @return una lista de pedidos que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al realizar la búsqueda.
     */
    List<Pedidos> searchByText(String texto) throws Exception;

    /**
     * Recupera un pedido por su ID.
     * 
     * @param id el ID del pedido a recuperar.
     * @return el pedido con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar el pedido.
     */
    Pedidos getPedidosById(Long id) throws Exception;

    /**
     * Guarda un nuevo pedido en el sistema.
     * 
     * @param objPedidos el pedido a guardar.
     * @return el pedido guardado.
     * @throws Exception si ocurre un error al guardar el pedido.
     */
    Pedidos savePedidos(Pedidos pedidos) throws Exception;

    /**
     * Actualiza un pedido existente en el sistema.
     * 
     * @param pedidos el pedido a actualizar.
     * @return el pedido actualizado.
     * @throws Exception si ocurre un error al actualizar el pedido.
     */
    Pedidos updatePedidos(Pedidos pedidos) throws Exception;

    /**
     * Elimina un pedido por su ID.
     * 
     * @param id el ID del pedido a eliminar.
     * @return true si el pedido fue eliminado con éxito, false si no se encontró.
     * @throws Exception si ocurre un error al eliminar el pedido.
     */
    boolean deletePedidos(Long id) throws Exception;
}