package delasbank.repository;

import delasbank.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
