package aula4.exercicioareacalculavel;

public class Quadrado implements AreaCalculavel {

	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	public double getArea() {
		return Math.pow(this.lado, this.lado);
	}
}
