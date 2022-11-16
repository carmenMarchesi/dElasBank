package delasbank.repository;

import delasbank.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TransferenciaRepository extends JpaRepository <Transferencia, Long> {
}
