package br.com.fiap.smartcities.domain;



import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

@Entity
//@SequenceGenerator(name = "cidade", sequenceName = "SQ_CIDADE", allocationSize = 1)
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@NotBlank(message = "Nome obrigatório!")
	@Size(max = 50)
	private String nome;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 255)
	private String sobre;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cidade_id", referencedColumnName ="codigo")
	Set<AvaliacaoCidade> avaliacoes = new HashSet<>();
	
	

	public Set<AvaliacaoCidade> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Set<AvaliacaoCidade> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}


	

	
	
	
	

}
