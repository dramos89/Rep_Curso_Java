package aula2;

import java.util.Scanner;

public class TestarCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor1 = input.nextDouble();
		String op = input.next();
		double valor2 = input.nextDouble();
		Calculadora objCalculadora = new Calculadora();
		switch(op){
		case "+": {
			System.out.println(valor1+" "+op+" "+valor2+" = "+objCalculadora.somar(valor1, valor2));
			break;}
		case "-": {
			System.out.println(valor1+" "+op+" "+valor2+" = "+objCalculadora.subtrair(valor1, valor2));
			break;
		}
		case "*": {
			System.out.println(valor1+" "+op+" "+valor2+" = "+objCalculadora.multiplicar(valor1, valor2));
			break;
		}
		case "/": {
			System.out.println(valor1+" "+op+" "+valor2+" = "+objCalculadora.dividir(valor1, valor2));
			break;
		}
		default: {
			System.out.println("Operação inválida");
			break;
		}
		}
		input.close();
	}
}
