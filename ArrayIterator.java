package a;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("Scala");

		// Permite percorrer elementos de uma coleção
		// associando a lista ao padrão iterator
		Iterator<String> it = nomes.iterator();

		// "hasNext" Verifica se existe um próximo elemento a ser percorrido e ao usar o
		// while irá percorrer enquanto houver os próximos elementos contidos na coleção
		while (it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);

		// Irá remover o elemento "Java" contido na coleção
			if (atual.equals("Java")) {
				it.remove();
			}
		}
		System.out.println("------");
		System.out.println(nomes);

		System.out.println(nomes.size());

		// Também percorrerá a lista assim como o iterator
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
