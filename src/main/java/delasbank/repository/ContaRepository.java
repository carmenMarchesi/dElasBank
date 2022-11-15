package delasbank.repository;

import delasbank.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;


public interface ContaRepository extends JpaRepository<Conta, Long> {
}
