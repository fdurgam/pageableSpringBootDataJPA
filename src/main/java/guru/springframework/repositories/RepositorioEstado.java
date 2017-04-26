package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.estadoRequisito;



public interface RepositorioEstado extends JpaRepository<estadoRequisito, Long> {

}
