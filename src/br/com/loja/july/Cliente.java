package br.com.loja.july;

public class Cliente extends Pessoa{

	
	public void comprar(Double valor) {
		if(getSaldo() < valor) {
			System.out.println("Voce nao tem saldo o suficiente");
		}else {
			setSaldo(getSaldo() - valor);
			System.out.println("Comprou !!");
		}
	}
}
