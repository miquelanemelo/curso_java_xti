package erros;

public class SenhaTest {

	static void autenticar(String senha) throws SenhaInvalidaException {
		if ("123".equals(senha)) {
			// autenticado
			System.out.println("Autenticado");
		} else {
			// senha incorreta
			throw new SenhaInvalidaException("Senha incorreta");
		}
	}

	public static void main(String[] args) {
		try {
			autenticar("1223");
		}catch(SenhaInvalidaException e) {
			System.out.println(e.getMessage()); 
		}

	}

}
