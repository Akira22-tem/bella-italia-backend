package ec.edu.espe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.modelo.Transacciones;
import ec.edu.espe.services.TransaccionesServices;

@RestController
@RequestMapping("/transacciones")
@CrossOrigin("*")

public class TransaccionesControllers {

	@Autowired
	private TransaccionesServices transaccionesServices;

	@GetMapping("/")
	public List<Transacciones> getAll() {
		return transaccionesServices.listAll();
	}

	@GetMapping("/search")
	public List<Transacciones> searchByText(@RequestParam String texto) throws Exception {
		return transaccionesServices.searchByText(texto);
	}

	@GetMapping("/{id}")
	public Transacciones getTransaccionesById(@PathVariable Long id) throws Exception {
		return transaccionesServices.getTransaccionesById(id);
	}

	@PostMapping("/")
	public Transacciones saveTransacciones(@RequestBody Transacciones transacciones) throws Exception {
		return transaccionesServices.saveTransacciones(transacciones);
	}

	@PutMapping("/")
	public Transacciones updateTransacciones(@RequestBody Transacciones transacciones) throws Exception {
		return transaccionesServices.updateTransacciones(transacciones);
	}
	
	@DeleteMapping("/{id}")
    public String deleteTransacciones(@PathVariable Long id) throws Exception {
        if (transaccionesServices.deleteTransacciones(id)) {
            return "Transacción con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró un Transacciones con ID " + id + ".";
        }
    }

}