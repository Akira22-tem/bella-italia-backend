package ec.edu.espe.servicesimpl;

import ec.edu.espe.modelo.Reservas;
import ec.edu.espe.modelo.Usuario;
import ec.edu.espe.repository.ReservasRepository;
import ec.edu.espe.repository.UsuarioRepository;
import ec.edu.espe.services.ReservasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementación de la interfaz ReservasServices.
 * Proporciona la lógica de negocio para las operaciones CRUD y búsqueda de Reservas.
 */
@Service
public class ReservasServicesImpl implements ReservasServices {

    @Autowired
    private ReservasRepository reservasRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Recupera una lista de todas las Reservas.
     * 
     * @return una lista de Reservas.
     */
    @Override
    public List<Reservas> listAll() {
        return reservasRepository.findAll();
    }

    /**
     * Busca Reservas que coincidan con el texto dado, basándose en el nombre de los usuarios.
     * 
     * @param texto el texto para buscar.
     * @return una lista de Reservas que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al buscar Reservas.
     */
    @Override
    public List<Reservas> searchByText(String texto) throws Exception {
        // Buscar usuarios cuyo nombre coincida con el texto proporcionado
        List<Usuario> usuarios = usuarioRepository.findByNombreContainingIgnoreCase(texto);

        List<Reservas> reservasEncontradas = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            List<Reservas> reservasUsuario = reservasRepository.findByUsuario(usuario);
            reservasEncontradas.addAll(reservasUsuario);
        }

        return reservasEncontradas;
    }

    /**
     * Recupera una Reserva por su ID.
     * 
     * @param id el ID de la Reserva a recuperar.
     * @return la Reserva con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar la Reserva.
     */
    @Override
    public Reservas getByReservasId(Long id) throws Exception {
        Optional<Reservas> reservas = reservasRepository.findById(id);
        return reservas.orElse(null);
    }

    /**
     * Guarda una Reserva en el repositorio.
     * 
     * @param reservas la Reserva a guardar.
     * @return la Reserva guardada.
     * @throws Exception si ocurre un error al guardar la Reserva.
     */
    @Override
    public Reservas saveReservas(Reservas reservas) throws Exception {
        return reservasRepository.save(reservas);
    }

    /**
     * Actualiza una Reserva existente.
     * 
     * @param reservas la Reserva a actualizar.
     * @return la Reserva actualizada.
     * @throws Exception si ocurre un error al actualizar la Reserva.
     */
    @Override
    public Reservas updateReservas(Reservas reservas) {
    	// TODO Auto-generated method stub
        return reservasRepository.save(reservas);
    }

    /**
     * Elimina una Reserva por su ID.
     * 
     * @param id el ID de la Reserva a eliminar.
     * @return true si la Reserva fue eliminada con éxito, false en caso contrario.
     */
    @Override
    public boolean deleteReservas(Long id) {
        if (!reservasRepository.existsById(id)) {
            return false;
        }
        reservasRepository.deleteById(id);
        return true;
    }
}