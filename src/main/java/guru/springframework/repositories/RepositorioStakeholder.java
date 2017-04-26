package guru.springframework.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Stakeholder;



public interface RepositorioStakeholder extends JpaRepository<Stakeholder, Long> {
	
}
