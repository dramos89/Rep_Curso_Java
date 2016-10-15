package aula5.exercicioGaragem;

import java.util.Comparator;

public class VeiculoComparator implements Comparator<Veiculo> {

	@Override
	public int compare(Veiculo o1, Veiculo o2) {
		int resultado = o1.getMarca().compareTo(o2.getMarca()); 
		if (resultado != 0)
			return resultado;
		resultado = o1.getModelo().compareTo(o2.getModelo()); 
		if (resultado != 0)
			return resultado;
		resultado = Integer.compare(o1.getAno(), o2.getAno()); 
		if (resultado != 0)
			return resultado;
		resultado = Double.compare(o1.getPreco(), o2.getPreco()); 
		if (resultado != 0)
			return resultado;
		return 0;
	}
	/*public int compare(Veiculo o1, Veiculo o2) {
		int marca = o1.getMarca().compareTo(o2.getMarca()); 
		if (marca != 0)
			return marca;
		int modelo = o1.getModelo().compareTo(o2.getModelo()); 
		if (modelo != 0)
			return modelo;
		int ano = Integer.compare(o1.getAno(), o2.getAno()); 
		if (ano != 0)
			return ano;
		int preco = Double.compare(o1.getPreco(), o2.getPreco()); 
		if (preco != 0)
			return preco;
		return 0;
	}*/

}
