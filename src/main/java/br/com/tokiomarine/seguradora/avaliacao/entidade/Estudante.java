package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	@NotNull
	private String nome;
	
	@Column(name="email")
	@NotNull
	private String email;
	
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
	
}
