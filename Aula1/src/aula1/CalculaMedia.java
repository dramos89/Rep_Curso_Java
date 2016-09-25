package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		DecimalFormat arredondar = new DecimalFormat("0.##");
		//System.out.println("Digite o nome do aluno: ");
		//String nome = scanner.nextLine();
		System.out.println("Digite a primeira nota: ");
		double n1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double n3 = scanner.nextDouble();
		double result = (n1+n2+n3)/3; 
		String resultS = arredondar.format((n1+n2+n3)/3);
		if (result < 4){
			System.out.println("Reprovado. Média: "+resultS);
		} else if (result < 7){
			System.out.println("Exame. Média: "+resultS);
		} else {
			System.out.println("Aprovado. Média: "+resultS);
		}
		scanner.close();
	}
}

//ANTIGO
//String mens = "Media final de "+nome+" foi "+Math.floor(result)+". ";
//System.out.println(result >= 7 ? mens+".Aluno aprovado." : mens+".Aluno reprovado.");
