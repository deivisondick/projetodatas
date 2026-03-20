package primeiroprojeto;

import java.time.LocalDate;
import java.time.Period;

public class atividadedata2 {
	
	public static void main(String[] args) {
		contaTempo( 04, 01,2027 );
	}
	private static void contaTempo(int dia, int mes, int ano) {
		
		LocalDate agora = LocalDate.now();
		LocalDate segundaData = LocalDate.of(ano, mes, dia);
		
		Period periodo = Period.between(agora, segundaData);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("A diferença é " + anos + " ano(s), " 
				+ meses + " mes(es) e"		
				+ dias + " dia(s). ");

		
		
	}
	
	
	

}
