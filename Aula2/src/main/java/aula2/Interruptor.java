package aula2;

public class Interruptor {
	Lampada lampada;
	Interruptor(Lampada lampada){
		this.lampada = lampada;
	}
	
	public void apertar(){
		if (this.lampada.estaLigada()){
			this.lampada.Desligada();
		} else {
			this.lampada.Ligada();
		}
	}
}
