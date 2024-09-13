package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.espe.modelo.Proveedores;
import ec.edu.espe.repository.ProveedoresRepository;
import ec.edu.espe.services.ProveedoresServices;

@Service
public class ProveedoresServicesImpl implements ProveedoresServices {

	@Autowired
	private ProveedoresRepository provedoresRepository;

	@Override
	public List<Proveedores> listAll() {
		return provedoresRepository.findAll();
	}
	
	@Override
	public List<Proveedores> searchByText(String texto) throws Exception {
        List<Proveedores> provedores = provedoresRepository.findByNombreContaining(texto);
        return provedores;
    }

	@Override
	public Proveedores getProvedoresById(Long id) throws Exception {
		Optional<Proveedores> provedores = provedoresRepository.findById(id);
        return provedores.orElse(null);
	}

	@Override
	public Proveedores saveProvedores(Proveedores provedores) throws Exception {
		// TODO Auto-generated method stub
		return provedoresRepository.save(provedores);
	}

	@Override
	public Proveedores updateProvedores(Proveedores provedores) throws Exception {
		return provedoresRepository.save(provedores);
	}

	@Override
	public boolean deleteProvedores(Long id) {
        if (!provedoresRepository.existsById(id)) {
            return false;
        }
        provedoresRepository.deleteById(id);
        return true;
    }

}
