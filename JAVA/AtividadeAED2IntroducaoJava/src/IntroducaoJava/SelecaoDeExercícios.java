package IntroducaoJava;

import java.util.Scanner;

import IntroducaoJava.MyIO;


public class SelecaoDeExercícios {

	public static void main(String[] args) {
		// Menu de seleção de exercício
		Scanner input = new Scanner(System.in);
		int exerc = MyIO.readInt("Selecione o Exercicio 1, 2 ou 3: ");
		String titulo;
		switch (exerc) {
		case 1:
			titulo = "Faça um programa, em Java, para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e suas respectivas respostas às questões da prova. Existem dez alunos matriculados.";
			
			break;
		case 2:
			titulo = "Faça um programa, em Java, que preencha uma matriz de ordem 3 x 4 (3 linhas e 4 colunas) com números inteiros e positivos";
			break;
		case 3:
			titulo = "Faça um programa, em Java, que criptografe uma frase dada pelo usuário invertendo a frase informada.";
			break;
		default:
			titulo = "Não existe o exercicio selecionado.";
			break;		

		}
		System.out.println(titulo);
		//MyIO.println(titulo);
	}

}