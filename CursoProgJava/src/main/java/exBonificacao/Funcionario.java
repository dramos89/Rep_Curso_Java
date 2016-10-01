package exBonificacao;

public class Funcionario {
	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;
	
	public Funcionario(String nome, String cargo, double salario, double porcentagemBonificacao){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.porcentagemBonificacao = porcentagemBonificacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setSalario(double salario) {
		if (this.salario <= salario)
			this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		if (this.porcentagemBonificacao <= porcentagemBonificacao)
			this.porcentagemBonificacao = porcentagemBonificacao;
	}
	
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
}
