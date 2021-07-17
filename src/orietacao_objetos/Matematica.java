package orietacao_objetos;

public class Matematica {
	
	int raiz(int numero) {
		int raiz=0, impar =1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2; 
			++raiz;
		}
		return raiz;
	}
	
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
	}	double soma (double um, double dois){
		double s = um + dois;
		return s;				
	}

}
