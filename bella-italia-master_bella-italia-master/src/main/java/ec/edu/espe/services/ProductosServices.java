package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Productos;

/**
* Interfaz para los servicios de Productos.
* Proporciona métodos para realizar operaciones CRUD y funcionalidad de búsqueda para Productos.
*/
public interface ProductosServices {

   /**
    * Recupera una lista de todos los Productos.
    * 
    * @return una lista de Productos.
    */
   List<Productos> listAll();

   /**
    * Guarda un Productos en el repositorio.
    * 
    * @param productos el Productos a guardar.
    * @return el Productos guardado.
    * @throws Exception si ocurre un error al guardar el Productos.
    */
   Productos saveProductos(Productos productos) throws Exception;

   /**
    * Busca Productos que coincidan con el texto dado.
    * 
    * @param texto el texto para buscar.
    * @return una lista de Productos que coincidan con el texto de búsqueda.
    * @throws Exception si ocurre un error al buscar Productos.
    */
   List<Productos> searchByText(String texto) throws Exception;

   /**
    * Recupera un Productos por su ID.
    * 
    * @param id el ID del Productos a recuperar.
    * @return el Productos con el ID dado.
    * @throws Exception si ocurre un error al recuperar el Productos.
    */
   Productos getProductosById(Long id) throws Exception;

   /**
    * Actualiza un Productos existente.
    * 
    * @param productos el Productos a actualizar.
    * @return el Productos actualizado.
    * @throws Exception si ocurre un error al actualizar el Productos.
    */
   Productos updateProductos(Productos productos) throws Exception;

   /**
    * Elimina un Productos por su ID.
    * 
    * @param id el ID del Productos a eliminar.
    * @return true si el Productos fue eliminado con éxito, false en caso contrario.
    * @throws Exception si ocurre un error al eliminar el Productos.
    */
   boolean deleteProductos(Long id) throws Exception;
}
