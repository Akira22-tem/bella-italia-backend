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
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.modelo.DetallePedidos;
import ec.edu.espe.services.DetallePedidoServices;

@RestController
@RequestMapping("/detallepedido")
@CrossOrigin("*")

public class DetallePedidoControllers {

	@Autowired
	private DetallePedidoServices servicesdeDetallePedido;

	@GetMapping("/")
	public List<DetallePedidos> getAll() {
		return servicesdeDetallePedido.listAll();

	}
	
	@GetMapping("/{id}")
    public DetallePedidos getDetallePedidosById(@PathVariable Long id) throws Exception{
        return servicesdeDetallePedido.getDetallePedidosById(id);
    }
	
	@PostMapping("/")
    public DetallePedidos saveDetallePedidos(@RequestBody DetallePedidos detallePedidos) throws Exception {
        return servicesdeDetallePedido.saveDetallePedidos(detallePedidos);
    }
	
	@PutMapping("/")
    public DetallePedidos updateDetallePedidos(@RequestBody DetallePedidos detallePedidos) throws Exception{
        return servicesdeDetallePedido.updateDetallePedidos(detallePedidos);
    }
	
	@DeleteMapping("/{id}")
    public String deleteDetallePedidos(@PathVariable Long id) throws Exception{
        if (servicesdeDetallePedido.deleteDetallePedidos(id)) {
            return "Detalle del pedido con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró el Detalle de pedido con " + id + ".";
        }
    }

}
