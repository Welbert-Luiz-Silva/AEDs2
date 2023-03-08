package Ternario;

public class OpTernario {

	public static void main(String[] args) {
		int n1, n2, r, r1;
		n1=2;
		n2=4;
		r = (n1>n2)? n1 : n2;
		r1 = (n1>n2)?n1+n2 : n1-n2;
		System.out.println(r);
		System.out.println(r1);
		
		// Comparando Strings
		String nome1 = "Welbert";
		String nome2 = "Welbert";
		String nome3 = new String("Welbert");
		String res, res1, res2;
		res = (nome1==nome2)?"igual":"diferente";
		System.out.println(res);
		res1 = (nome1==nome3)?"igual":"diferente";
		System.out.println(res1);
		res2 = (nome1.equals(nome3))?"igual":"diferente"; //Utilizando o método equals para verificar o conteúdo de objetos
		System.out.println(res2);
		
		//Operadores relacionais
		int x, y, z;
		x=4;
		y=7;
		z=12;
		boolean resp;
		resp = (x<y && y<z)? true : false; // verdeiro
		System.out.println(resp);
		resp = (x<y && y==z)? true : false; //falso
		System.out.println(resp);
		resp = (x<y || y==z)? true : false; //verdadeiro
		System.out.println(resp);
		resp = (x<y ^ y==z)? true : false; // verdadeiro
		System.out.println(resp);
		resp = (x<y ^ y<z)? true : false; // falso
		System.out.println(resp);

	}

}
