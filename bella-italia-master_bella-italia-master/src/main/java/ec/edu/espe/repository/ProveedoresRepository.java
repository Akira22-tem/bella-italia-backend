package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Proveedores;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Long> {

	List<Proveedores> findByNombreContaining(String texto);

}
