package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Transacciones;
import ec.edu.espe.repository.TransaccionesRepository;
import ec.edu.espe.services.TransaccionesServices;

@Service
public class TransaccionesServicesImpl implements TransaccionesServices {

	@Autowired
	private TransaccionesRepository transaccionesRepository;

	@Override
	public List<Transacciones> listAll() {
		return transaccionesRepository.findAll();
	}

	@Override
	public List<Transacciones> searchByText(String texto) throws Exception {
		List<Transacciones> transacciones = transaccionesRepository.findByTipoContaining(texto);
		return transacciones;
	}

	@Override
	public Transacciones getTransaccionesById(Long id) throws Exception {
		Optional<Transacciones> transacciones = transaccionesRepository.findById(id);
		return transacciones.orElse(null);
	}

	@Override
	public Transacciones saveTransacciones(Transacciones transacciones) throws Exception {
		return transaccionesRepository.save(transacciones);
	}

	@Override
	public Transacciones updateTransacciones(Transacciones transacciones) throws Exception {
		return transaccionesRepository.save(transacciones);
	}

	@Override
	public boolean deleteTransacciones(Long id) throws Exception {
		if (!transaccionesRepository.existsById(id)) {
            return false;
        }
        transaccionesRepository.deleteById(id);
        return true;
    }

}
