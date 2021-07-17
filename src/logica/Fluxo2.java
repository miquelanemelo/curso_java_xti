package logica;

public class Fluxo2 {

	public static void main(String[] args) {

		String tecnologia = "a";

		switch (tecnologia) {
		case "Java":
		case "C++":
		case "PHP":
			System.out.println("Linguagem de Programacao");
			break;
		case "Oracle":
		case "MySql":
		case "Postgresql":
			System.out.println("Banco de Dados");
			break;
		default:
			System.out.println("Tecnologia Desconhecida");

		}

	}

}