package aula5.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestarListas {
	public static void main(String[] args) {
		List minhaLista = new ArrayList();
		List outraLista = new LinkedList();

		minhaLista.add("Teste");
		minhaLista.add("Outra coisa");
		minhaLista.add(666);
		
		System.out.println("minhaLista: ");
		for (Object object : minhaLista) {
			System.out.println(object);
		}
		
		List<String> listaString = new LinkedList<String>();
		listaString.add("Valor 1");
		listaString.add("Valor 2");
		listaString.add("Valor 3");
		listaString.add("Valor 4");
		listaString.add("Valor 4");

		System.out.println("listaString: ");
		for (String valor : listaString) {
			System.out.println(valor);
		}
		
		
		int indexOf = listaString.indexOf("Valor 4");
		System.out.println(indexOf);
	}
}
