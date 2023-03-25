package Aula2;

public class Caneta {
	//Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampar;
	
	//Métodos
	void status() {
		System.out.println("Uma Caneta " + this.cor);
		System.out.println("Está tampada? " + this.tampar);
		System.out.println("Tipo de ponta: " + this.ponta);
		System.out.println("Tem carga? " + this.carga);
	}
	void tampar() {
		this.tampar = true;
	}
	void rabiscar() {
		if (this.tampar == true) {
			System.out.println("ERRO - Não pode rabiscar!");
		}
		else {
			System.out.println("Pode rabiscar agora.");
		}
	}
	void destampar() {
		this.tampar = false;
	}
}
