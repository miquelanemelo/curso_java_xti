package orietacao_objetos;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente ="Miquelane";
		conta.saldo = 1500;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Yure";
		destino.saldo= 580;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 560.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
	
	}
	

}
