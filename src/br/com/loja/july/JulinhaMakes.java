package br.com.loja.july;

import java.util.ArrayList;
import java.util.List;

public class JulinhaMakes {

	private static List<Funcionario> funcionarios = new ArrayList<>();
	
	
	public void Contratar(Funcionario f) {
		funcionarios.add(f);
		
	}
	
	public void Demitir(Funcionario f) {
		if(funcionarios.size() >1) {
			System.out.println("Voce não tem funcionarios");
		}else {
		funcionarios.remove(f);
		}
	}
	
	
	public void aumentarSal(Funcionario f, Double aumento) {
		f.setSalario(f.getSalario() + aumento);
	}
	
	public void diminuirSal(Funcionario f, Double reducao) {
		if(reducao < 1) {
			System.out.println("Reducao de salario invalida !!");
		}else {
			f.setSalario(f.getSalario() - reducao);
		}
	}
	
	public void todosFuncionarios() {
		if(funcionarios.size() < 1) {
			System.out.println("Não há funcionarios na lista");
		}else {
			for(Funcionario x : funcionarios) {
				System.out.println("Nome: "+x.getNome()+";	ID: "+x.getID());
			}
		}
	}
	
}
