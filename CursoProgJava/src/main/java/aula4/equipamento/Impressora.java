package aula4.equipamento;

public class Impressora extends Equipamento {
	private int pontosPorPolegada;
	
	public Impressora(String fabricante, double preco, int pontosPorPolegada){
		super(fabricante, preco);
		this.pontosPorPolegada = pontosPorPolegada;
	}
	
	public int getPontoPorPolegada() {
		return pontosPorPolegada;
	}
	
	public void setPontoPorPolegada(int pontosPorPolegada) {
		this.pontosPorPolegada = pontosPorPolegada;
	}
	
	public void imprimir(){
		System.out.println("Imprimindo...");
	}
}
