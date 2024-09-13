
package ec.edu.espe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.modelo.Transacciones;


public interface TransaccionesRepository extends JpaRepository <Transacciones, Long> {

	List<Transacciones> findByTipoContaining(String texto);

}
