package VariavelCompostaVetor;

import java.util.Arrays;
import java.util.Random;

public class Vetor {

	public static void main(String[] args) {
		int n[] = new int [4];
		n[0] = 10;
		n[1] = 3;
		n[2] = 5;
		n[3] = 2;
		
		int vet[] = {2,4,6,8,10};
		MyIO.println("Impressao do Vetor n - Posicao e Valor");
		// Monstrar a quantidade de casas do vetor
		MyIO.println("Numero de casas do vetor = " + n.length); 
		for (int i=0; i<=3; i++) {
			MyIO.println("["+i+"] " + n[i]);
		}
		MyIO.println("Impressao do Veto vet - Posicao e Valor");
		MyIO.println("Numero de casas do vetor");
		for (int j =0; j<=n.length; j++) {
			MyIO.println("["+j+"] " + vet[j]);
		}
		MyIO.println("Impressao de vetor com FOR IT");
		Arrays.sort(n); // para colocar o vetor em ordem.
		for (int valor: n) {
			MyIO.print(valor + ", ");
		}
		//pesquisa binária da posição de um valor digitado
		MyIO.println("");
		int num = MyIO.readInt("Digite o valor a ser localizado no vetor n: ");
		int p = Arrays.binarySearch(n, num); 
		MyIO.println("O valor digitado esta no posicao [" + p + "]");
		
		//Vetor com preenchimento automático vetor de 5 posições
		int vetor[] = new int[5];
		Arrays.fill(vetor, 8);
		for (int exib: vetor) {
			MyIO.println(exib + ",");
		}
		//Vetor com preenchimento aleatório (0 a 20)
		int ale[] = new int [6];
		Random rand = new Random();
		for (int cont=0; cont<=n.length; cont++) {
			ale[cont]=rand.nextInt(20);
		}
		for (int ver: ale) {
			MyIO.print(ver + ",");
		}
	
		
	}
}
