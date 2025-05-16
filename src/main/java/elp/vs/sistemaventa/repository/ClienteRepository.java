package elp.vs.sistemaventa.repository;

import elp.vs.sistemaventa.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
