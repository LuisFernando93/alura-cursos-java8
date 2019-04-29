package br.com.alura.java8.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.forEach(s -> System.out.println(s));
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
	}
}

