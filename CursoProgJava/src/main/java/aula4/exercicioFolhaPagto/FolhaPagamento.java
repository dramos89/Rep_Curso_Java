package aula4.exercicioFolhaPagto;

public class FolhaPagamento {
	public void calcular(Funcionario...funcionarios){
		for(Funcionario funcionario : funcionarios){
			System.out.print(funcionario.getClass().getSimpleName()+" ");
			System.out.println(funcionario.getNome()+" receberá: R$"+funcionario.getSalarioComBonificacao());
		}
	}
}
