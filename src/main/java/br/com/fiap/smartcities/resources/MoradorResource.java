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


import br.com.fiap.smartcities.domain.Morador;

import br.com.fiap.smartcities.repository.MoradorRepository;

@RestController 
@RequestMapping("morador") 
public class MoradorResource {
	
	@Autowired
    private MoradorRepository moradorRepository; 

 

    @GetMapping 
    public List<Morador> listar() { 
        return moradorRepository.findAll(); 
    } 

 

    @GetMapping("{codigo}") 
    public Morador buscar(@PathVariable int codigo) { 
        return moradorRepository.findById(codigo).get(); 
    } 

 

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public Morador cadastrar(@RequestBody Morador morador) { 
        return moradorRepository.save(morador); 
    } 

 

    @PutMapping("{id}") 
    public Morador atualizar(@RequestBody Morador morador, @PathVariable int id) { 
        morador.setCodigo(id); 
        return moradorRepository.save(morador); 
    } 

 
    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	moradorRepository.deleteById(codigo); 
    } 

 

 


}
