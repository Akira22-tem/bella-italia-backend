package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Inventario;


public interface InventarioRepository extends JpaRepository <Inventario, Long>{

	
	//////ojo///////
	static List<Inventario> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	} // Método para buscar por nombre
}