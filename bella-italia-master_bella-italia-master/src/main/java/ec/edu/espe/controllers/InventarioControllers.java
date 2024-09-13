package ec.edu.espe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.modelo.Inventario;
import ec.edu.espe.repository.InventarioRepository;
import ec.edu.espe.services.InventarioServices;

@RestController
@RequestMapping("/inventario")
@CrossOrigin("*") 

public class InventarioControllers {

	@Autowired
	private InventarioServices servicesInventario;
		
	@GetMapping("/")
	public List<Inventario> getAll() {
		return servicesInventario.listAll();
		
	}
	
	@GetMapping("/{id}")
    public Optional<Inventario> getById(@PathVariable("id") Long id) {
        return servicesInventario.findById(id);
    }

    @PostMapping("/")
    public Inventario saveInventario(@RequestBody Inventario inventario) throws Exception{
        return servicesInventario.saveInventario(inventario);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (servicesInventario.existsById(id)) {
            servicesInventario.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
    @GetMapping("/nombre/{nombre}")
    public List<Inventario> getByNombre(@PathVariable String nombre) {
        return InventarioRepository.findByNombre(nombre);
    }
    
}
