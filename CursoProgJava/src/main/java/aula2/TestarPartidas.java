package aula2;

public class TestarPartidas {
	public static void main(String[] args) {
		String[] nomesTimes = new String[2];
		for (int i = 0; i < nomesTimes.length; i++){
			if (i%2 == 0)
			nomesTimes[i] = "Rayo Vallecano";
			else
			nomesTimes[i] = "Real Madrid";
		}
		Confrontos confrontos = new Confrontos(nomesTimes, 3, nomesTimes.length);
		for (int i = 0; i < confrontos.qtdConfrontos; i++){
			for (int j = 0; j < confrontos.qtdClubes; j++){
				confrontos.times[j].placar[i] = i;
			}
		}
		confrontos.geraSaldo();
		confrontos.processaPlacares();
		
		for (int i = 0; i < confrontos.qtdClubes; i++){
			System.out.println(confrontos.times[i].nome+" Saldo de gols: "+confrontos.times[i].saldoGol+" ; Numero de vitorias: "+confrontos.times[i].vitorias);
		}
	}
	
}
