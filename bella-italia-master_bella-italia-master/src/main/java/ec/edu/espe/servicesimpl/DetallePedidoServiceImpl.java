package ec.edu.espe.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.modelo.DetallePedidos;
import ec.edu.espe.repository.DetallePedidoRepository;
import ec.edu.espe.services.DetallePedidoServices;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoServices {

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;

	@Override
	public List<DetallePedidos> listAll() {
		return detallePedidoRepository.findAll();
	}

	@Override
	public DetallePedidos getDetallePedidosById(Long id) {
		Optional<DetallePedidos> detallepedidos = detallePedidoRepository.findById(id);
        return detallepedidos.orElse(null);
	}

	@Override
	public DetallePedidos saveDetallePedidos(DetallePedidos detallePedidos) throws Exception{
		return detallePedidoRepository.save(detallePedidos);
	}

	@Override
	public DetallePedidos updateDetallePedidos(DetallePedidos detallePedidos) throws Exception{
		return detallePedidoRepository.save(detallePedidos);
	}

	@Override
	public boolean deleteDetallePedidos(Long id) {
        if (!detallePedidoRepository.existsById(id)) {
            return false;
        }
        detallePedidoRepository.deleteById(id);
        return true;
    }

}
