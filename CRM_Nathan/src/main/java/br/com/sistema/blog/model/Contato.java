package br.com.sistema.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//responsável por criar a tabela no banco.
@Entity
@Table(name = "contato")

//aqui criamos os atributos dos usuários e logo abaixo os métodos getters and setters.

public class Contato {
	

	private String nome;

	private String email;

	private String telefone;

	private String observacao;
	
	//Gerando Id automaticamente
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Contato(long id) {
		this.id = id;
	}
	
	public Contato() {
	}

	public Contato(String nome, String email, String telefone, String obs) {	
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.observacao = obs;
	}

	//gettters e setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservação(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", observação=" + observacao
				+ "]";
	}
	
	
	
	
	

}
