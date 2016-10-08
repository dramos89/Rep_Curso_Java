package aula4.exercicioFolhaPagto;

public class TestarFolha {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Jose", 1000.00);
		Funcionario supervisor = new Supervisor("Arnaldo", 1000.00);
		Funcionario secretaria = new Secretaria("João", 1000.00);
		
		FolhaPagamento folha = new FolhaPagamento();
		
		folha.calcular(gerente, supervisor, secretaria);
	}
}
