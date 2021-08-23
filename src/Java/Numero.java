package Java;

import java.text.NumberFormat;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) {
		
		double saldo = 123_485.56;
		NumberFormat f = NumberFormat.getInstance(); // formata o numero de acordo com a localização default
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance(); //Formata o numero apenas com inteiros excluindo a parte fracionada
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance(); //Formata o numero em percentuais
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance(); //Formata em moeda
		System.out.println(f.format(saldo));
		
		/*Internacionalização*/
		f = NumberFormat.getCurrencyInstance(Locale.US); //Formata em moeda de acordo com a locale definida
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE); //Formata em moeda de acordo com a locale definida
		System.out.println(f.format(saldo));
	
	
	
	}

}
