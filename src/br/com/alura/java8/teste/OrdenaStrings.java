package br.com.alura.java8.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
		
		Consumer<String> consumidorLinha = new ImprimeNaLinha();
		Consumer<String> consumidorJunto = new ImprimeTudoJunto();
		palavras.forEach(consumidorLinha);
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
}

class ImprimeTudoJunto implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.print(s);
		
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
}
