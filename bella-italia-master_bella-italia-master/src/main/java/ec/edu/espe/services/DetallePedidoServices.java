package ec.edu.espe.services;

import java.util.List;

import ec.edu.espe.modelo.DetallePedidos;

public interface DetallePedidoServices {

	List<DetallePedidos> listAll();

	DetallePedidos getDetallePedidosById(Long id);

	DetallePedidos saveDetallePedidos(DetallePedidos detallePedidos) throws Exception;

	DetallePedidos updateDetallePedidos(DetallePedidos detallePedidos) throws Exception;

	boolean deleteDetallePedidos(Long id);
}
