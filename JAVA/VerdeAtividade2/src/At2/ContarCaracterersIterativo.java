//package At2;

//import At2.MyIO;
import java.util.Scanner;

public class ContarCaracterersIterativo {

	public static void main(String[] args) {
		//MyIO.setCharset("UTF-8");
		try (Scanner scanner = new Scanner(System.in)) {
			String frase = scanner.nextLine();
			//String frase = MyIO.readLine();
			while (!frase.equalsIgnoreCase("FIM")) {
				int quant = contarCaracteresMaiusculos (frase); //Repassa string para a função
				System.out.println(quant);
				frase = scanner.nextLine();
				//frase = MyIO.readLine();
			}
		}

	}

	//Criando a Função que Conta os Caracteres Maiúsculos
	public static int contarCaracteresMaiusculos(String frase) {
	    int contador = 0;
	    if (frase.isEmpty()) {
			return 0;
		}
	    for (int i = 0; i < frase.length(); i++) {
	        if (Character.isUpperCase(frase.charAt(i))) {
	            contador++;
	        }
	    }
	    return contador;
	}
}


