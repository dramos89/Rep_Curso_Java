package aula6.exceptions.pessoa;

import aula6.exceptions.ErroValidacao;

public class PessoaService {
	public static void salvar(Pessoa pessoa) throws ErroValidacao{
		if(pessoa.getNome() == null){
			throw new ErroValidacao("Nome não pode ser null");
		}
		System.out.println("Pessoa salva com sucesso!");
	}
}
