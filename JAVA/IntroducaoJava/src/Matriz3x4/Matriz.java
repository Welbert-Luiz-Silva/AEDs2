<<<<<<< HEAD
package Matriz3x4;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		Random rand = new Random();

		// Preenche a matriz com números aleatórios entre 0 e 999
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(1000);
			}
		}

		// Imprime a matriz
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Encontra o maior elemento e sua posição
		int maior = matriz[0][0];
		int linhaMaior = 0;
		int colunaMaior = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}

		// Imprime o maior elemento e sua posição
		System.out.println("Maior elemento: " + maior);
		System.out.println("Posição: linha " + (linhaMaior+1) + ", coluna " + (colunaMaior+1));

		// Encontra o menor elemento e sua posição
		int menor = matriz[0][0];
		int linhaMenor = 0;
		int colunaMenor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}

		// Imprime o menor elemento e sua posição
		System.out.println("Menor elemento: " + menor);
		System.out.println("Posição: linha " + (linhaMenor+1) + ", coluna " + (colunaMenor+1));
	}
}
=======
package Matriz3x4;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		Random rand = new Random();

		// Preenche a matriz com números aleatórios entre 0 e 999
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(1000);
			}
		}

		// Imprime a matriz
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Encontra o maior elemento e sua posição
		int maior = matriz[0][0];
		int linhaMaior = 0;
		int colunaMaior = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}

		// Imprime o maior elemento e sua posição
		System.out.println("Maior elemento: " + maior);
		System.out.println("Posição: linha " + (linhaMaior+1) + ", coluna " + (colunaMaior+1));

		// Encontra o menor elemento e sua posição
		int menor = matriz[0][0];
		int linhaMenor = 0;
		int colunaMenor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}

		// Imprime o menor elemento e sua posição
		System.out.println("Menor elemento: " + menor);
		System.out.println("Posição: linha " + (linhaMenor+1) + ", coluna " + (colunaMenor+1));
	}
}
>>>>>>> f8e13c83c033afafe7c6cc614ad3f6dcaf6c892f
