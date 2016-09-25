package aula2;

import java.util.Scanner;


public class TestarConta {
	public static void main(String[] args) {
		//inicialização das variáveis
		Scanner input = new Scanner(System.in);
		double valor = 0;
		Conta objConta = new Conta();
		int opcao = 0;
		//rotina de menu
		do {
			//util.limpar();
			System.out.println("Escolha uma opção:");			
			System.out.println("1. Sacar");
			System.out.println("2. Depositar");
			System.out.println("3. Saldo");
			System.out.println("9. SAIR");
			opcao = input.nextInt();
			
			//verifica a opção selecionada pelo usuario
			switch(opcao){
			case 1:{
				System.out.println("Informe o valor de saque:");
				valor = input.nextDouble();
				objConta.sacar(valor);
				break;
			}
			case 2:{
				System.out.println("Informe o valor de deposito:");
				valor = input.nextDouble();
				objConta.depositar(valor);
				break;
			}
			case 3:{
				objConta.obterSaldo();
				break;
			}
			case 9: break;
			default: System.out.println("Opcao inválida");
			}
			System.out.println("\n\n*****\n");
		}while(opcao != 9);
		input.close();
	}
}
