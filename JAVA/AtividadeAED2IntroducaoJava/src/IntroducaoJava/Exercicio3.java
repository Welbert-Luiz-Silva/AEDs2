package IntroducaoJava;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Enuncioado do Exercicio
        MyIO.println("EXERCICIO 3 - Inverte frase digitada");

        // Lê a frase fornecida pelo usuário
        System.out.print("Digite uma frase para criptografar: ");
        String frase = input.nextLine();

        // Inverte a ordem dos caracteres da frase
        String fraseCriptografada = new StringBuilder(frase).reverse().toString();

        // Imprime a frase criptografada
        System.out.println("Frase criptografada: " + fraseCriptografada);
    }
}
