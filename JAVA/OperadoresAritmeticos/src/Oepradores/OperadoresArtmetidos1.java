<<<<<<< HEAD
package Oepradores;

public class OperadoresArtmetidos1 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 2;
		float m = (n1 + n2)/2;
		System.out.println("A média de n1 e n2 = " + m);
		
		// Incremento e Decremento
		
		int num = 5;
		int valor = 10 + num++; //Incremento após a soma
		System.out.println(valor);
		
		valor = 10 + num; //Soma com o mum já com o incremento
		System.out.println(valor);
		
		valor = 10 + ++num; //Incremento antes da soma
		System.out.println(valor);
		
		//Incremento no mesmos número
		int x=4;
		x+=2; // É igual a 4 + 2
		System.out.println(x);
		
		//Classe Math (Operações complexas)		
		float y = (float)Math.pow(5, 2);
		System.out.println(y);
		
		y = (float) Math.sqrt(3);
		System.out.println(y);
		
		y = (float) Math.PI;
		System.out.println(y);
		
		//Gerar números randomicos (ameatórios)
		double ale = Math.random(); // Gera número aleatório entre 0 e 1
		System.out.println(ale);
		
		//Para gerar um intervalo de números aleatórios
		int interv = (int) (5 + ale * (10-5)); //Para intervalo entre 5 e 10
		System.out.println(interv);
		
		
		

	}

}
=======
package Oepradores;

public class OperadoresArtmetidos1 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 2;
		float m = (n1 + n2)/2;
		System.out.println("A média de n1 e n2 = " + m);
		
		// Incremento e Decremento
		
		int num = 5;
		int valor = 10 + num++; //Incremento após a soma
		System.out.println(valor);
		
		valor = 10 + num; //Soma com o mum já com o incremento
		System.out.println(valor);
		
		valor = 10 + ++num; //Incremento antes da soma
		System.out.println(valor);
		
		//Incremento no mesmos número
		int x=4;
		x+=2; // É igual a 4 + 2
		System.out.println(x);
		
		//Classe Math (Operações complexas)		
		float y = (float)Math.pow(5, 2);
		System.out.println(y);
		
		y = (float) Math.sqrt(3);
		System.out.println(y);
		
		y = (float) Math.PI;
		System.out.println(y);
		
		//Gerar números randomicos (ameatórios)
		double ale = Math.random(); // Gera número aleatório entre 0 e 1
		System.out.println(ale);
		
		//Para gerar um intervalo de números aleatórios
		int interv = (int) (5 + ale * (10-5)); //Para intervalo entre 5 e 10
		System.out.println(interv);
		
		
		

	}

}
>>>>>>> f8e13c83c033afafe7c6cc614ad3f6dcaf6c892f
