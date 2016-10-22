package aula6.exceptions.pessoa;

import aula6.exceptions.ErroValidacao;

public class TestarPessoa {
	public static void main(String[] args) throws ErroValidacao {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juquinha");
		
		PessoaService service = new PessoaService();
		service.salvar(pessoa);
		
		System.out.println("Finalizando..,");
	}
}
