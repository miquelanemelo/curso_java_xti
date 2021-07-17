package erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		 
		try (Scanner s = new Scanner (System.in)) {
			System.out.println("Entre com um numero de 0 a 10");
			int numero = s.nextInt();
			
			assert(numero >= 0 && numero <=10 ) : "numero invalido " + numero;
			System.out.println("Voce digitou o numero: " + numero);
		}

	}

}
