package ec2.idat.app.service;

import java.util.List;

import ec2.idat.app.model.Bodega;
import ec2.idat.app.model.Cliente;

public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
