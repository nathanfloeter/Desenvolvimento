package br.com.sistema.blog.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UsuarioDAO extends CrudRepository<Usuario,Long>{
	 
	public Usuario findById(long id);
	public Usuario findByNome(String nome);
	public Usuario findByEmail(String email);

}
