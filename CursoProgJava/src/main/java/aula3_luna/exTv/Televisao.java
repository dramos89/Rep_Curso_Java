package aula3_luna.exTv;

public class Televisao {
	private boolean status; //situação da televisão
	private int volume; //volume atual da televisão
	private int canal; //canal atual da televisão
	private int voltagem; //voltagem atual da tv
	private int diodo; //diodo da televisão
	private String modelo; //modelo da televisão
	
	public Televisao (String modelo){
		this.modelo = modelo;
		this.status = false; //tv desligada
		this.ajustarVoltagem(127);
	}
	
	public Televisao (){
		this.modelo = "Padrão";
		this.status = false; //tv desligada
	}
	
	public void ligar(){
		this.regularDiodo();
		this.ajustarVoltagem(127);
		this.ligarTela();
	}
	
	public void desligar(){
		this.regularDiodo();
		this.ajustarVoltagem(0);
		this.ligarTela();
	}
	
	public void aumentarVolume(){
		this.volume++;
	}
	
	public void diminuirVolume(){
		if (this.volume > 0)
			this.volume--;
	}
	
	private void ajustarVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	
	public int aumentarCanal(){
		return this.canal++;
	}
	
	public int diminuirCanal(){
		if (this.canal > 0){
			return this.canal--;
		}
		return this.canal = 99;
	}
	
	private void ligarTela(){
		//procedimento interno para ligar a tela.
		this.status = !this.status;
	}
	
	private void regularDiodo(){
		this.diodo = 444;
	}
	
	public int getVolume(){
		return this.volume;
	}
}
