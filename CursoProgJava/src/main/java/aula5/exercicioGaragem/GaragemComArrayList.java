package aula5.exercicioGaragem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GaragemComArrayList {

	List<Veiculo> veiculos;
	
	public GaragemComArrayList(){
		veiculos = new ArrayList<>();
	}
	
	public boolean adicionar(Veiculo veiculo){
		Veiculo filtro = buscar(veiculo.getPlaca());
	    if(filtro == null){
	    	veiculos.add(veiculo);
			return true;
	    }else
			return false;
	}
	
	public boolean vender(String placa){
		Veiculo filtro = buscar(placa);
		if (filtro == null){
			return false;
		}
		veiculos.remove(filtro);
		return true;
	}
	
	public Veiculo buscar(String placa){
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(placa))
				return veiculo;
		}
		return null;
	}
	
	public List<Veiculo> listar(){
		Collections.sort(veiculos, new VeiculoComparator());
		List<Veiculo> veiculosOrd = veiculos;
		return veiculosOrd;
	}
}
