package aula4.exercicioareacalculavel;

public class Circulo implements AreaCalculavel {
	
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	public double getArea() {
		return this.raio * this.raio * Math.PI;
	}
}
