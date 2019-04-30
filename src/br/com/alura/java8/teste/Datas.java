package br.com.alura.java8.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York"); //ID do fuso horario em questao
		ZonedDateTime hojeEmNovaYork =  ZonedDateTime.now(fusoHorarioDeNovaYork); //repassa data e hora com fuso horario
		
		LocalDate futuroDistante = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuroDistante);
		
		Period periodo = Period.between(hoje, futuroDistante);
		System.out.println(periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println(hoje.format(formatador));
		System.out.println(hojeEmNovaYork.format(formatador));
	}
}
