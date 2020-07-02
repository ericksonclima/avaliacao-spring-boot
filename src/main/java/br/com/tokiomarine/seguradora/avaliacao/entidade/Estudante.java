package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Entidade que representa estudante
 * @author Erick Lima
 *
 */
@Entity
@Table(name = "estudantes")
public class Estudante {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nome")
	@NotBlank
	private String nome;
	
	@Column(name="email")
	@NotBlank
	private String email;
	
	@Column(name="matricula")
	@NotBlank(message = "Matrícula é obrigatória")
	private String matricula;
	
	@Column(name="curso")
	private String curso;
	
	@Column(name="telefone")
	private String telefone;

	public Estudante() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
