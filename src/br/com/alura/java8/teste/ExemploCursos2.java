package br.com.alura.java8.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos2 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55)); 
		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 50) //pega os cursos com mais de 50 alunos
			.findFirst() //pega o primeiro elemento do stream filtrado
			.ifPresent(c -> System.out.println(c.getNome())); //se existir, imprime o nome do curso
		
		OptionalDouble media = cursos.stream()
				.mapToDouble(c -> c.getAlunos()) //mapeia os valores dos numeros de alunos, e cria uma nova lista
				.average();  //faz a media e devolve um valor OptionalDouble, admitindo que possa haver valores null
		
		System.out.println(media);
		
		List<Curso> listaFiltrada = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList()); //gera uma colecao atraves do stream em questao
		
		listaFiltrada.stream()
			.map(Curso::getNome)
			.forEach(System.out::println);
	}
}
