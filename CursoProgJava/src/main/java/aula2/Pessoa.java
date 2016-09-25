package aula2;
/**
 * Classe prototipo pessoa, aula2 curso Programação Java
 * @author Diego R.
 *
 */
public class Pessoa {
	String nome;
	String cpf;
	String rg;
	/**
	 * Construtor da classe Pessoa
	 * @param nome: Recebe o nome da pessoa
	 * @param cpf: Recebe o cpf da pessoa
	 * @param rg: Recebe o rg da pessoa
	 */
	Pessoa(String nome, String cpf, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String toString(){
		return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nRG: "+this.rg;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCPF(){
		return this.cpf;
	}
	
	public String getRG(){
		return this.rg;
	}
}
