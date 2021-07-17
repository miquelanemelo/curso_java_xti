package orietacao_objetos;

public class CarroTeste {

	public static void main(String[] args) {
		
		/* forma de fazer a chamada do objeto*/
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari";
		ferrari.velocidadeMax = 396;
		ferrari.segundosZeroACem = 3.5;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; // adiciona o motor ao carro
		
		/*forma chamando o objeto atraves do construtor*/
		
		Carro poscher = new Carro("Poscher", 390, 3.2);
	

		System.out.println(poscher.velocidadeMax);
		System.out.println(ferrari.motor.tipo);
		
	}

}
