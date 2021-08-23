package Java;

import java.text.NumberFormat;

public class Numero {

	public static void main(String[] args) {
		
		double saldo = 123_485.56;
		NumberFormat f = NumberFormat.getInstance(); // formata o numero de acordo com a localização default
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));

	}

}
