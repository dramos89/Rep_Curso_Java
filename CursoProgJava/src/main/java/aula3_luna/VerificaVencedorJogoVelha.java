package aula3_luna;

import java.util.Scanner;

public class VerificaVencedorJogoVelha {
	public static void main(String[] args) {
		Scanner scanner=  new Scanner(System.in);
		char[][] jogadas = new char[3][3];
		
		for (int x = 0; x < jogadas.length; x ++){
			for (int y = 0; y < jogadas[x].length; y++){
				System.out.println("["+ linha + "]["+coluna+"]: ");
				jogadas[x][y] = scanner.nextLine().charAt(0);
			}
		}
	}
}
