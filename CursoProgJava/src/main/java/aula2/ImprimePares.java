package aula2;

import java.util.Scanner;

public class ImprimePares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numMax = input.nextInt();
		int qtdImpresso = 0;
		for(int i=1; i <= numMax && qtdImpresso < 10; i++){
			if (i%2 == 0){
				System.out.println(i);
				qtdImpresso++;
			}
		}
		input.close();
	}
}
