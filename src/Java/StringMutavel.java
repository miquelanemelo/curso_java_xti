package Java;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java ");
		
		s0.toString();
		s0.length();
		s0.capacity(); // informa a capacidade de armazenamento de novos caracteres sem alocar mais espaço da memoria
		s1.append("Testando");
		System.out.println (s0.capacity());
		System.out.println(s1);
		String teste = new StringBuilder("Oi ").append("Como ").append("voce esta?").toString();
		System.out.println(teste);
		
		String url = new StringBuilder("www.maisvoce.com.br").delete(0, 4).toString();
		System.out.println(url);
		
		
		
				
	}

}
