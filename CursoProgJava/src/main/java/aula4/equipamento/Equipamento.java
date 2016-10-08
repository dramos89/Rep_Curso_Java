package aula4.equipamento;

public class Equipamento {
	private double preco;
	private String fabricante;

	public Equipamento(double preco){
		this.preco = preco;
	}

	public Equipamento(String fabricante, double preco){
		this.preco = preco;
		this.fabricante = fabricante;
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
	
	
}
