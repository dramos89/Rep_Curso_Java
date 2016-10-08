package aula4.exercicioequipamento;

public class Equipamento {
	private double preco;
	private String fabricante;
	private double ipq;

	public Equipamento(double preco){
		this.preco = preco;
		this.fabricante = "";
		this.ipq = 0;
	}

	public Equipamento(String fabricante, double preco){
		this.preco = preco;
		this.fabricante = fabricante;
		this.ipq = 0;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double calcularPrecoFinal(){
		return this.preco;
	}
	
	public void setIpq(double ipq) {
		this.ipq = ipq;
	}
	
	public double getIpq() {
		return ipq;
	}
	
	
}
