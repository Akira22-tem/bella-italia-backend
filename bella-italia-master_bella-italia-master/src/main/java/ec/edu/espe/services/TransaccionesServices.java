package ec.edu.espe.services;

import java.util.List;
import ec.edu.espe.modelo.Transacciones;

public interface TransaccionesServices {

	List<Transacciones> listAll();

	List<Transacciones> searchByText(String texto) throws Exception;

	Transacciones getTransaccionesById(Long id) throws Exception;

	Transacciones saveTransacciones(Transacciones transacciones) throws Exception;

	Transacciones updateTransacciones(Transacciones transacciones) throws Exception;

	boolean deleteTransacciones(Long id) throws Exception;

}
