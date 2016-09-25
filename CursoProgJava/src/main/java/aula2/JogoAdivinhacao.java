package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = new Random().nextInt(10)+1;
		int numeroDigitado = 0;
		int tentativas = 0;
		Utilidades objUtil = new Utilidades(10);
		do {
			System.out.println("Digite um numero");
			 numeroDigitado = input.nextInt();
			 ++tentativas;
		     System.out.println(objUtil.comparaNumero(numero, numeroDigitado, tentativas));
		} while (numero != numeroDigitado);
		System.out.println("Vc acertou em "+tentativas+" tentativas");
		input.close();
	}
}
