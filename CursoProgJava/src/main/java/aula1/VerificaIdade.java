package aula1;

import java.util.Scanner;

public class VerificaIdade {
	public static void main(String[] args) {
		System.out.println("Digite sua idade: ");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		String resultado = idade >= 18 ? "Maior de 18 anos" : "Menor de 18 anos";
		System.out.println(resultado);
		//System.out.println(idade >= 18 ? "Maior de 18 anos" : "Menor de 18 anos");
		scanner.close();
	}
}
