package ContadorCaracteres;

import java.util.Scanner;

public class FuncaoRecursica {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String input = "";
	    
	    // Loop de entrada de dados
	    while (true) {
	        System.out.print("Digite uma string: ");
	        input = scanner.nextLine();
	        
	        // Verifica se a palavra de entrada é "FIM" ou "Fim" e encerra o loop
	        if (input.equalsIgnoreCase("FIM")) {
	            break;
	        }
	        
	        // Conta a quantidade de caracteres maiúsculos da string e exibe o resultado
	        int count = contarMaiusculas(input);
	        System.out.println("A string '" + input + "' tem " + count + " caracteres maiúsculos.");
	    }
	    
	    scanner.close();
	}

	public static int contarMaiusculas(String str) {
	    // Verifica se a palavra de entrada é "FIM" ou "Fim" e retorna zero
	    if (str.equalsIgnoreCase("FIM")) {
	        return 0;
	    }
	    
	    // Verifica se o primeiro caractere da string é maiúsculo e soma 1
	    int count = Character.isUpperCase(str.charAt(0)) ? 1 : 0;
	    
	    // Chama recursivamente a função passando o restante da string a partir do segundo caractere
	    return count + contarMaiusculas(str.substring(1));
	}

	
	
	
	
	
}	