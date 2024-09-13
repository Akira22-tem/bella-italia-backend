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

import ec.edu.espe.modelo.Mesas;
import ec.edu.espe.services.MesasServices;

@RestController
@RequestMapping("/mesas")
@CrossOrigin("*")
public class MesasControllers {

    @Autowired
    private MesasServices mesasServices;

    /**
     * Método para obtener todas las mesas.
     * @return Lista de todas las mesas.
     */
    @GetMapping("/")
    public List<Mesas> getAll() {
        return mesasServices.listAll();
    }
    
    /**
     * Método para buscar mesas por texto en cualquier campo relevante.
     * @param texto Texto a buscar en los campos relevantes de la mesa.
     * @return Lista de mesas que coinciden con el texto.
     * @throws Exception Si ocurre algún error durante la búsqueda.
     */
    @GetMapping("/search")
    public List<Mesas> searchByText(@RequestParam String texto) throws Exception {
        return mesasServices.searchByText(texto);
    }

    /**
     * Método para obtener una mesa por su ID.
     * @param id ID de la mesa a buscar.
     * @return Mesa encontrada por su ID.
     * @throws Exception Si la mesa con el ID especificado no existe.
     */
    @GetMapping("/{id}")
    public Mesas getById(@PathVariable Long id) throws Exception {
        return mesasServices.getMesasById(id);
    }

    /**
     * Método para crear una nueva mesa.
     * @param objMesas Objeto Mesa a ser creado.
     * @return Mesa creada.
     * @throws Exception Si ocurre algún error durante la creación.
     */
    @PostMapping("/")
    public Mesas saveMesas(@RequestBody Mesas mesas) throws Exception {
        return mesasServices.saveMesas(mesas);
    }

    /**
     * Método para actualizar una mesa existente.
     * @param mesas Objeto Mesa con los datos actualizados.
     * @return Mesa actualizada.
     * @throws Exception Si ocurre algún error durante la actualización.
     */
    @PutMapping("/")
    public Mesas updateMesas(@RequestBody Mesas mesas) throws Exception {
        return mesasServices.updateMesas(mesas);
    }

    /**
     * Método para eliminar una mesa por su ID.
     * @param id ID de la mesa a eliminar.
     * @throws Exception Si ocurre algún error durante la eliminación.
     */
    @DeleteMapping("/{id}")
    public String deleteMesas(@PathVariable Long id) throws Exception {
        if (mesasServices.deleteMesas(id)) {
            return "Mesa con ID " + id + " ha sido eliminado.";
        } else {
            return "No se encontró la Mesa con ID " + id + ".";
        }
    }
}