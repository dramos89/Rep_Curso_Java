package aula4.exerciciopessoa;

public class PessoaFisica extends Pessoa {
	private long cpf;
	
	public PessoaFisica(String nome, long cpf){
		super(nome);
		this.cpf = cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public long getCpf() {
		return cpf;
	}
}
