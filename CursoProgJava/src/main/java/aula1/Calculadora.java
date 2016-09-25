package aula1;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
		System.out.println(n1+" % "+n2+" = "+(n1%n2));
		scanner.close();
	}
}
