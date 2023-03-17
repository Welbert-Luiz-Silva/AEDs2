package EstruturaProcedimentoFuncao;

public class FuncaoRetornaValor {
	
	//Criando a função
	static int soma (int a, int b) {
		int s = a + b;
		return s;
	}
	
	//Executando a função
	public static void main(String[] args) {
		int sm = soma (5,3);
		MyIO.println("A soma e " + sm);
	}

}
