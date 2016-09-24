package aula2;

public class Lampada {
	String watts;
	String fabricante;
	boolean status;
	
	Lampada(String watts, String fabricante){
		this.watts = watts;
		this.fabricante = fabricante;
	}

	public void Ligada(){
		System.out.println("Ligada!");
	    this.status = true;
	}
	
	public void Desligada(){
	    this.status = false;
		System.out.println("Desligada!");
	}
	
	boolean estaLigada(){
		return status;
	}
	
	
}
