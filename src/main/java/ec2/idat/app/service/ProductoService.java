package ec2.idat.app.service;

import java.util.List;


import ec2.idat.app.model.Cliente;
import ec2.idat.app.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
}
