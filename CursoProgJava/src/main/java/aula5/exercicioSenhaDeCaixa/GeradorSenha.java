package aula5.exercicioSenhaDeCaixa;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	private static final String PREFIXO_PADRAO = "P";
	private static final String PREFIXO_IDOSO = "I";
	private static final int LIMITE_IDOSOS_SEQUENCIA = 5;
	private int contP;
	private int contI;
	List<Integer> listaSenhaIdoso; 
	List<Integer> listaSenhaPadrao; 
	private int seqIdoso;
	
	public GeradorSenha(){
		this.contI = 0;
		this.contP = 0;
		this.seqIdoso = 0;
		this.listaSenhaIdoso = new ArrayList<Integer>();
		this.listaSenhaPadrao = new ArrayList<Integer>();
	}
	
	public String gerarSenhaPadrao(){
		contP++;
		seqIdoso = 0;
		listaSenhaPadrao.add(contP);
		return PREFIXO_PADRAO+contP;
	}
	
	public String gerarSenhaIdoso(){
		contI++;
		seqIdoso++;
		listaSenhaIdoso.add(contI);
		return PREFIXO_IDOSO+contI;
	}
	
	public String proximaSenha(){
		String proxima = null;
		
		if(!listaSenhaIdoso.isEmpty()){
			if (seqIdoso >= LIMITE_IDOSOS_SEQUENCIA
					&& listaSenhaPadrao.isEmpty()){
				seqIdoso = 0;
				proxima = PREFIXO_IDOSO+listaSenhaIdoso.remove(0);
			} else {
				//metodo remove do ArrayList retorna o valor removido, por isso já pode ser usado para exibir valor.
				proxima = PREFIXO_IDOSO+listaSenhaIdoso.remove(0);
				seqIdoso++;
			}
		} else if (!listaSenhaPadrao.isEmpty()){
			proxima = PREFIXO_PADRAO+listaSenhaPadrao.get(0);
			listaSenhaPadrao.remove(0);
			seqIdoso = 0;
		} else
			proxima = "Nenhuma senha!";
		return proxima;
	}
}
