package CondicionalComposta;

public class Composta {

	public static void main(String[] args) {
		int idade = MyIO.readInt("Digite o ano do seu nascimento: ");
		//int idade = 2023 - nasc;
		MyIO.println("Sua idade e: " + idade);

		if (idade < 16) {
			MyIO.println("Voce nao vota.");
		}
		else{
			if (idade >= 16 && idade <18 || idade > 70) {
				MyIO.println("Voce vota se quiser.");
			}
			else {
				MyIO.println("Voce e obrigado a votar.");
			}
			
		}

	}

}
