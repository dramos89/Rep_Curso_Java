package exBonificacao;

public class mainFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Tommy Pickles", "Gestor", 15000, 65);
		System.out.print(funcionario.getNome()+" - ");
		System.out.println(funcionario.getCargo());
		System.out.println("Salario: "+funcionario.getSalario());
		System.out.println("Bonificação: "+funcionario.getPorcentagemBonificacao());
		
		funcionario.setSalario(10000);
		funcionario.setPorcentagemBonificacao(75);
		
		System.out.print(funcionario.getNome()+" - ");
		System.out.println(funcionario.getCargo());
		System.out.println("Salario: "+funcionario.getSalario());
		System.out.println("Bonificação: "+funcionario.getPorcentagemBonificacao());
	}
}
