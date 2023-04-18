package br.com.fiap.smartcities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.smartcities.domain.AvaliacaoCidade;

import br.com.fiap.smartcities.repository.AvaliacaoRepository;


@RestController 
@RequestMapping("avaliacao") 
public class AvaliacaoResource {
	
	@Autowired
    private AvaliacaoRepository avaliacaoRepository; 

 

    @GetMapping 
    public List<AvaliacaoCidade> listar() { 
        return avaliacaoRepository.findAll(); 
    } 

 

    @GetMapping("{codigo}") 
    public AvaliacaoCidade buscar(@PathVariable int codigo) { 
        return avaliacaoRepository.findById(codigo).get(); 
    } 

 

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public AvaliacaoCidade cadastrar(@RequestBody AvaliacaoCidade avaliacao) { 
        return avaliacaoRepository.save(avaliacao); 
    } 

 

    @PutMapping("{id}") 
    public AvaliacaoCidade atualizar(@RequestBody AvaliacaoCidade avaliacao, @PathVariable int id) { 
        avaliacao.setCodigo(id); 
        return avaliacaoRepository.save(avaliacao); 
    } 

 
    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	avaliacaoRepository.deleteById(codigo); 
    } 


}
