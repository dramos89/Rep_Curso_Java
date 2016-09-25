package aula1;

import java.util.Scanner;

public class JogoParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//atribui valores de entrada
		System.out.println("Valor do jogador 1: ");
		int jogador1 = scanner.nextInt();
		System.out.println("Valor do jogador 2: ");
		int jogador2 = scanner.nextInt();
		//apuração do resultado
		int result = jogador1+jogador2;
		//mensagem padrão
		String mens = "Resultado do jogo foi "+result+". Jogador ";
		//exibição do resultado
		System.out.println(result%2 == 0 ? mens+"1 venceu.": mens+"2 venceu.");
		scanner.close();
	}
}
