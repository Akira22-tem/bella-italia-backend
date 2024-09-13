package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Mesas;

/**
 * Interfaz para definir los servicios relacionados con las mesas.
 * Proporciona métodos para listar, buscar, obtener, guardar, actualizar y eliminar mesas.
 */
public interface MesasServices {

    /**
     * Recupera una lista de todas las mesas.
     * 
     * @return una lista de todas las mesas registradas.
     */
    List<Mesas> listAll();

    /**
     * Busca mesas que contengan el texto dado en su estado.
     * 
     * @param texto el texto para buscar en el estado de las mesas.
     * @return una lista de mesas que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al realizar la búsqueda.
     */
    List<Mesas> searchByText(String texto) throws Exception;

    /**
     * Recupera una mesa por su ID.
     * 
     * @param id el ID de la mesa a recuperar.
     * @return la mesa con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar la mesa.
     */
    Mesas getMesasById(Long id) throws Exception;

    /**
     * Guarda una nueva mesa en el sistema.
     * 
     * @param mesas la mesa a guardar.
     * @return la mesa guardada.
     * @throws Exception si ocurre un error al guardar la mesa.
     */
    Mesas saveMesas(Mesas mesas) throws Exception;

    /**
     * Actualiza una mesa existente en el sistema.
     * 
     * @param mesas la mesa a actualizar.
     * @return la mesa actualizada.
     * @throws Exception si ocurre un error al actualizar la mesa.
     */
    Mesas updateMesas(Mesas mesas) throws Exception;

    /**
     * Elimina una mesa por su ID.
     * 
     * @param id el ID de la mesa a eliminar.
     * @return true si la mesa fue eliminada con éxito, false si no se encontró.
     * @throws Exception si ocurre un error al eliminar la mesa.
     */
    boolean deleteMesas(Long id) throws Exception;
}