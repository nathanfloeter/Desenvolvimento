package br.classes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente i = new Cliente("João Silva","joaosilva@hotmail.com","48 99848484","Florianópolis","SC");
		
		System.out.println("Nome : " + i.nome);
		System.out.println("email : " + i.email);
		System.out.println("Telefone : " + i.telefone);
		System.out.println("Cidade : " + i.cidade.cidade);
		System.out.println("Estado : " + i.cidade.estado);

	}

}
