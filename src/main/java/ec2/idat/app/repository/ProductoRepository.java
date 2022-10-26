package ec2.idat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.idat.app.model.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Integer>{

}
