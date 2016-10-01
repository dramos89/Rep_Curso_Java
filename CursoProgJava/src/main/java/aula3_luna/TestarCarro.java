package aula3_luna;

public class TestarCarro {
	public static void main(String[] args) {
		Carro primeiroCarro = new Carro("Ferrari","F40","Preto",1995,5);
		Carro segundo = new Carro("VW","Fusca","Branco",1965,2);
		
		primeiroCarro.acelerar(10);
		primeiroCarro.frear(5);
		primeiroCarro.acelerar(10);
		primeiroCarro.acelerar(10);
		
		segundo.acelerar(5);
		segundo.frear(5);
		segundo.acelerar(10);

		System.out.println(segundo.getStatus());
		System.out.println(primeiroCarro.getStatus());
	}
}
