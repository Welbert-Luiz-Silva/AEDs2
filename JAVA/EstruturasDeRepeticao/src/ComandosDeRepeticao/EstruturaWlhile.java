package ComandosDeRepeticao;

public class EstruturaWlhile {

	public static void main(String[] args) {
		int i=0;
		while (i<10) {
			i++;
			if (i==2 || i==3 || i==4) {
				continue; // volta no laço
			}
			if (i==7) {
				break; // sai do laço
			}
			MyIO.println("Numero " + i +";");
			
		}
	}
}