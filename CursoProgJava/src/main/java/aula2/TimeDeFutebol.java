package aula2;

public class TimeDeFutebol {
	String nome;
	int[] placar;
	int vitorias;
	int empates;
	int derrotas;
	int saldoGol;
	int golsPro;
	
	TimeDeFutebol(String nome){
		this.nome = nome;
	}
	
	void setPlacar(int valor, int posicao){
		this.placar[posicao] = valor;
	}
	
	void geraGolsPro(){
		this.golsPro = 0;
		for (int x = 0; x < this.placar.length; x++){
			this.golsPro += this.placar[x];
		}
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return (this.nome == arg0);
	}
	
	void processaSaldo(int golsSofridos){
		this.saldoGol = this.golsPro - golsSofridos;
	}
	
	void processaResultado(int golsSofridos, int posicao){
		if (this.placar[posicao] == golsSofridos)
			this.empates++;
		else if (this.placar[posicao] > golsSofridos)
			this.vitorias++;
		else
			this.derrotas++;
	}
	
}
