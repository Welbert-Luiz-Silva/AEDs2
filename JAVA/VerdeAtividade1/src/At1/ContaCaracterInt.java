package At1;

public class ContaCaracterInt {

	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		String frase = MyIO.readLine();
		while (!frase.equalsIgnoreCase("FIM")) {
			int quant = contaMaiusculas (frase); //Repassa string para a função
			MyIO.println(quant);
			frase = MyIO.readLine();
		}
	}

	//Criando a Função que Conta os Caracteres Maiúsculos
	public static int contaMaiusculas(String str) {

		// Caso base: a string está vazia
		if (str.isEmpty()) {
			return 0;
		}

		// Se o primeiro caractere da string for uma letra maiúscula, adiciona 1 à contagem
		int count = 0;
		if (Character.isUpperCase(str.charAt(0))) {
			count++;
		}

		// Recursivamente chame a função para o restante da string
		count += contaMaiusculas(str.substring(1));
		return count;

	}

} 

