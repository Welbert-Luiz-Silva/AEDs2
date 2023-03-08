package Condicional;

import java.util.Scanner;

public class EstrutCond {

	public static void main(String[] args) {
		
		// Condicional Simples
		Scanner teclado = new Scanner(System.in);
		System.out.print("Primeira nota");
		float n1 = teclado.nextFloat();
		System.out.print("Segunda nota");
		float n2 = teclado.nextFloat();
		float m = (n1+n2)/2;
		System.out.println("A media e: " + m);
		if(m>9) {
			System.out.println("Parabens!!!");
			
		}
		
		// Condicional Composta
		
		System.out.println("Digite o seu ano de nascimento");
		int nasc = teclado.nextInt();
		int idade = 2023 - nasc;
		System.out.println("Sua idade e: " + idade);
		if (idade>18) {
			System.out.println("Maior de Idade");
		}
		else {
			System.out.println("Menor de Idade");
		}
		

	}

}
