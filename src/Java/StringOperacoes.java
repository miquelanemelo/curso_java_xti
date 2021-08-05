package Java;

public class StringOperacoes {
	
	public static void main(String[] args) {
		
		String s1 = "String 1"; // literal string
		String s2 = s1 + "string 2"; // concatenando Strings
		String s3 = new String("String 3"); // Criar uma string atraves do metodo construtor
		
		char[] array = {'S','T','R','I','N','G'};
		String s4 = new String(array); // contruindo atraves de um array
		
		//opera��es
		int tamanho = s1.length(); // imprimi a quantidade de caracteres dentro da string	
		System.out.println( s1.charAt(0)); // localiza um determinado caracter dentro da string
		System.out.println( s1.toString()); // retorna a propria string, a representa��o do texto
		
		//localiza��o
		s3.indexOf('J'); // retorna a posi��o na qual a letra come�a
		s3.lastIndexOf("g"); // retorna a posi��o da ultima ocorrencia daquela letra/palavra
		s3.isEmpty(); // verifica se a string esta vazia
		
		//compara��o
		String nome = "Miquelane";
		//boolean xti = nome.equals("Miquelane"); // compara os valores entre duas strings
		boolean mique = nome.equalsIgnoreCase("miquelane"); // compara os valores entre duas strings ignorando letras maiusculas e minusculas
		System.out.println(mique);
		
	}

}
