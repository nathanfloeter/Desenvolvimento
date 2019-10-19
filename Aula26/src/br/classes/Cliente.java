package br.classes;
import br.classes.Cidade;

public class Cliente{
	
	public String nome;
	public String email;
	public String telefone;
	
	public Cidade cidade = new Cidade();
	
	
	public Cliente(String nome,String email,String telefone,String cidade, String estado) {
		
		this.cidade.cidade = cidade;
		this.cidade.estado = estado;
		this.nome = nome;
		this.email = email;
		this.telefone =telefone;
		
	}

}
