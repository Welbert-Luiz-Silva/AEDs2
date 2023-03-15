package ComandosDeRepeticao;

public class Fatorial {

	public static void main(String[] args) {
		double f=1;
	    int num = MyIO.readInt("Entre com um inteiro: ");
	    MyIO.println("O fatorial de " + num + " =");
	    int i=num;
	    while (i>=1) {
	    	f *=i;
	    	i--;
	    }
	 
	   MyIO.println(f);
	}
}
