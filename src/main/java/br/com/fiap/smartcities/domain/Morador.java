package br.com.fiap.smartcities.domain;

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
//@SequenceGenerator(name = "morador", sequenceName = "SQ_MORADOR", allocationSize = 1)
public class Morador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@NotBlank(message = "Nome obrigatório!")
	@Size(max = 50)
	private String nome;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 11)
	private String cpf;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	private String logradouro;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	private String bairro;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	private String cidade;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	
	private String estado;
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 20)
	private String numero;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	private String complemento;
	
	@NotBlank(message = "Campo sobre obrigatório!")
	@Size(max = 50)
	private String profissao;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "morador_id", referencedColumnName ="codigo")
	Set<AvaliacaoCidade> avaliacoes = new HashSet<>();

	public int getCodigo() {
		return codigo;
	}

	
	public Set<AvaliacaoCidade> getAvaliacoes() {
		return avaliacoes;
	}


	public void setAvaliacoes(Set<AvaliacaoCidade> avaliacoes) {
		this.avaliacoes = avaliacoes;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
	
	
	
	
	
	

}
