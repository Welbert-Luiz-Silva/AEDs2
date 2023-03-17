package MultiplasClasses;



public class TesteFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyIO.println("Comecar a contagem");
		int inicio = MyIO.readInt("Digite o valor de início: ");
		int fim = MyIO.readInt("Digite o valor do fim: ");
		MyIO.println(Operacoes.contador(inicio, fim));
	}

}
