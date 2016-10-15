package aula5.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestarSets {

	public static void main(String[] args) {
		Set<String> meuSet = new HashSet<>();
		meuSet.add("Valor 1");
		meuSet.add("Valor 2");
		meuSet.add("Valor 3");
		meuSet.add("Valor 4");
		meuSet.add("Valor 5");
		
		
		for (String set : meuSet) {
			System.out.println(set);
		}
	}
}
