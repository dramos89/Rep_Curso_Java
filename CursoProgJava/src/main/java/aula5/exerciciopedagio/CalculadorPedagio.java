package aula5.exerciciopedagio;

public class CalculadorPedagio {
	private double precoEixo;

	public CalculadorPedagio(double precoEixo) {
		this.precoEixo = precoEixo;
	}

	/**
	 * Metodo ideal para implementação das classes para que garanta que o programador
	 * não passe parametro incorreto
	 * @param veiculo
	 * @return
	 */
	public double calcular(PagaPedagio veiculo) {
			return (this.precoEixo * veiculo.getQtdEixos());
	}
	
	/**
	 * Metodo criado para não gerar erro de programação, permitindo receber qualquer
	 * tipo de veiculo, independentemente de pagar pedagio ou não
	 * @param veiculo
	 * @return
	 *//*
	public double calcular(Veiculo veiculo){
		if (veiculo instanceof PagaPedagio){
			PagaPedagio paga = (PagaPedagio) veiculo;
			return (this.precoEixo * paga.getQtdEixos());
		}
		return 0;
	}*/
}
