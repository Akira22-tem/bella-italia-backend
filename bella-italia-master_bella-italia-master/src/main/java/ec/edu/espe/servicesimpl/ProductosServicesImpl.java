package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.Productos;
import ec.edu.espe.repository.ProductosRepository;
import ec.edu.espe.services.ProductosServices;

/**
 * Implementación de la interfaz ProductosServices. Proporciona la lógica de
 * negocio para las operaciones CRUD y búsqueda de Productos.
 */
@Service
public class ProductosServicesImpl implements ProductosServices {

	@Autowired
	private ProductosRepository productosRepository;

	/**
	 * Recupera una lista de todos los Productos.
	 * 
	 * @return una lista de Productos.
	 */
	@Override
	public List<Productos> listAll() {
		return productosRepository.findAll();
	}

	/**
	 * Busca Productos que coincidan con el texto dado.
	 * 
	 * @param texto el texto para buscar.
	 * @return una lista de Productos que coincidan con el texto de búsqueda.
	 * @throws Exception si ocurre un error al buscar Productos.
	 */
	@Override
	public List<Productos> searchByText(String texto) throws Exception {
		List<Productos> productos = productosRepository.findByNombreContaining(texto);
		return productos;
	}

	/**
	 * Recupera un Productos por su ID.
	 * 
	 * @param id el ID del Productos a recuperar.
	 * @return el Productos con el ID dado.
	 * @throws Exception si ocurre un error al recuperar el Productos.
	 */
	@Override
	public Productos getProductosById(Long id) throws Exception {
		Optional<Productos> productos = productosRepository.findById(id);
		return productos.orElse(null);
	}

	/**
	 * Guarda un Productos en el repositorio.
	 * 
	 * @param productos el Productos a guardar.
	 * @return el Productos guardado.
	 */
	@Override
	public Productos saveProductos(Productos productos) {
		return productosRepository.save(productos);
	}

	/**
	 * Actualiza un Productos existente.
	 * 
	 * @param productos el Productos a actualizar.
	 * @return el Productos actualizado.
	 * @throws Exception si ocurre un error al actualizar el Productos.
	 */
	@Override
	public Productos updateProductos(Productos productos) throws Exception {
		return productosRepository.save(productos);
	}

	/**
	 * Elimina un Productos por su ID.
	 * 
	 * @param id el ID del Productos a eliminar.
	 * @return true si el Productos fue eliminado con éxito, false en caso
	 *         contrario.
	 * @throws Exception si ocurre un error al eliminar el Productos.
	 */
	@Override
	public boolean deleteProductos(Long id) throws Exception {
		if (!productosRepository.existsById(id)) {
			return false;
		}
		productosRepository.deleteById(id);
		return true;
	}
}