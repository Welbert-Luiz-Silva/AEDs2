<<<<<<< HEAD
package TesteMyIO;

public class PassagemPorValor {
	public static int calculaSalario(int diasMes, int salarioPorDia) {
	int adicional = 100;
	int novoSalario = (diasMes * salarioPorDia) + adicional;
	return novoSalario;
}

public static void main(String[] args) {
	int diasMes = 30;
	int salarioPorDia = 60;

	System.out.println(calculaSalario(diasMes, salarioPorDia)); //Passagem por valor
}
}
=======
package TesteMyIO;

public class PassagemPorValor {
	public static int calculaSalario(int diasMes, int salarioPorDia) {
	int adicional = 100;
	int novoSalario = (diasMes * salarioPorDia) + adicional;
	return novoSalario;
}

public static void main(String[] args) {
	int diasMes = 30;
	int salarioPorDia = 60;

	System.out.println(calculaSalario(diasMes, salarioPorDia)); //Passagem por valor
}
}
>>>>>>> f8e13c83c033afafe7c6cc614ad3f6dcaf6c892f
