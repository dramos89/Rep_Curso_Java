package aula4.exercicioFolhaPagto;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioComBonificacao(){
		return this.salario * (1 + this.getPorcentagemAdicional());
	}
	
	protected abstract double getPorcentagemAdicional();
}
