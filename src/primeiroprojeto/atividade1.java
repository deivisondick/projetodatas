package primeiroprojeto;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 
	System.out.println("qual o valor pago por hora?:");
		float ganho = teclado.nextFloat();
		System.out.println("quantas horas você trabalhou?");
		float horas = teclado.nextFloat();
	  float ganhos = ganho*horas;
	  System.out.printf("o valor recibido sera:%.2f",ganhos);
	  teclado.close();
		 
		
	}
	}


