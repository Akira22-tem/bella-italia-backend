package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Inventario;
import ec.edu.espe.repository.InventarioRepository;
import ec.edu.espe.services.InventarioServices;

@Service
public class InventarioServicesImpl  implements InventarioServices{

	 @Autowired
	    private InventarioRepository inventarioRepository;

	    @Override
	    public Inventario saveInventario(Inventario inventario) throws Exception {
	        // TODO Auto-generated method stub
	        return inventarioRepository.save(inventario);
	    }

	    @Override
	    public List<Inventario> listAll() {
	        return inventarioRepository.findAll();
	    }

	    @Override
	    public Optional<Inventario> findById(Long id) {
	        return inventarioRepository.findById(id);
	    }

	    @Override
	    public void deleteById(Long id) {
	        inventarioRepository.deleteById(id);
	    }

	    @Override
	    public boolean existsById(Long id) {
	        return inventarioRepository.existsById(id);
	    }
	    
	  
	    @Override
	    public List<Inventario> findByNombre(String nombre) {
	        return InventarioRepository.findByNombre(nombre);
	    }
}
