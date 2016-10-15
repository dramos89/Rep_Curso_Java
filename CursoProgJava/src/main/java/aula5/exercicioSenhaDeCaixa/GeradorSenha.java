package aula5.exercicioSenhaDeCaixa;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	private int contP;
	private int contI;
	List<Integer> listaSenhaIdoso; 
	List<Integer> listaSenhaPadrao; 
	private int seqIdoso;
	
	public GeradorSenha(){
		this.contI = 0;
		this.contP = 0;
		this.seqIdoso = 0;
		this.listaSenhaIdoso = new ArrayList<>();
		this.listaSenhaPadrao = new ArrayList<>();
	}
	
	public String gerarSenhaPadrao(){
		contP++;
		listaSenhaPadrao.add(contP);
		return "P"+contP;
	}
	
	public String gerarSenhaIdoso(){
		contI++;
		listaSenhaIdoso.add(contI);
		return "I"+contI;
	}
	
	public String proximaSenha(){
		String proxima = null;
		if(!listaSenhaIdoso.isEmpty()){
			proxima = "I"+listaSenhaIdoso.get(0);
			listaSenhaIdoso.remove(0);
			seqIdoso++;
		} else if (!listaSenhaPadrao.isEmpty()){
			proxima = "P"+listaSenhaPadrao.get(0);
			listaSenhaPadrao.remove(0);
			seqIdoso = 0;
		} else
			proxima = "Nenhuma senha!";
		return proxima;
	}
}
