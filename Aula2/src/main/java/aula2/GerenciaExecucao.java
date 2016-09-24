package aula2;

import java.util.Scanner;

public class GerenciaExecucao {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int opSaida = input.nextInt();
		do {
			System.out.println("Digite um dia:");
			int dia = input.nextInt();
			String diaEx = "";
			switch(dia){
			case 1: 
				diaEx = "Segunda";
				break;
			case 2: 
				diaEx = "Terça";
				break;
			case 3: 
				diaEx = "Quarta";
				break;
			case 4: 
				diaEx = "Quinta";
				break;
			case 5: 
				diaEx = "Sexta";
				break;
			case 6: 
				diaEx = "Sabado";
				break;
			case 7: 
				diaEx = "Domingo";
				break;
			default: 
				diaEx = "Dia inválido";
		} while (opSaida != 0);
		input.close();
	
	/*int saida;
	GerenciaExecucao(int opSaida){
		saida = opSaida;
	}*/
