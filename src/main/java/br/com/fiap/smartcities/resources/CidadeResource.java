package br.com.fiap.smartcities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.smartcities.domain.Cidade;
import br.com.fiap.smartcities.repository.CidadeRepository;

@RestController 
@RequestMapping("cidade") 
public class CidadeResource { 

 

    @Autowired
    private CidadeRepository cidadeRepository; 

 

    @GetMapping 
    public List<Cidade> listar() { 
        return cidadeRepository.findAll(); 
    } 

 

    @GetMapping("{codigo}") 
    public Cidade buscar(@PathVariable int codigo) { 
        return cidadeRepository.findById(codigo).get(); 
    } 

 

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public Cidade cadastrar(@RequestBody Cidade cidade) { 
        return cidadeRepository.save(cidade); 
    } 

 

    @PutMapping("{id}") 
    public Cidade atualizar(@RequestBody Cidade cidade, @PathVariable int id) { 
        cidade.setCodigo(id); 
        return cidadeRepository.save(cidade); 
    } 

 
    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	cidadeRepository.deleteById(codigo); 
    } 

 

    @GetMapping("pesquisa") 
    public List<Cidade> buscar(@RequestParam(required = false) String nome, @RequestParam(defaultValue = "false")  String sobre) { 
        return nome != null ? cidadeRepository.findByNomeAndSobre(nome, sobre) : cidadeRepository.findBySobre(sobre); 
    } 

} 
