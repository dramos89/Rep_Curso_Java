package aula4.exerciciopessoa;

public class PessoaJuridica extends Pessoa {
	private long cnpj;
	
	public PessoaJuridica(String nome, long cnpj){
		super(nome);
		this.cnpj = cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public long getCnpj() {
		return cnpj;
	}
}
