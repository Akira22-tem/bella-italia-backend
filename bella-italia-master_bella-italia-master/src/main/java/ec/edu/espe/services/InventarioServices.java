package ec.edu.espe.services;

import java.util.List;
import java.util.Optional;

import ec.edu.espe.modelo.Inventario;

public interface InventarioServices {

	Inventario saveInventario(Inventario inventario) throws Exception;

	List<Inventario> listAll();

	Optional<Inventario> findById(Long id);
     
	void deleteById(Long id);
	
    boolean existsById(Long id);
       
    List<Inventario> findByNombre(String nombre); // Método para buscar por nombre
}
