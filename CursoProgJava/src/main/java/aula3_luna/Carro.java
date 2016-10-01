package aula3_luna;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int ano;
	int velocidade;
	int fatorVelocidade;
	
	public Carro(String marca, String modelo, String cor, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = 0;
	}
	
	public Carro(String marca, String modelo, String cor, int ano, int fVel){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = 0;
		this.fatorVelocidade = fVel;
	}
	
	public void acelerar(){
		this.velocidade++;
	}
	
	public void acelerar(int velocidade){
		this.velocidade++;
		this.velocidade+= velocidade*this.fatorVelocidade;
	}
	
	public void frear(){
		if (this.velocidade > 0){
			this.velocidade--;
		}
	}
		
	public void frear(int velocidade){
		if (this.velocidade > velocidade){
			this.velocidade--;
			this.velocidade+= velocidade*this.fatorVelocidade;
		}
	}
	
	public int getVelocidade(){
		return this.velocidade;
	}
	
	public String getStatus(){
		return "velocidade de "+this.marca+" "+this.modelo+" = "+this.getVelocidade()+"km/h";
	}
}
