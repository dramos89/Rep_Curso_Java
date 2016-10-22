package aula6.exceptions;

public class MinhaClasseQual {

	public void fazAlgumaCoisa() throws ErroValidacao {
		throw new ErroValidacao("Ocorreu um erro de validação.");
	}
}
