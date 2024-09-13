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

import ec.edu.espe.modelo.Productos;
import ec.edu.espe.services.ProductosServices;

@RestController
@RequestMapping("/productos")
@CrossOrigin("*")
public class ProductosControllers {

    @Autowired
    private ProductosServices productosServices;

    /**
     * Método para obtener todos los productos.
     * @return Lista de todos los productos.
     */
    @GetMapping("/")
    public List<Productos> getAll() {
        return productosServices.listAll();    
    }
    
    /**
     * Método para buscar productos por texto en el nombre o descripción.
     * @param texto Texto a buscar en el nombre o descripción del producto.
     * @return Lista de productos que coinciden con el texto.
     * @throws Exception Si ocurre algún error durante la búsqueda.
     */
    @GetMapping("/search")
    public List<Productos> searchByText(@RequestParam String texto) throws Exception {
        return productosServices.searchByText(texto);
    }
    
    /**
     * Método para obtener un producto por su ID.
     * @param id ID del producto a buscar.
     * @return Producto encontrado por su ID.
     * @throws Exception Si el producto con el ID especificado no existe.
     */
    @GetMapping("/{id}")
    public Productos getProductosById(@PathVariable Long id) throws Exception{
        return productosServices.getProductosById(id);
    }

    /**
     * Método para guardar un nuevo producto.
     * @param productos Producto a ser guardado.
     * @return Producto guardado.
     * @throws Exception Si ocurre algún error durante el guardado.
     */
    @PostMapping("/")
    public Productos saveProductos(@RequestBody Productos productos) throws Exception {
        return productosServices.saveProductos(productos);
    }
    
    /**
     * Método para actualizar un producto existente.
     * @param productos Producto con los datos actualizados.
     * @return Producto actualizado.
     * @throws Exception Si ocurre algún error durante la actualización.
     */
    @PutMapping("/")
    public Productos updateProductos(@RequestBody Productos productos) throws Exception{
        return productosServices.updateProductos(productos);
    }
    
    /**
     * Método para eliminar un producto por su ID.
     * @param id ID del producto a eliminar.
     * @return Mensaje indicando si el producto fue eliminado o no encontrado.
     * @throws Exception Si ocurre algún error durante la eliminación.
     */
    @DeleteMapping("/{id}")
    public String deleteProductos(@PathVariable Long id) throws Exception{
        if (productosServices.deleteProductos(id)) {
            return "Producto con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró el producto con ID " + id + ".";
        }
    }
}