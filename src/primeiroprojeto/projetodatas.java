package primeiroprojeto;


import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class projetodatas {

	public static void main(String[] args) {
		
		mostrardata();
		}
		
		public static void mostrardata() {
		
		Calendar hoje = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE", new Locale("pt", "BR"));
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM", new Locale("pt", "BR"));
		
		String diadasemana = sdf.format(hoje.getTime());
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		String mes = sdf1.format(hoje.getTime());
		int ano = hoje.get(Calendar.YEAR);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		
		String data = "hoje é " + diadasemana + " dia " + dia + " de " + mes + " de " + ano + " e agora são " + hora + " horas e " + minutos + " minutos ";
		System.out.println( data);

	
	}
}