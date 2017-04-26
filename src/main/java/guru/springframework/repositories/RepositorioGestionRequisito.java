package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.GestionRequisito;

public interface RepositorioGestionRequisito extends JpaRepository<GestionRequisito, Long> {

}
