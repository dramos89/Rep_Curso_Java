package aula2;
/**
 * 
 * Classe Time
Atributos
String nome;
int saldoGol;
int vitorias;
Constructor recebe o nome do time, e seta com 0 os outros atributos

Classe HistoricoPartidas
Atributos
Time[] time;
int[][] placar;
Construtor recebe um array de strings com os nomes e chama o constructor do time para inserir nos respectivos objetos

Metodos
setPlacar(int[] gols): Insere o placar na ordem Time1 x Time 2
calculaSaldoDeGols(): faz a soma dos placares e insere o saldo de gols para cada objeto Time
calculaVitorias(): faz a verificação do placar e estipula a quantidade de vitórias de cada objeto Time
getVencedor(): imprime o nome do time vencedor, o numero de vitorias e o saldo de gols
getPerdedor(): imprime o nome do time perdedor, o numero de vitorias e o saldo de gols
*/
public class TimeDeFutebol {
	String nome;
	int[] placar;
	int golsPro;
	int saldoDeGols;
	int vitorias;
	int empates;
	int derrotas;
	int placaresRegistrados;
	int qtdPartidas;
	
	public TimeDeFutebol(String nome, int qtdPartidas){
		this.nome = nome;
		this.golsPro = 0;
		this.saldoDeGols = 0;
		this.vitorias = 0;
		this.empates = 0;
		this.derrotas = 0;
		this.placaresRegistrados = 0;
		this.qtdPartidas = qtdPartidas;
	}
	
	String getNome(){
		return this.nome;
	}
	
	int getSaldo(){
		return this.saldoDeGols;
	}
	
	int getVitorias(){
		return this.vitorias;
	}
	
	int getGolsPro(){
		return this.golsPro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeDeFutebol other = (TimeDeFutebol) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public void incVitoria(){
		this.vitorias++;
	}
	
	public void incDerrota(){
		this.derrotas++;
	}
	
	public void incEmpates(){
		this.empates++;
	}
	
	public void geraGolsPro(){
		for (int x = 0 ; x <= qtdPartidas; x++){
			this.golsPro += this.placar[x];
		}
	}
	
	public void detalhes(boolean temVencedor){
		System.out.println("******\n");
		if (temVencedor)
			System.out.println("Vencedor: "+ this.nome);
		System.out.println("Quantidade de partidas: "+ this.qtdPartidas);
		System.out.println("Número de vitórias: "+ this.vitorias);
		System.out.println("Gols pró: "+  this.golsPro);
		System.out.println("Saldo de gols: "+ this.saldoDeGols+"******\n");
	}	
}
