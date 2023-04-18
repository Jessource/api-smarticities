package br.com.fiap.smartcities.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.smartcities.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	List<Cidade> findByNome(String nome); 

    List<Cidade> findBySobre(String sobre); 

    List<Cidade> findByNomeAndSobre(String nome, String sobre); 

    
	
}
