package aula5.exerciciopedagio;

public class TestaPedagio {
	public static void main(String[] args) {
		//conversao implicita, funciona porque Carro IMPLEMENTS PagaPedagio
		PagaPedagio carro = new Carro();
		PagaPedagio caminhao = new Caminhao();
		PagaPedagio moto = new Moto();
		//Bicicleta não paga pedagio, logo não é implementada para pagar tipo
		//Veiculo bike = new Bicicleta();
		CalculadorPedagio calculador = new CalculadorPedagio(2.55);
		System.out.println(carro.getClass().getSimpleName()+" paga R$"+calculador.calcular(carro));
		System.out.println(caminhao.getClass().getSimpleName()+" paga R$"+calculador.calcular(caminhao));
		System.out.println(moto.getClass().getSimpleName()+" paga R$"+calculador.calcular(moto));
		//System.out.println(bike.getClass().getSimpleName()+" paga R$"+calculador.calcular(bike));
	}
	
}
