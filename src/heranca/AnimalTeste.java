package heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro ted = new Cachorro();
		ted.comida = "Ração de carne";
		ted.peso = 5;
		ted.fazerBarulho();
		
		System.out.println(ted.comida);
				

	}

}
