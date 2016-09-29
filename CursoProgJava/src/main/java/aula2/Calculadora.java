/*
 * Exercício 1: Crie uma classe Calculadora que realiza operações matemáticas. 
 * Nossa calculadora irá realizar soma, subtração, divisão e multiplicação (esses são os comportamentos da calculadora). 
 * Para cada uma das operações (comportamentos) deve ser criado um método de acordo com as descrições abaixo:

Método somar: Recebe dois parâmetros do tipo double e retorna a soma dos mesmos. 
Método subtrair: Recebe dois parâmetros do tipo double e retorna a subtração dos mesmos. 
Método dividir: Recebe dois parâmetros do tipo double e retorna a divisão dos mesmos.
Método multiplicar: Recebe dois parâmetros do tipo double e retorna a multiplicação dos mesmos.

Crie uma classe executável chamada TestarCalculadora que leia os dois valores e a operação "+", "-", "*", "/" usando Scanner 
e execute o método correto da Calculadora e mostre o resultado da operação.

Importante: 
Nossa calculadora não possui atributos (apenas métodos), logo, não precisamos criar um construtor para ela. Vamos usar o construtor padrão.
Antes de chamar o método da calculadora não se esqueça de instanciar o objeto utilizando o operador 
new: Calculadora calculadora = new Calculadora();

 * */
package aula2;

public class Calculadora {
	double somar(double valor1, double valor2){
		return valor1+valor2;
	}
	
	double subtrair(double valor1, double valor2){
		return valor1-valor2;
	}
	
	double dividir(double valor1, double valor2){
		return valor1/valor2;
	}
	
	double multiplicar(double valor1, double valor2){
		return valor1*valor2;
	}
}
