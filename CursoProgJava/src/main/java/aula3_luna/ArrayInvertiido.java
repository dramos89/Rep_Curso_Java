package aula3_luna;

import java.util.Scanner;

public class ArrayInvertiido {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a quantidade de numeros: ");
		int n = input.nextInt();
		int[] numeros = new int[n], numerosInvertidos = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o numero na posicao "+i);
			numeros[i] = input.nextInt();
		}
		//for composto por dois indices: i incrementa; j decrementa
		for (int i = 0, j = numeros.length-1; i < numeros.length; i++, j--){
			numerosInvertidos[j] = numeros[i];
		}
		
		for (int numero : numerosInvertidos){
			System.out.print(numero);
			System.out.print(" ");
		}
		input.close();
	}
}
