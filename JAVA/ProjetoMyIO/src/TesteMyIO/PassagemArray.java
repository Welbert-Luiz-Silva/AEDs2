<<<<<<< HEAD
package TesteMyIO;

class PassagemArray {
	public static void passagemDeArray(int[ ] b){
		for (int i = 0; i < 5; i++){
			b[i] *= 5; 
			System.out.println("b[" +i+ "]: " +b[i]);
		}
		
		b = new int [5];
		for (int i = 0; i < 5; i++){
			b[i] = i; 
			System.out.println("b[" +i+ "]: " +b[i]);
		} 
	}

	public static void main(String[] args) { //Cria o vetor Y
		int [] y = new int [5];
		for (int i = 0; i < 5; i++){
			y[i] = i; 
			System.out.println("y[" +i+ "]: " +y[i]);
		}
		passagemDeArray(y); // Faz passagem de valor
		for (int i = 0; i < 5; i++){
			System.out.println("y[" +i+ "]: " +y[i]);
		} 
	} 
=======
package TesteMyIO;

class PassagemArray {
	public static void passagemDeArray(int[ ] b){
		for (int i = 0; i < 5; i++){
			b[i] *= 5; 
			System.out.println("b[" +i+ "]: " +b[i]);
		}
		
		b = new int [5];
		for (int i = 0; i < 5; i++){
			b[i] = i; 
			System.out.println("b[" +i+ "]: " +b[i]);
		} 
	}

	public static void main(String[] args) { //Cria o vetor Y
		int [] y = new int [5];
		for (int i = 0; i < 5; i++){
			y[i] = i; 
			System.out.println("y[" +i+ "]: " +y[i]);
		}
		passagemDeArray(y); // Faz passagem de valor
		for (int i = 0; i < 5; i++){
			System.out.println("y[" +i+ "]: " +y[i]);
		} 
	} 
>>>>>>> f8e13c83c033afafe7c6cc614ad3f6dcaf6c892f
} 