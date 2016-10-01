package aula3_luna;

import java.util.Scanner;

public class ArrayString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		for (int i = 0; i < palavra.length(); i++){
			System.out.println(palavra.charAt(i));
		}
		input.close();
	}
}
