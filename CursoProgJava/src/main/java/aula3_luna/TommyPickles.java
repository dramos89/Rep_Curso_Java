package aula3_luna;

import java.util.Random;

public class TommyPickles {
	private String nome;
	private int numero;
	private String[] verbete = {"lôko!","stranger","very stranger","copatomarril","oi?","phoda","mamalasvelha","resobumausegundo"};;
	
	public TommyPickles(String nome){
		this.nome = nome;
	}
	
	public void falar(){
		this.numero = new Random().nextInt(this.verbete.length)+1;
		System.out.println(this.nome+" diz: -"+this.verbete[numero]);
	}
	
	public String getNome(){
		return this.nome;
	}
}
