package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
//@SequenceGenerator(name = "avaliacao", sequenceName = "SQ_AVALIACAO", allocationSize = 1)
public class AvaliacaoCidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@NotBlank(message = "Campo obrigatório!")
	@Size(max = 100)
	@Column (name = "comentario_saude")
	private String comentarioSaude;
	
	@NotBlank(message = "Campo obrigatório!")
	@Size(max = 100)
	@Column (name = "comentario_escola")
	private String comentarioEscola;
	
	
	@Column (name = "morador_id")
	private int moradorId;
	
	@Column (name = "cidade_id")
	private int cidadeId;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getComentarioSaude() {
		return comentarioSaude;
	}

	public void setComentarioSaude(String comentarioSaude) {
		this.comentarioSaude = comentarioSaude;
	}

	public String getComentarioEscola() {
		return comentarioEscola;
	}

	public void setComentarioEscola(String comentarioEscola) {
		this.comentarioEscola = comentarioEscola;
	}

	public int getMoradorId() {
		return moradorId;
	}

	public void setMoradorId(int moradorId) {
		this.moradorId = moradorId;
	}

	public int getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(int cidadeId) {
		this.cidadeId = cidadeId;
	}

	

	
	

}
