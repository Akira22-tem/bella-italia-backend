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

import ec.edu.espe.modelo.Proveedores;
import ec.edu.espe.services.ProveedoresServices;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin("*")
public class ProveedoresControllers {

	@Autowired
	private ProveedoresServices proveedoresServices;

	/**
	 * Método para obtener todos los proveedores.
	 * 
	 * @return Lista de todos los proveedores.
	 */
	@GetMapping("/")
	public List<Proveedores> getAll() {
		return proveedoresServices.listAll();
	}

	/**
	 * Método para buscar proveedores por texto en cualquier campo relevante.
	 * 
	 * @param texto Texto a buscar en los campos relevantes del proveedor.
	 * @return Lista de proveedores que coinciden con el texto.
	 * @throws Exception Si ocurre algún error durante la búsqueda.
	 */
	@GetMapping("/search")
	public List<Proveedores> searchByText(@RequestParam String texto) throws Exception {
		return proveedoresServices.searchByText(texto);
	}

	/**
	 * Método para obtener un proveedor por su ID.
	 * 
	 * @param id ID del proveedor a buscar.
	 * @return Proveedor encontrado por su ID.
	 * @throws Exception Si el proveedor con el ID especificado no existe.
	 */
	@GetMapping("/{id}")
	public Proveedores getProvedoresById(@PathVariable Long id) throws Exception {
		return proveedoresServices.getProvedoresById(id);
	}

	/**
	 * Método para guardar un nuevo proveedor.
	 * 
	 * @param provedores Proveedor a ser guardado.
	 * @return Proveedor guardado.
	 * @throws Exception Si ocurre algún error durante el guardado.
	 */
	@PostMapping("/")
	public Proveedores saveProvedores(@RequestBody Proveedores provedores) throws Exception {
		return proveedoresServices.saveProvedores(provedores);
	}

	/**
	 * Método para actualizar un proveedor existente.
	 * 
	 * @param id         ID del proveedor a actualizar.
	 * @param provedores Proveedor con los datos actualizados.
	 * @return Proveedor actualizado.
	 * @throws Exception Si ocurre algún error durante la actualización.
	 */

	@PutMapping("/")
	public Proveedores updateProvedores(@RequestBody Proveedores provedores) throws Exception {
		return proveedoresServices.updateProvedores(provedores);
	}

	/**
	 * Método para eliminar un proveedor por su ID.
	 * 
	 * @param id ID del proveedor a eliminar.
	 * @return Mensaje indicando si el proveedor fue eliminado o no encontrado.
	 * @throws Exception Si ocurre algún error durante la eliminación.
	 */
	@DeleteMapping("/{id}")
	public String deleteProvedores(@PathVariable Long id) throws Exception {
		if (proveedoresServices.deleteProvedores(id)) {
			return "Proveedor con ID " + id + " ha sido eliminado.";
		} else {
			return "No se encontró el proveedor con ID " + id + ".";
		}
	}
}