package EstrutMultiplaEscolha;

public class MultiplaEscolha {

	public static void main(String[] args) {
		
		int ddd = MyIO.readInt("Digite o ddd: ");
		String tipo;
		switch (ddd) {
		case 11:
		tipo = "Sao Paulo";
		break;
		case 21:
			tipo = "Rio de Janeiro";
			break;
		case 31:
			tipo = "Belo Horizonte";
			break;
		case 41:
			tipo = "Cutitiba";
			break;
		case 51:
			tipo = "Porto Alegre";
			break;
		case 61:
			tipo = "Brasilia";
			break;
		default:
			tipo = "DDD nao existe.";
			break;
			
		}
		MyIO.print(tipo);		

	}

}
