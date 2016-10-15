package aula5.exerciciopedagio;

public class Moto extends Veiculo implements PagaPedagio{
	public Moto(){
		this.eixos = 1;
	}
	public int getQtdEixos() {
		return this.eixos;
	}
}
