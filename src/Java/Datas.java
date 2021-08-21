package Java;

import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {
		
		Calendar c =  Calendar.getInstance();
		c.set(2021, Calendar.AUGUST, 10);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR)); // ano
		System.out.println(c.get(Calendar.MONTH));// o indice do mes inicia-se em 0 á 11 
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //dia
		
		c.set(Calendar.YEAR, 2021); //altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE); //limpa o campo selecionado
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY); // recupera a hora do dia 
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Bom dia");
		}else if (hora <12 && hora <=18) {
			System.out.println("Boa tarde");
		}else if(hora >18 && hora<00 ) {
			System.out.println("Boa noite");
		}else {
			System.out.println("Boa madrugada");
		}
		
		
	}

}
