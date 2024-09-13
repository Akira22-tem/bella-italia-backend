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

import ec.edu.espe.modelo.Pedidos;
import ec.edu.espe.services.PedidosServices;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin("*")
public class PedidosControllers {

    @Autowired
    private PedidosServices pedidosServices;

    /**
     * Método para obtener todos los pedidos.
     * @return Lista de todos los pedidos.
     */
    @GetMapping("/")
    public List<Pedidos> getAll() {
        return pedidosServices.listAll();
    }

    /**
     * Método para buscar pedidos por texto.
     * @param texto Texto a buscar en los campos relevantes del pedido.
     * @return Lista de pedidos que coinciden con el texto.
     * @throws Exception Si ocurre algún error durante la búsqueda.
     */
    @GetMapping("/search")
    public List<Pedidos> searchByText(@RequestParam String texto) throws Exception {
        return pedidosServices.searchByText(texto);
    }

    /**
     * Método para obtener un pedido por su ID.
     * @param id ID del pedido a buscar.
     * @return Pedido encontrado por su ID.
     * @throws Exception Si el pedido con el ID especificado no existe.
     */
    @GetMapping("/{id}")
    public Pedidos getPedidosById(@PathVariable Long id) throws Exception {
        return pedidosServices.getPedidosById(id);
    }

    /**
     * Método para crear un nuevo pedido.
     * @param pedidos Pedido a ser creado.
     * @return Pedido creado.
     * @throws Exception Si ocurre algún error durante la creación.
     */
    @PostMapping("/")
    public Pedidos savePedidos(@RequestBody Pedidos pedidos) throws Exception {
        return pedidosServices.savePedidos(pedidos);
    }

    /**
     * Método para actualizar un pedido existente.
     * @param pedidos Pedido con los datos actualizados.
     * @return Pedido actualizado.
     * @throws Exception Si ocurre algún error durante la actualización.
     */
    @PutMapping("/")
    public Pedidos updatePedidos(@RequestBody Pedidos pedidos) throws Exception {
        return pedidosServices.updatePedidos(pedidos);
    }

    /**
     * Método para eliminar un pedido por su ID.
     * @param id ID del pedido a eliminar.
     * @return Mensaje indicando si el pedido fue eliminado o no encontrado.
     * @throws Exception Si ocurre algún error durante la eliminación.
     */
    @DeleteMapping("/{id}")
    public String deletePedidos(@PathVariable Long id) throws Exception {
        if (pedidosServices.deletePedidos(id)) {
            return "Pedido con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró un Pedido con ID " + id + ".";
        }
    }
}