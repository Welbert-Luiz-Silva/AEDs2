package IntroducaoJava;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] gabarito = new String[8];
		
		// Enunciado do exercício
		MyIO.println("EXERCICIO 1 - Correcao de provas");

		// Solicita ao usuário que informe as respostas do gabarito
		System.out.println("Digite as respostas do gabarito:");
		for (int i = 0; i < gabarito.length; i++) {
			System.out.print("Questão " + (i+1) + ": ");
			gabarito[i] = input.nextLine();
		}

		// Imprime o gabarito
		System.out.println("\nGabarito:");
		for (int i = 0; i < gabarito.length; i++) {
			System.out.println("Questão " + (i+1) + ": " + gabarito[i]);
		}

		// Corrige as provas dos alunos
		String[] alunos = new String[10];
		int[] notas = new int[10];
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("\nDigite o número do aluno: ");
			alunos[i] = input.nextLine();

			String[] respostas = new String[8];
			for (int j = 0; j < respostas.length; j++) {
				System.out.print("Resposta da questão " + (j+1) + ": ");
				respostas[j] = input.nextLine();
			}

			notas[i] = corrigirProva(gabarito, respostas);
			System.out.println("Nota do aluno " + alunos[i] + ": " + notas[i]);
		}

		// Calcula a porcentagem de aprovação
		int aprovados = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprovados++;
			}
		}
		double porcentagemAprovados = (double) aprovados / notas.length * 100;

		// Imprime a porcentagem de aprovação
		System.out.println("\nPorcentagem de aprovação: " + porcentagemAprovados + "%");
	}

	// Método para corrigir a prova de um aluno
	public static int corrigirProva(String[] gabarito, String[] respostas) {
		int nota = 0;
		for (int i = 0; i < gabarito.length; i++) {
			if (gabarito[i].equals(respostas[i])) {
				nota++;
			}
		}
		return nota;
	}
}