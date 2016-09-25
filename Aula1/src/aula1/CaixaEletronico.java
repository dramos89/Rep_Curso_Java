package aula1;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vEntrada = sc.nextInt();
		int resto = vEntrada;
		int nota100 = resto/100;
		resto %= 100;
		System.out.println(resto);
		int nota50 = resto/50;
		resto %= 50;
		System.out.println(resto);
		int nota20 = resto/20;
		resto %= 20;
		System.out.println(resto);
		int nota10 = resto/10;
		resto %= 10;
		System.out.println(resto);
		int nota5 = resto/5;
		resto %= 5;
		System.out.println(resto);
		if (resto > 0){
			System.out.println("Valor não suportado.");
		} else {
			if (nota100 > 0)
				System.out.println(nota100+" nota(s) de R$100");
			if (nota50 > 0)
				System.out.println(nota50+" nota(s) de R$50");
			if (nota20 > 0)
				System.out.println(nota20+" nota(s) de R$20");
			if (nota10 > 0)
				System.out.println(nota10+" nota(s) de R$10");
			if (nota5 > 0)
				System.out.println(nota5+" nota(s) de R$5");
		}
		sc.close();
	}
}
