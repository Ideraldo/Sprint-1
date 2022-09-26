package br.com.fiap.sprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.sprint.model.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long>{
	
}
