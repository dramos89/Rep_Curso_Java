package aula2;

import java.util.Scanner;

public class MesesDoAno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mes = input.nextInt();
		String mesEx = "";
		switch(mes){
		case 1:
			mesEx += "Janeiro\n";
		case 2:
			mesEx += "Fevereiro\n";
		case 3:
			mesEx += "Março\n";
		case 4:
			mesEx += "Abril\n";
		case 5:
			mesEx += "Maio\n";
		case 6:
			mesEx += "Junho\n";
		case 7:
			mesEx += "Julho\n";
		case 8:
			mesEx += "Agosto\n";
		case 9:
			mesEx += "Setembro\n";
		case 10:
			mesEx += "Outubro\n";
		case 11:
			mesEx += "Novembro\n";
		case 12:
			mesEx += "Dezembro\n";
	        break;
	    default: 
	    	mesEx = "Mes inválido";
		}
		System.out.println(mesEx);
		input.close();
	}
}
