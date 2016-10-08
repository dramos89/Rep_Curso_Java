package aula4.exercicioareacalculavel;

public class TestaArea {
	public static void main(String[] args) {
		AreaCalculavel circulo = new Circulo(4);
		AreaCalculavel quadrado = new Quadrado(3);
		AreaCalculavel retangulo = new Retangulo(4, 2);
		CalculadorArea calc = new CalculadorArea();
		
		System.out.println(calc.calcular(circulo));
		System.out.println(calc.calcular(quadrado));
		System.out.println(calc.calcular(retangulo));
		
	}
}
