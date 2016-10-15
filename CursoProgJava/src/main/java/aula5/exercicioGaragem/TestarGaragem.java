package aula5.exercicioGaragem;

import java.util.List;
import java.util.Scanner;

public class TestarGaragem {
	
	public static void main(String[] args) {
		GaragemComArrayList garagem = new GaragemComArrayList();
		Scanner input = new Scanner(System.in);
		int opcao = menu(input);
		while(opcao != 5){
			switch(opcao){
				case 1:{
					System.out.println("Digite a marca: ");
					String marca = input.nextLine();
					System.out.println("Digite a modelo: ");
					String modelo = input.nextLine();
					System.out.println("Digite a placa: ");
					String placa = input.nextLine();
					System.out.println("Digite a ano: ");
					int ano = input.nextInt();
					System.out.println("Digite a preco: ");
					Double preco = input.nextDouble();
					if (!garagem.adicionar(new Veiculo(marca, modelo, placa, ano, preco))){
						System.out.println("Veículo já cadastrado");
					} else {
						System.out.println("Veículo adicionado com sucesso.");
					}
					break;
				}
				case 2:{
					System.out.println("Digite a placa do veículo a ser vendido");
					String placa = input.nextLine();
					if (garagem.vender(placa)){
						System.out.println("Veículo vendido com sucesso.");
					} else {
						System.out.println("Veículo não encontrado.");
					}
					break;
				}
				case 3:{
					System.out.println("Digite a placa a ser buscada: ");
					String placa = input.nextLine();
					Veiculo veiculo = garagem.buscar(placa);
					if (veiculo != null)
						System.out.println(veiculo.toString());
					else
						System.out.println("Veículo não encontrado.");
					break;
				}
				case 4:{
					List<Veiculo> veiculos = garagem.listar();
					for (Veiculo veiculo : veiculos) {
						System.out.println(veiculo);
					}
					break;
				}
				default:{
					System.out.println("Opção inválida.");
				}
			}
			opcao = menu(input);
		};
	}
	

	public static int menu(Scanner input){

		System.out.println("Escolha uma opção:");			
		System.out.println("1. Adicionar");
		System.out.println("2. Vender (por placa)");
		System.out.println("3. Buscar (por placa)");
		System.out.println("4. Listar");
		System.out.println("5. Sair");

		int opcao =input.nextInt(); 
		input.nextLine();
		return opcao;
	}
}
