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

import ec.edu.espe.modelo.Reservas;
import ec.edu.espe.services.ReservasServices;

@RestController
@RequestMapping("/reservas")
@CrossOrigin("*")
public class ReservasControllers {

	@Autowired
	private ReservasServices reservasServices;

	/**
	 * Método para obtener todas las reservas.
	 * 
	 * @return Lista de todas las reservas.
	 */
	@GetMapping("/")
	public List<Reservas> getAll() {
		return reservasServices.listAll();
	}

	/**
	 * Método para buscar reservas por texto en cualquier campo relevante.
	 * 
	 * @param text Texto a buscar en los campos relevantes de la reserva.
	 * @return Lista de reservas que coinciden con el texto.
	 * @throws Exception Si ocurre algún error durante la búsqueda.
	 */
	@GetMapping("/search")
	public List<Reservas> searchByText(@RequestParam String texto) throws Exception {
		return reservasServices.searchByText(texto);
	}

	/**
	 * Método para obtener una reserva por su ID.
	 * 
	 * @param id ID de la reserva a buscar.
	 * @return Reserva encontrada por su ID.
	 * @throws Exception Si la reserva con el ID especificado no existe.
	 */
	@GetMapping("/{id}")
	public Reservas getByReservasId(@PathVariable Long id) throws Exception {
		return reservasServices.getByReservasId(id);
	}

	/**
	 * Método para crear una nueva reserva.
	 * 
	 * @param reservas Reserva a ser creada.
	 * @return Reserva creada.
	 * @throws Exception Si ocurre algún error durante la creación.
	 */
	@PostMapping("/")
	public Reservas saveReservas(@RequestBody Reservas reservas) throws Exception {
		return reservasServices.saveReservas(reservas);
	}

	/**
	 * Método para actualizar una reserva existente.
	 * 
	 * @param id       ID de la reserva a actualizar.
	 * @param reservas Reserva con los datos actualizados.
	 * @return Reserva actualizada.
	 * @throws Exception Si ocurre algún error durante la actualización.
	 */
	/*
	 * @PutMapping("/{id}") public Reservas updateReservas(@PathVariable Long
	 * id, @RequestBody Reservas reservas) throws Exception { reservas.setId(id);
	 * return reservasServices.updateReservas(reservas); }
	 */

	@PutMapping("/")
	public Reservas updateUReservas(@RequestBody Reservas reservas) throws Exception {
		return reservasServices.updateReservas(reservas);
	}

	/**
	 * Método para eliminar una reserva por su ID.
	 * 
	 * @param id ID de la reserva a eliminar.
	 * @return Mensaje indicando si la reserva fue eliminada o no encontrada.
	 * @throws Exception Si ocurre algún error durante la eliminación.
	 */
	@DeleteMapping("/{id}")
	public String deleteReservas(@PathVariable Long id) throws Exception {
		if (reservasServices.deleteReservas(id)) {
			return "Reserva con ID " + id + " ha sido eliminada.";
		} else {
			return "No se encontró una reserva con ID " + id + ".";
		}
	}
}