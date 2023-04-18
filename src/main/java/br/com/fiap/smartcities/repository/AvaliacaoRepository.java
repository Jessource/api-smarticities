package br.com.fiap.smartcities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.smartcities.domain.AvaliacaoCidade;



@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoCidade, Integer> {

	List<AvaliacaoCidade> findByComentarioSaude(String comentarioSaude); 
	List<AvaliacaoCidade> findByComentarioEscola(String comentarioEscola); 

   

    
	
}

