package EntDados;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrada de Dados
		Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite o nome: ");
	    String nome = entrada.nextLine();
	    System.out.print("Digite a idade: ");
	    int idade = entrada.nextInt(); 
	    System.out.print("Digite a altura: ");
	    float altura = entrada.nextFloat(); 
	    System.out.println();
	    System.out.println("Nome: " + nome);
	    System.out.println("Altura: " + altura);
	    System.out.println("Idade: " + idade);
	    entrada.close();

	}

}
