package ec2.idat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.idat.app.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
