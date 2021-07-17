package orietacao_objetos;

public class CachorroTeste {
	
	public static void main(String[]args) {
		
		Cachorro pitbull = new Cachorro();
		pitbull.raça = "PitBull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raça ="Vira-Lata";
		viralata.tamanho = 35;
		viralata.latir();
		
	}
	
	
	

}
