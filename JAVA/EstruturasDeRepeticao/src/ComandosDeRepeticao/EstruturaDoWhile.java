package ComandosDeRepeticao;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		float i = 0;
		float n = MyIO.readFloat("Contar de 0 ate o numero? ");
		do {
			MyIO.println(i + ";");
			i+=1;
		}
		while (i<=n);
	
		

	}

}
