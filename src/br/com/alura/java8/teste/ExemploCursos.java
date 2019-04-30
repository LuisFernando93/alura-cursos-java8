package br.com.alura.java8.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55)); 
		
		//a List cursos possui uma coletanea de metodos uteis em uma API chamada stream
		// modificações em um stream não modificam a coleção/objeto que o gerou
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome())); //filtra cursos com mais de 50 alunos e exibe seus nomes
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome); //cria uma nova lista apenas dos valores Strings dos nomes dos cursos
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
	}
}
