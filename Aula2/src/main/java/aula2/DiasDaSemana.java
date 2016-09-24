package aula2;

import java.util.Scanner;

public class DiasDaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o valor numerico do dia da semana: ");
		try {
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
			}
			System.out.println(diaEx);
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro");
		} 
	}
}
