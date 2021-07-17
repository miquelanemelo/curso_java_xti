package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do {
			try {
				
				System.out.println("Numero:  ");
				int a = s.nextInt();
				System.out.println("Divisor: ");
				int b = s.nextInt();
				System.out.println(a/b);
				continua = false;
			}
		catch (InputMismatchException e1) {
			System.out.println("Numeros devem ser inteiros");
			s.nextLine();
		}
		catch(ArithmeticException e2) {
			System.out.println("Divisor deve ser diferente de Zero");
		}
			
		}while(continua);
	}
	}
