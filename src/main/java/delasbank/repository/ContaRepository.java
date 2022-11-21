package delasbank.repository;

import delasbank.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ContaRepository extends JpaRepository<Conta, Long> {
}
