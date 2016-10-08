package aula4.exercicioequipamento;

public class TestarEquipamentosEx {
	public static void main(String[] args) {
		Televisao televisao = new Televisao("AOC",1000.00);
		Cadeira cadeira = new Cadeira("Etna",8500.00);
		Impressora impressora = new Impressora("HP", 1000.00);
		double valorTotal = imprimirPrecosFinais(televisao, cadeira, impressora);
		System.out.println("Valor total: "+ valorTotal);
	}
	
	public static double imprimirPrecosFinais(Equipamento... equipamentos){
		double valorTotal = 0;
		
		for(Equipamento equipamento : equipamentos) {
			System.out.println(equipamento.getClass().getSimpleName() + ": "+ equipamento.calcularPrecoFinal());
			valorTotal += equipamento.calcularPrecoFinal();
		}
		return valorTotal;
	}
}
