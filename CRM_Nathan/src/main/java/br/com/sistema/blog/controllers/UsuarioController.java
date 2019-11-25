package br.com.sistema.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sistema.blog.model.Usuario;
import br.com.sistema.blog.model.UsuarioDAO;

@Controller
@EnableAutoConfiguration
@ComponentScan()
public class UsuarioController {
	
	// Private fields

	  @Autowired
	  private UsuarioDAO usuarioDAO;
	
	@RequestMapping("/usuario")
	@ResponseBody
	public String usuario() {
		return "usuario";
	}
  
	/**
	* GET /create  --> Create a new user and save it in the database.
	*/
	@RequestMapping("/novo")
	@ResponseBody
	public String create(String email, String nome) {
		String usuarioId = "";
	    try {
	      Usuario usuario = new Usuario(email, nome);
	      this.usuarioDAO.save(usuario);
	      usuarioId = String.valueOf(usuario.getId());
	    }
	    catch (Exception ex) {
	      return "Erro ao criar o usuário: " + ex.toString();
	    }
	    return "Usuário Criado com sucesso com o código: " + usuarioId;
	}
	
	/**
	* GET /delete  --> Delete the user having the passed id.
	*/
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
	      Usuario usuario = new Usuario(id);
	      usuarioDAO.delete(usuario);
	    }
	    catch (Exception ex) {
	      return "Erro ao criar o usuário: " + ex.toString();
	    }
	    return "Usuário deletado com sucesso!";
	}
	
	/**
	* GET /get-by-email  --> Return the id for the user having the passed
	* email.
	*/
	@RequestMapping("/getemail")
	@ResponseBody
	public String getByEmail(String email) {
	    String usuarioId = "";
	    try {
	      Usuario usuario = usuarioDAO.findByEmail(email);
	      usuarioId = String.valueOf(usuario.getId());
	    }
	    catch (Exception ex) {
	      return "Usuário não encontrado";
	    }
	    return "Código do usuário encontrado: " + usuarioId;
	}
	
	 /**
	 * GET /update  --> Update the email and the name for the user in the 
	 * database having the passed id.
	 */
	 @RequestMapping("/atualizar")
	 @ResponseBody
	 public String updateUsuario(long id, String email, String nome) {
	    try {
	      Usuario usuario = usuarioDAO.findById(id);
	      usuario.setEmail(email);
	      usuario.setNome(nome);
	      usuarioDAO.save(usuario);
	    }
	    catch (Exception ex) {
	      return "Erro ao atualizar o usuário: " + ex.toString();
	    }
	    return "Usuário salvo com sucesso!";
	 }
	
	

}
