package Aula2;

public class Aula2 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIG";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.destampar();
		
		c1.status();
		c1.rabiscar();
	
		
		Caneta c2 = new Caneta();
		c2.modelo = "WEL";
		c2.cor = "Preta";
		c2.ponta = 2;
		c2.tampar();
		
		c2.status();
		c2.rabiscar();		

	}

}
