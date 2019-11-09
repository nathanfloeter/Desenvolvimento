package br.com.sistema.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {
	//Gerando Id automaticamente
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String email;
	
	@NotNull
	private String nome;
	
	public Usuario() {}
	
	public Usuario(long id) {
		this.id = id;
	}
	public Usuario(String email, String nome) {
		this.email = email;
		this.nome = nome;
	}

	//gettters e setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario:" + id + "\nemail:" + email + "\nnome:" + nome;
	}
	

}
