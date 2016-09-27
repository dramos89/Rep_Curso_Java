package aula2;

import java.util.Scanner;

public class TestarPartidas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro time");
		String timeA = input.nextLine();
		System.out.println("Digite o nome do segundo time");
		String timeB = input.nextLine();
		System.out.println("Digite a quantidade de partidas a processar");
		int qtdPartidas = input.nextInt();
		int[] placarA = new int[qtdPartidas-1];
		int[] placarB = new int[qtdPartidas-1];
		HistoricoPartidas objPartidas = new HistoricoPartidas(timeA, timeB, qtdPartidas-1);
		
		for (int x = 0; x < qtdPartidas-1; x++){
			System.out.println("*** Partida "+(x+1)+"***\n");
			System.out.println("Gols de "+ objPartidas.getNome(0));
			placarA[x] = input.nextInt();
			System.out.println("Gols de "+ objPartidas.getNome(1));
			placarB[x] = input.nextInt();
			System.out.println("valor x = "+ x);
			System.out.println("valor placarA "+ placarA[x]);
			System.out.println("valor placarB "+ placarB[x]);
		}
		System.out.println("antes de processar");
		objPartidas.setPlacar(placarA, placarB);
		System.out.println("fez set placar");
		objPartidas.Processar();
		System.out.println("fez processar");
		input.close();
	}
}
