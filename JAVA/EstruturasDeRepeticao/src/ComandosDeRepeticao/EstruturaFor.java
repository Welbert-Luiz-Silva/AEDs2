package ComandosDeRepeticao;

public class EstruturaFor {

	public static void main(String[] args) {
		double n = MyIO.readDouble("Digite um numero: ");
		for (double i=0; i<=n; i++) {
			for (int j=1; j<=n; j+=2) {
			MyIO.println("j - " + j + ";");
			}
			MyIO.println("i - " + i + ";");
		}
	}

}
