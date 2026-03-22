package primeiroprojeto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Auladatas {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("dia de nascimento:");
		 int dia = sc.nextInt();
		 
		 System.out.println("mes de nascimento:");
		 int mes = sc.nextInt();
		 
		 System.out.println("ano de nascimento:");
		 int ano = sc.nextInt();
		 
		 
		
		
		calculaIdade( dia, mes,ano );
	}
	     private static void calculaIdade(int dia, int mes, int ano) {
		
		LocalDate agora = LocalDate.now();
		LocalDate segundaData = LocalDate.of(ano, mes, dia);
		
		Period periodo = Period.between(segundaData, agora);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("A sua idade é " + anos + " ano(s), " 
				+ meses + " mes(es) e "		
				+ dias + " dia(s). ");

		
		
	}
	
	
}
