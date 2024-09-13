package ec.edu.espe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ec.edu.espe.modelo.Usuario;
import ec.edu.espe.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControllers {

	@Autowired
	private UsuarioServices usuarioServices;

	/**
	 * Método para obtener todos los usuarios.
	 * 
	 * @return Lista de todos los usuarios.
	 */
	@GetMapping("/")
	public List<Usuario> getAll() {
		return usuarioServices.listAll();
	}

	/**
	 * Método para buscar usuarios por texto en el nombre o apellido.
	 * 
	 * @param texto Texto a buscar en el nombre o apellido del usuario.
	 * @return Lista de usuarios que coinciden con el texto.
	 * @throws Exception Si ocurre algún error durante la búsqueda.
	 */
	@GetMapping("/search")
	public List<Usuario> searchByText(@RequestParam String texto) throws Exception {
		return usuarioServices.searchByText(texto);
	}

	/**
	 * Método para obtener un usuario por su ID.
	 * 
	 * @param id ID del usuario a buscar.
	 * @return Usuario encontrado por su ID.
	 * @throws Exception Si el usuario con el ID especificado no existe.
	 */
	@GetMapping("/{id}")
	public Usuario getUsuarioById(@PathVariable Long id) throws Exception {
		return usuarioServices.getUsuarioById(id);
	}

	/**
	 * Método para guardar un nuevo usuario.
	 * 
	 * @param usuario Usuario a ser guardado.
	 * @return Usuario guardado.
	 * @throws Exception Si ocurre algún error durante el guardado.
	 */
	@PostMapping("/")
	public Usuario saveUsuario(@RequestBody Usuario usuario) throws Exception {
		return usuarioServices.saveUsuario(usuario);
	}

	/**
	 * Método para actualizar un usuario existente.
	 * 
	 * @param usuario Usuario con los datos actualizados.
	 * @return Usuario actualizado.
	 * @throws Exception Si ocurre algún error durante la actualización.
	 */
	@PutMapping("/")
	public Usuario updateUsuario(@RequestBody Usuario usuario) throws Exception {
		return usuarioServices.updateUsuario(usuario);
	}

	/**
	 * Método para eliminar un usuario por su ID.
	 * 
	 * @param id ID del usuario a eliminar.
	 * @return Mensaje indicando si el usuario fue eliminado o no encontrado.
	 * @throws Exception Si ocurre algún error durante la eliminación.
	 */
	@DeleteMapping("/{id}")
	public String deleteUsuarios(@PathVariable Long id) throws Exception {
		if (usuarioServices.deleteUsuarios(id)) {
			return "Usuario con ID " + id + " ha sido eliminado.";
		} else {
			return "No se encontró Usuario con ID " + id + ".";
		}
	}
}