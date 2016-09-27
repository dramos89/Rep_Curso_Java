package aula2;

public class HistoricoPartidas {
	/*- Implementar quando entender como funciona o array na pratica
	 * 
	 * 
	 * TimeDeFutebol[] time;  
	 * int[]qtdTimes;
	*/
	TimeDeFutebol timeA;
	TimeDeFutebol timeB;
	String vencedor;
	
	int qtdPartidas;
	
	public HistoricoPartidas(String timeA, String timeB, int qtdPartidas){
		//this.qtdPartidas = qtdPartidas;
		this.timeA = new TimeDeFutebol(timeA, qtdPartidas);
		this.timeB = new TimeDeFutebol(timeB, qtdPartidas);
	}
	
	public void setPlacar(int[] placarA, int[] placarB){
		timeA.placar = placarA;
		timeB.placar = placarB;
	}
	
	public void processaPlacares(){
		for (int cPartidas = 0; cPartidas <= this.qtdPartidas-1; cPartidas++){			
			if (timeA.placar[cPartidas] > timeB.placar[cPartidas]){
				timeA.incVitoria();
				timeB.incDerrota();
			} else if (timeA.placar[cPartidas] == timeB.placar[cPartidas]){
				timeA.incEmpates();
				timeB.incEmpates();
			} else if (timeA.placar[cPartidas] < timeB.placar[cPartidas]){
				timeA.incDerrota();
				timeB.incVitoria();
			}
		}
	}
	
	public void processaSaldoDeGols(){
		timeA.geraGolsPro();
		timeB.geraGolsPro();
		timeA.saldoDeGols = (timeA.golsPro - timeB.golsPro);
		timeB.saldoDeGols = (timeB.golsPro - timeA.golsPro);
	}
	
	public void declaraVencedor(TimeDeFutebol vencedor){
		vencedor.detalhes(true);
	}
	
	public void declaraEmpate(){
		System.out.println("Empate!");
		timeA.detalhes(false);
		timeB.detalhes(false);
	}
	
	public void Processar(){
		processaPlacares();
		processaSaldoDeGols();
		if ((timeA.vitorias - timeA.derrotas) == 0){
			declaraEmpate();
		}
		if (timeA.vitorias > timeA.derrotas){
			declaraVencedor(timeA);
		} else {
			declaraVencedor(timeB);
		}
	}
	
	public String getNome(int i){
		switch(i){
		case 0: return timeA.getNome();
		case 1: return timeB.getNome();
		default: return "";
		}
	}
}
