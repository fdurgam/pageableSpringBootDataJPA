package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Proyecto;

public interface RepositorioProyecto extends JpaRepository<Proyecto, Long>{

}
