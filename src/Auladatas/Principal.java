package primeiroprojeto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o dia de nascimento: ");
            int dia = sc.nextInt();

            System.out.print("Digite o mês de nascimento: ");
            int mes = sc.nextInt();

            System.out.print("Digite o ano de nascimento: ");
            int ano = sc.nextInt();

            // Validação automática da data
            LocalDate data = LocalDate.of(ano, mes, dia);

            System.out.println("Data válida: " + data);

            // Chama o método
            calcularIdade(dia, mes, ano);

        } catch (Exception e) {
            System.out.println("❌ Data inválida! Verifique os valores.");
        }

        sc.close();
    }

    public static void calcularIdade(int dia, int mes, int ano) {

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(nascimento, hoje);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println("\n🎂 Sua idade é:");
        System.out.println(anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");
    }
}
