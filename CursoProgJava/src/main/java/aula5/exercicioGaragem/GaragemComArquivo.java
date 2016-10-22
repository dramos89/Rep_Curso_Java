package aula5.exercicioGaragem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GaragemComArquivo {

	private static final String ARQUIVO = "/home/java01/veiculos.csv";
	
	
	public boolean adicionar(Veiculo veiculo){
		Veiculo vEncontrado = buscar(veiculo.getPlaca());
			return (vEncontrado == null);
	}
	
	public boolean vender(String placa){
		return true;
	}
	
	public Veiculo buscar(String placa) {
		for(Veiculo veiculo : listar()){
			if (veiculo.getPlaca().equals(placa)){
				return veiculo;
			}
		}
		return null;	
	}
	private void salvarNOArquivo(Veiculo veiculo){
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))){
			writer.write(veiculo.getMarca());
			writer.write(";");
			writer.write(veiculo.getModelo());
			writer.write(";");
			writer.write(veiculo.getPlaca());
			writer.write(";");
			writer.write(Integer.valueOf(veiculo.getAno()));
			writer.write(";");
			writer.write(Double.valueOf(veiculo.getPreco()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public List<Veiculo> listar(){
		List<Veiculo> veiculos = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(ARQUIVO))){
			String line = null; 
			while((line = in.readLine()) != null){
				String campos[] = line.split(";");
				String marca = campos[0];
				String modelo = campos[1];
				String placa = campos[2];
				int ano = Integer.valueOf(campos[3]);
				double preco = Double.valueOf(campos[4]);
				
				veiculos.add(new Veiculo(marca,modelo,placa,ano,preco));
			}
		} catch (IOException e){
			throw new RuntimeException(e);
		}
		return veiculos;
	}
}
