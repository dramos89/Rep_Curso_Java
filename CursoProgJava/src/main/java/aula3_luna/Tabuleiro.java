package aula3_luna;

public class Tabuleiro {
	char[][] jogadas;
	
	public Tabuleiro(char[][] jogadas){
		this.jogadas = jogadas;
	}
	
	public void imprimirTabuleiro(){
		for (int linha = 0; linha < jogadas.length; linha++) {
			System.out.println("| ");
			for (int coluna = 0; coluna < jogadas[linha].length; coluna++){
				if (jogadas[linha][coluna]==0){
					System.out.println(" ");
				}
				else
					System.out.println();
			}
		}
	}
}
