package aula2;
/**
 * Classe que contém os atributos e métodos de uma conta bancária
 * @author Diego R. - 25/09/2016
 *
 */
public class Conta {
	double Saldo;
	/**
	 * Constructor para iniciar a conta com saldo zerado
	 */
	public Conta(){
		this.Saldo = 0;
		//System.out.println("Conta cadastrada com sucesso!");
	}
	/**
	 * Constructor para iniciar a conta inserindo um sald prévio
	 * @param saldoInicial: parametro contendo o saldo prévio
	 */
	public Conta(double saldoInicial){
		this.Saldo = saldoInicial;
		//System.out.println("Conta cadastrada com sucesso!");
	}
	
	/**
	 * Método que realiza saque na conta
	 * @param valorSaque: parametro de entrada para subtrair do saldo da conta
	 */
	public void sacar(double valorSaque){
		if (valorSaque > this.Saldo){
			System.out.println("Saldo insuficiente");
			return;
		} 
		this.Saldo -= valorSaque;
		System.out.println("Saque realizado com sucesso!");
	}
	/**
	 * Método que realiza deposito na conta
	 * @param valorDeposito: parametro de entrada para somar ao saldo da conta
	 */
	public void depositar(double valorDeposito){
		this.Saldo += valorDeposito;
		System.out.println("Deposito realizado com sucesso!");
	}
	/**
	 * Método que exibe o saldo atual da conta
	 */
	public void obterSaldo(){
		String saldoEx = String.format("%.2f",this.Saldo);
		System.out.println("Saldo atual: R$"+saldoEx);
	}
}
