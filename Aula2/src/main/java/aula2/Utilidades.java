package aula2;

public class Utilidades {
	int qtdTent;
	boolean continuar;
	
	Utilidades(int qTent){
		qtdTent = qTent;
		continuar = true;
	}
	
	String comparaNumero(int val1, int val2, int tent){
		String mensagem = "";
		if (val1 > val2){
			mensagem += "Chute errado, valor menor";
		}
		else if (val1 < val2)
		{
			mensagem += "Chute errado, valor maior";
		}
		/*
		 * IMPLEMENTAR DEPOIS
		 * if (val1 != val2){
			mensagem += "\nVocê tem mais "+(qtdTent-tent)+" tentativas.\n";
		}
	    continuar = ((qtdTent - tent) == 0);*/
		return mensagem;
	}
	
    
	
}
