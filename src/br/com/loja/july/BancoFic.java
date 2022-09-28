package br.com.loja.july;

import java.util.List;

public class BancoFic {

	
	public static void main(String[] args) {
		JulinhaMakes j1 = new JulinhaMakes();
		
		List<Funcionario> funcionarios = j1.getFuncionarios();
		
		
		if(funcionarios.size() < 1) {
			System.out.println("Nao há funcionarios na lista");
		}else {
		for(Funcionario fun : funcionarios) {
				System.out.println(fun.getID());
		}
		}
	}
}
