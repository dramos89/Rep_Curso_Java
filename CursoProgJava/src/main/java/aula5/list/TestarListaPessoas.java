package aula5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula5.pessoa.Pessoa;
import aula5.pessoa.PessoaPorCpfComparator;

public class TestarListaPessoas {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Pessoa("João","2"));
		pessoas.add(new Pessoa("José","1"));
		pessoas.add(new Pessoa("Arnaldo","3"));
		pessoas.add(new Pessoa("Joana","4"));
		pessoas.add(new Pessoa("Maria","5"));
		pessoas.add(new Pessoa("Arminia","6"));
		int indexOf = pessoas.indexOf(new Pessoa("Arminia","8"));
		boolean contains = pessoas.contains(new Pessoa("Arminia","8"));

		System.out.println("indexOf Arminia: "+ indexOf);
		System.out.println("contains Arminia: "+ contains);
		System.out.println("pessoas.isEmpty(): "+pessoas.isEmpty());
		System.out.println("pessoas.size(): " + pessoas.size());

		//pessoas.remove(2);
		//pessoas.remove(new Pessoa("Arminia","6"));
		
		//por comparable
		//Collections.sort(pessoas);
		//por comparator
		Collections.sort(pessoas, new PessoaPorCpfComparator());
		
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.print("nome: "+pessoa.getNome());
			System.out.println(" cpf: "+pessoa.getCpf());
		}
		
	}
}
