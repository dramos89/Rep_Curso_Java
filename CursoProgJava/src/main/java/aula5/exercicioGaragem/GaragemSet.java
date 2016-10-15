package aula5.exercicioGaragem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GaragemSet {
	Set<Veiculo> veiculos = new HashSet<>();
	
	public boolean adicionar(Veiculo veiculo){
		return veiculos.add(veiculo);
	}
	
	public boolean vender(String placa){
		Veiculo filtro = new Veiculo();
		filtro.setPlaca(placa);
		if (!veiculos.contains(filtro))
			return false;
		else {
			return veiculos.remove(filtro);
		}
	}
	
	public Veiculo buscar(String placa){
		Veiculo filtro = new Veiculo();
		filtro.setPlaca(placa);
		if (veiculos.contains(filtro)){
			
		}
		if (veiculos.indexOf(filtro) > -1)
			return veiculos.get(filtro);
		else
			return null;
	}
	
	public List<Veiculo> listar(){
		Collections.sort(veiculos, new VeiculoComparator());
		List<Veiculo> veiculosOrd = veiculos;
		return veiculosOrd;
	}
}
