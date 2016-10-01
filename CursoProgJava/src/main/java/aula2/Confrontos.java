package aula2;

public class Confrontos {
	TimeDeFutebol[] times;
	int qtdConfrontos;
	int qtdClubes;
	
	Confrontos(String[] nomesTimes, int qtdConfrontos, int qtdClubes){
		this.qtdConfrontos = qtdConfrontos;
		this.qtdClubes = qtdClubes;
		for (int x = 0; x < this.qtdClubes; x++){
			this.times[x] = new TimeDeFutebol(nomesTimes[x]);
		}
	}
	
	void setPlacar(int[][] placar){
		for (int x = 0; x < this.qtdConfrontos; x++){
			for (int y = 0; y < this.qtdClubes; y++){
				this.times[y].setPlacar(placar[x][y], x);
			}
		}
	}
	
	void geraSaldo(){
		for (int x = 0; x < this.qtdClubes; x++){
			this.times[x].geraGolsPro();
		}
		//faz processamento cruzado pra receber e passar o valor no calculo de saldo
		for (int x = 0; x < this.qtdClubes; x++){
			for (int y = this.qtdClubes; y > 0; y--){
				if (!(this.times[x].equals(this.times[y].nome))){
					this.times[x].processaSaldo(this.times[y].golsPro);
				}
			}
		}
	}
	//PENSAR NA LOGICA PRA PROCESSAR QUANDO É MAIS DE DOIS TIMES, PRA MANTER GENERICO
	void processaPlacares(){
		for (int x = 0; x < this.qtdConfrontos; x++){
			for (int y = 0; y < this.qtdClubes; y++){
				for (int z = this.qtdClubes; z > 0; z--){
					if (!(this.times[y].equals(this.times[z].nome))){
						this.times[y].processaResultado(this.times[z].placar[x],x);
					}
				}
			}
		}
	}	
}
