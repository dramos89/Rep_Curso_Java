package aula2;

import java.util.Scanner;

public class TestarPessoa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = input.nextLine();
		String cpf = input.nextLine();
		System.out.println("Digite o RG: ");
		System.out.println("Digite o cpf: ");
		String rg = input.nextLine();
		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		System.out.println(pessoa);
		input.close();
	}
}
