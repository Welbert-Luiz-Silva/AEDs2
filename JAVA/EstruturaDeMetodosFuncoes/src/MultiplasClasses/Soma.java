package MultiplasClasses;



public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v0 = 3;
		int v1 = v0++;
		int v2 = ++v1;
		v1 += v0;
		v2 += --v1;
		MyIO.print(v0);
		MyIO.print(v1);
		MyIO.print(v2);

	}

}
