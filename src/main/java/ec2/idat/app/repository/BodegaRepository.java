package ec2.idat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.idat.app.model.Bodega;

public interface BodegaRepository  extends JpaRepository<Bodega, Integer>{

}
