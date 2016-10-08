package aula4.exercicioareacalculavel;

public class Retangulo implements AreaCalculavel {

	private double largura;
	private double altura;
	
	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getArea() {
		return this.altura * this.largura;
	}
}
