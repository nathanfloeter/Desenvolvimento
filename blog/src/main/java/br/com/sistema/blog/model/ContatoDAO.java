package br.com.sistema.blog.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ContatoDAO extends CrudRepository<Contato,Long>{
	
	//classe necessária para fazer a comunicação com o banco.
	 
	public Contato findById(long id);
	public Contato findByNome(String nome);
	public Contato findByEmail(String email);
	public Contato findByTelefone(String telefone);

}
