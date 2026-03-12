package primeiroprojeto;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 
	System.out.println("qual a altura");
		float h = teclado.nextFloat();
		System.out.println("qual a base menor?");
		float b = teclado.nextFloat();
		System.out.println("qual a base maior?");
		float B = teclado.nextFloat();
	  float area = (h * (b + B)) / 2;
	  System.out.println("o valor recibido sera:"+area);
	  teclado.close();
		 
		
	}
	}

	