package guru.springframework.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Requisito;


public interface RepositorioRequisito extends JpaRepository<Requisito, Long>{
	List<Requisito> findByNombre(String nombre);
}
