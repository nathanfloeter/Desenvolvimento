package br.com.sistema.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sistema.blog.model.Contato;
import br.com.sistema.blog.model.ContatoDAO;

//classe controladora responsável por linkar as chamadas dentro do projeto.
@Controller
@EnableAutoConfiguration
@ComponentScan()

public class ContatoController {
	
	
	// Private fields

	  @Autowired
	  private ContatoDAO contatoDAO;
	
	
	/**
	* GET /create  --> Create a new user and save it in the database.
	*/
	@RequestMapping("/novoc")
	@ResponseBody
	public String create(String nome, String email, String telefone, String obs) {
		String contatoId = "";
	    try {
	      Contato contato = new Contato(nome, email, telefone, obs);
	      this.contatoDAO.save(contato);
	      contatoId = String.valueOf(contato.getId());
	    }
	    catch (Exception ex) {
	      return "Erro ao criar o contato: " + ex.toString();
	    }
	    return "Contato Criado com sucesso com o código: " + contatoId;
	}
	
	/**
	* GET /delete  --> Delete the user having the passed id.
	*/
	@RequestMapping("/deletec")
	@ResponseBody
	public String delete(long id) {
		try {
			Contato contato = new Contato(id);
	      contatoDAO.delete(contato);
	    }
	    catch (Exception ex) {
	      return "Erro ao criar o contato: " + ex.toString();
	    }
	    return "Contato deletado com sucesso!";
	}
	
	 /**
		 * GET /update  --> Update the email and the name for the user in the 
		 * database having the passed id.
		 */
		 @RequestMapping("/atualizarc")
		 @ResponseBody
		 public String updateUsuario(long id, String email, String nome, String observacao) {
		    try {
		      Contato contato = contatoDAO.findById(id);
		      contato.setEmail(email);
		      contato.setNome(nome);
		      contato.setObservação(observacao);
		      contatoDAO.save(contato);
		    }
		    catch (Exception ex) {
		      return "Erro ao atualizar o contato: " + ex.toString();
		    }
		    return "Contato salvo com sucesso!";
		 }
		

}
