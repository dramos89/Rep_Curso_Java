package aula5.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import aula5.pessoa.Pessoa;
import aula5.pessoa.PessoaPorCpfComparator;
import aula5.pessoa.PessoaPorNomeComparator;

public class TestarSetPessoas {

	public static void main(String[] args) {
		//HashSet considera equals e hashCode
		Set<Pessoa> pessoas = new HashSet<>();

		pessoas.add(new Pessoa("João","2"));
		pessoas.add(new Pessoa("José","1"));
		pessoas.add(new Pessoa("Arnaldo","3"));
		pessoas.add(new Pessoa("Joana","4"));
		pessoas.add(new Pessoa("Maria","5"));
		pessoas.add(new Pessoa("Arminia","6"));
		
		//pessoas.remove(new Pessoa("Maria","5"));

		System.out.println("Pessoas HashSet");
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.print("nome: "+pessoa.getNome());
			System.out.println(" cpf: "+pessoa.getCpf());
		}
		
		//TreeSet considera equals, hashCode e comparação
		Set<Pessoa> pessoasOrdenadas = new TreeSet<>(new PessoaPorNomeComparator());

		pessoasOrdenadas.add(new Pessoa("João","2"));
		pessoasOrdenadas.add(new Pessoa("José","1"));
		pessoasOrdenadas.add(new Pessoa("Arnaldo","3"));
		pessoasOrdenadas.add(new Pessoa("Joana","4"));
		pessoasOrdenadas.add(new Pessoa("Maria","5"));
		pessoasOrdenadas.add(new Pessoa("Arminia","6"));
		
		//pessoas.remove(new Pessoa("Maria","5"));
		
		System.out.println("\nPessoas ordenadas");
		
		for (Pessoa pessoa : pessoasOrdenadas) {
			System.out.print("nome: "+pessoa.getNome());
			System.out.println(" cpf: "+pessoa.getCpf());
		}
	}
}
