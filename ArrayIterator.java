package a;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("Scala");

		// Permite percorrer elementos de uma cole��o
		// associando a lista ao padr�o iterator
		Iterator<String> it = nomes.iterator();

		// "hasNext" Verifica se existe um pr�ximo elemento a ser percorrido e ao usar o
		// while ir� percorrer enquanto houver os pr�ximos elementos contidos na cole��o
		while (it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);

		// Ir� remover o elemento "Java" contido na cole��o
			if (atual.equals("Java")) {
				it.remove();
			}
		}
		System.out.println("------");
		System.out.println(nomes);

		System.out.println(nomes.size());

		// Tamb�m percorrer� a lista assim como o iterator
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
