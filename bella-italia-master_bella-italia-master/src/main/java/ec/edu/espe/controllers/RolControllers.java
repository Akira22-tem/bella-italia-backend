package ec.edu.espe.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ec.edu.espe.modelo.Rol;
import ec.edu.espe.services.RolServices;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RolControllers {

    @Autowired
    private RolServices rolServices;

    /**
     * Método para obtener todos los roles.
     * @return Lista de todos los roles.
     */
    @GetMapping("/")
    public List<Rol> getAll() {
        return rolServices.listAll();
    }
    
    /**
     * Método para buscar roles por texto en el nombre o descripción.
     * @param texto Texto a buscar en el nombre o descripción del rol.
     * @return Lista de roles que coinciden con el texto.
     * @throws Exception Si ocurre algún error durante la búsqueda.
     */
    @GetMapping("/search")
    public List<Rol> searchByText(@RequestParam String texto) throws Exception {
        return rolServices.searchByText(texto);
    }
    
    /**
     * Método para obtener un rol por su ID.
     * @param id ID del rol a buscar.
     * @return Rol encontrado por su ID.
     * @throws Exception Si el rol con el ID especificado no existe.
     */
    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable Long id) throws Exception {
        return rolServices.getRolById(id);
    }
    
    /**
     * Método para guardar un nuevo rol.
     * @param rol Rol a ser guardado.
     * @return Rol guardado.
     * @throws Exception Si ocurre algún error durante el guardado.
     */
    @PostMapping("/")
    public Rol saveRol(@RequestBody Rol rol) throws Exception {
        return rolServices.saveRol(rol);
    }
    
    /**
     * Método para actualizar un rol existente.
     * @param rol Rol con los datos actualizados.
     * @return Rol actualizado.
     * @throws Exception Si ocurre algún error durante la actualización.
     */
    @PutMapping("/")
    public Rol updateRol(@RequestBody Rol rol) throws Exception {
        return rolServices.updateRol(rol);
    }
    
    /**
     * Método para eliminar un rol por su ID.
     * @param id ID del rol a eliminar.
     * @return Mensaje indicando si el rol fue eliminado o no encontrado.
     * @throws Exception Si ocurre algún error durante la eliminación.
     */
    @DeleteMapping("/{id}")
    public String deleteRol(@PathVariable Long id) throws Exception {
        if (rolServices.deleteRol(id)) {
            return "Rol con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró un rol con ID " + id + ".";
        }
    }
}