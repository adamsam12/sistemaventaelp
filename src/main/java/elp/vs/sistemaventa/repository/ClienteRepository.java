package elp.vs.sistemaventa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import elp.vs.sistemaventa.model.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}
