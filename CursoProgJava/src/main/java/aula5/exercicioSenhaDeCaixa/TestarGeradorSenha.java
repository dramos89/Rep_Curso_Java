package aula5.exercicioSenhaDeCaixa;

import java.util.Scanner;

public class TestarGeradorSenha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeradorSenha gerador = new GeradorSenha();

		
		while (true){
			switch (menu(input)){
			case 1:{
				gerador.gerarSenhaPadrao();
				//System.out.println(gerador.gerarSenhaIdoso());
				break;
			}case 2:{
				gerador.gerarSenhaIdoso();
				//System.out.println(gerador.gerarSenhaPadrao());
				break;
			}
			case 3:{
				System.out.println(gerador.proximaSenha());
				break;
			}
			default: System.out.println("Opção inválida");
			}
		}
	}

	private static int menu(Scanner input) {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Gerar senha padrão");
		System.out.println("2 - Gerar senha idoso");
		System.out.println("3 - Proxima senha");
		int opcao = input.nextInt();
		input.nextLine();
		return opcao;
	}
}
