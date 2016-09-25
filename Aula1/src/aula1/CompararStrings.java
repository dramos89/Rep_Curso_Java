package aula1;

import java.util.Scanner;

public class CompararStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome1 = scanner.next();
		String nome2 = scanner.next();
		scanner.close();
		System.out.println(nome1.equals(nome2));
		
/*
 * Comparar conteúdo de string (case sensitive):
 * varA.equals(varB);
 * 
 * Comparar conteúdo de string (sem case):
 * varA.equalsIgnoreCase(varB);
 * */		
	}
}
