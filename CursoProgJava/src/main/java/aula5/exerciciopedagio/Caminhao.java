package aula5.exerciciopedagio;

public class Caminhao extends Veiculo implements PagaPedagio {
	public Caminhao(){
		this.eixos = 5;
	}
	public int getQtdEixos() {
		return this.eixos;
	}
}
