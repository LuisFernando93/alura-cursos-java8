package br.com.alura.java8.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import static java.util.Comparator.*;

public class MethodReference {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(comparing(String::length));
		palavras.forEach(System.out::println);
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		palavras.forEach(System.out::println);
		
	}
}

