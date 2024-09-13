package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Reservas;


/**
 * Interfaz para definir los servicios relacionados con las reservas.
 * Proporciona métodos para buscar, obtener, listar, guardar, actualizar y eliminar reservas.
 */
public interface ReservasServices {

    /**
     * Recupera una lista de todas las reservas.
     * 
     * @return una lista de todas las reservas registradas.
     */
    List<Reservas> listAll();
    
    /**
     * Busca reservas que contengan el texto dado.
     * 
     * @param text el texto para buscar en las reservas.
     * @return una lista de reservas que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al realizar la búsqueda.
     */
    List<Reservas> searchByText(String texto) throws Exception;

    /**
     * Recupera una reserva por su ID.
     * 
     * @param id el ID de la reserva a recuperar.
     * @return la reserva con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar la reserva.
     */
    Reservas getByReservasId(Long id) throws Exception;

    /**
     * Guarda una nueva reserva en el sistema.
     * 
     * @param reservas la reserva a guardar.
     * @return la reserva guardada.
     * @throws Exception si ocurre un error al guardar la reserva.
     */
    Reservas saveReservas(Reservas reservas) throws Exception;

    /**
     * Actualiza una reserva existente en el sistema.
     * 
     * @param reservas la reserva a actualizar.
     * @return la reserva actualizada.
     * @throws Exception si ocurre un error al actualizar la reserva.
     */
    Reservas updateReservas(Reservas reservas) throws Exception;

    /**
     * Elimina una reserva por su ID.
     * 
     * @param id el ID de la reserva a eliminar.
     * @return true si la reserva fue eliminada con éxito, false si no se encontró.
     * @throws Exception si ocurre un error al eliminar la reserva.
     */
    boolean deleteReservas(Long id) throws Exception;
}
