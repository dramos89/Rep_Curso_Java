package aula5.exerciciopedagio;

public class Carro extends Veiculo implements PagaPedagio {
	public Carro(){
		this.eixos = 2;
	}
	public int getQtdEixos() {
		return this.eixos;
	}
}
