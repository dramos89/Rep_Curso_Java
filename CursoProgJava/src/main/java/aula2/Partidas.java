package aula2;

import java.util.Scanner;

public class Partidas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro time");
		String timeA = input.nextLine();
		System.out.println("Informe o nome do segundo time");
		String timeB = input.nextLine();
		System.out.println("Informe a quantidade de jogos disputados");
		int jogos = input.nextInt();
		int[][] placares = new int[jogos][2];
		int golsProA = 0;
		int golsProB = 0;
		int vitA = 0;
		int vitB = 0;
		//recebe os resultados dos jogos
		for (int x = 0; x < placares.length; x++){
			System.out.println("*** PARTIDA "+x+"***\n\n");
			System.out.println("Informe os gols de "+ timeA);
			placares[x][0] = input.nextInt();
			System.out.println("Informe os gols de "+ timeB);
			placares[x][1] = input.nextInt();
		}
		//processa os gols pró de cada time
		for (int x = 0; x < placares.length; x++){
			 golsProA += placares[x][0];
			 golsProB += placares[x][1];
		}
		//processa as vitorias de cada time
		for (int x = 0; x < placares.length; x++){
			if (placares[x][0] > placares[x][1])
				vitA++;
			else if (placares[x][0] < placares[x][1])
				vitB++;
		}
		System.out.println("\n\n******\n");
		if (vitA > vitB){
			System.out.println(timeA+" venceu mais vezes!");
			System.out.println("total de jogos: "+placares.length);
			System.out.println("total de vitorias: "+vitA);
			System.out.println("saldo de gols: "+ (golsProA - golsProB));
		} else if (vitA < vitB){
			System.out.println(timeB+" venceu mais vezes!");
			System.out.println("total de jogos: "+placares.length);
			System.out.println("total de vitorias: "+vitB);
			System.out.println("saldo de gols: "+ (golsProB - golsProA));
		} else {
			System.out.println(timeA+" e "+timeB+" venceram "+vitA+" cada um. Ficaram empatados!");
			System.out.println("Dados de "+timeA);
			System.out.println("total de jogos: "+placares.length);
			System.out.println("total de vitorias: "+vitA);
			System.out.println("saldo de gols: "+ (golsProA - golsProB));
			System.out.println("\n");
			System.out.println("Dados de "+timeB);
			System.out.println("total de jogos: "+placares.length);
			System.out.println("total de vitorias: "+vitB);
			System.out.println("saldo de gols: "+ (golsProB - golsProA));
		}
		input.close();
	}
}
