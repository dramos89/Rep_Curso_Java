package aula2;

import java.util.Scanner;

public class ExercicioForEach {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++){
			numeros[i] = input.nextInt();
		}
		
		for (int i: numeros){
			System.out.println(i);
		}
		input.close();
	}
	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] numeros = new String[10];
		for (int i = 0; i < numeros.length; i++){
			numeros[i] = input.nextLine();
		}
		
		for (String i: numeros){
			System.out.println(i);
		}
	}*/
}
