package aula4.exercicioequipamento;

public class Eletronico extends Equipamento {
	public Eletronico(String fabricante, double preco){
		super(fabricante,preco);
		super.setIpq(0.10);
	}

	@Override
	public double calcularPrecoFinal(){
		return (super.getPreco()*(1+super.getIpq())); 
	}
}
