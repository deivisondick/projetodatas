package primeiroprojeto;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 
	System.out.println("qual a altura dos dois andares");
		float handares = teclado.nextFloat();
		System.out.println("quantos degraus deseja entre os andares?");
		float degraus = teclado.nextFloat();
	  float hdegraus = ((handares*100)/degraus);
	  System.out.println("a altura dos degraus sera de:"+hdegraus+"cm");
	  teclado.close();
		 
		
	}
	}