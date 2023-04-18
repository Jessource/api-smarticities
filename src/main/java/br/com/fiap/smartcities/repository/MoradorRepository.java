package br.com.fiap.smartcities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.smartcities.domain.Morador;


@Repository
public interface MoradorRepository extends JpaRepository<Morador, Integer> {

	List<Morador> findByNome(String nome); 

    List<Morador> findByCidade(String cidade); 

   

    
	
}