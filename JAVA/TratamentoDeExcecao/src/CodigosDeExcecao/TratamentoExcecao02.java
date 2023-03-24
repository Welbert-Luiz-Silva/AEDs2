package CodigosDeExcecao;

public class TratamentoExcecao02 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println("A variavel i vale " + i);

		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Erro na passagem de parametros!!!");

		} finally {
			System.out.println("FIM DE PROGRAMA!!!");
		}
	}
}