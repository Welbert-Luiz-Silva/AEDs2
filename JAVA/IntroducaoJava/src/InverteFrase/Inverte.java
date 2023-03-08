
package InverteFrase;

import java.util.Scanner;

public class Inverte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê a frase fornecida pelo usuário
        System.out.print("Digite uma frase para criptografar: ");
        String frase = input.nextLine();

        // Inverte a ordem dos caracteres da frase
        String fraseCriptografada = new StringBuilder(frase).reverse().toString();

        // Imprime a frase criptografada
        System.out.println("Frase criptografada: " + fraseCriptografada);
    }
}

