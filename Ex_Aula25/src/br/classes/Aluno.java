package br.classes;

public class Aluno extends Pessoa {
	
	public Aluno(String nome, int idade, int nota1, int nota2, int nota3) {
		super(nome,idade);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public int nota1;
	public int nota2;
	public int nota3;
	
	
	
	public int getNota1() {
		return this.nota1;
	}
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	public int getNota2() {
		return this.nota2;
	}
	
	public void setNota2(int nota2) {
		this.nota2 = nota1;
	}
	public int getNota3() {
		return this.nota3;
	}
	
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	
	}
