package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Mesas;
import ec.edu.espe.repository.MesasRepository;
import ec.edu.espe.services.MesasServices;

/**
 * Implementación de la interfaz MesasServices.
 * Proporciona la lógica de negocio para las operaciones CRUD y búsqueda de Mesas.
 */
@Service
public class MesasServicesImpl implements MesasServices {

    @Autowired
    private MesasRepository mesasRepository;

    /**
     * Recupera una lista de todas las Mesas.
     * 
     * @return una lista de Mesas.
     */
    @Override
    public List<Mesas> listAll() {
        return mesasRepository.findAll();
    }

    /**
     * Busca Mesas que coincidan con el texto dado, basándose en el estado.
     * 
     * @param texto el texto para buscar.
     * @return una lista de Mesas que coincidan con el texto de búsqueda.
     * @throws Exception si ocurre un error al buscar Mesas.
     */
    @Override
    public List<Mesas> searchByText(String texto) throws Exception {
        List<Mesas> mesas = mesasRepository.findByEstadoContaining(texto);
        return mesas;
    }

    /**
     * Recupera una Mesa por su ID.
     * 
     * @param id el ID de la Mesa a recuperar.
     * @return la Mesa con el ID dado, o null si no se encuentra.
     * @throws Exception si ocurre un error al recuperar la Mesa.
     */
    @Override
    public Mesas getMesasById(Long id) throws Exception {
        Optional<Mesas> mesas = mesasRepository.findById(id);
        return mesas.orElse(null);
    }

    /**
     * Guarda una Mesa en el repositorio.
     * 
     * @param mesas la Mesa a guardar.
     * @return la Mesa guardada.
     * @throws Exception si ocurre un error al guardar la Mesa.
     */
    @Override
    public Mesas saveMesas(Mesas mesas) throws Exception {
        return mesasRepository.save(mesas);
    }

    /**
     * Actualiza una Mesa existente.
     * 
     * @param mesas la Mesa a actualizar.
     * @return la Mesa actualizada.
     * @throws Exception si ocurre un error al actualizar la Mesa.
     */
    @Override
    public Mesas updateMesas(Mesas mesas) throws Exception {
        return mesasRepository.save(mesas);
    }

    /**
     * Elimina una Mesa por su ID.
     * 
     * @param id el ID de la Mesa a eliminar.
     * @return true si la Mesa fue eliminada con éxito, false en caso contrario.
     */
    @Override
    public boolean deleteMesas(Long id) {
        if (!mesasRepository.existsById(id)) {
            return false;
        }
        mesasRepository.deleteById(id);
        return true;
    }
}