package aula1;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		String resultado = (numero%2) == 0 ? numero+" é par" : numero+" é impar";
		System.out.println(resultado);
		//System.out.println(numero%2 == 0 ? numero+" é par" : numero+" é impar");
		scanner.close();
	}
}