package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.Proveedores;

public interface ProveedoresServices {

	List<Proveedores> listAll();

	List<Proveedores> searchByText(String texto) throws Exception;

	Proveedores getProvedoresById(Long id) throws Exception;

	Proveedores saveProvedores(Proveedores provedores) throws Exception;

	Proveedores updateProvedores(Proveedores provedores) throws Exception;

	boolean deleteProvedores(Long id) throws Exception;

}
