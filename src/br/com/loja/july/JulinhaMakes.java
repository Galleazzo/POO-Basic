package br.com.loja.july;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class JulinhaMakes implements JulinhaMakesInterface{

	private static List<Funcionario> funcionarios = new ArrayList<>();
	private Map<Integer, Funcionario> idFuncionario = new HashMap<>();
	
	@Override
	public void Contratar(Funcionario f) {
		funcionarios.add(f);
		idFuncionario.put(f.getID(), f);
	}
	
	@Override
	public void Demitir(Funcionario f) {
		if(funcionarios.size() >1) {
			System.out.println("Voce não tem funcionarios");
		}else {
		funcionarios.remove(f);
		}
	}
	
	@Override
	public void aumentarSal(Funcionario f, Double aumento) {
		f.setSalario(f.getSalario() + aumento);
	}
	
	@Override
	public void diminuirSal(Funcionario f, Double reducao) {
		if(reducao < 1) {
			System.out.println("Reducao de salario invalida !!");
		}else {
			f.setSalario(f.getSalario() - reducao);
		}
	}
	
	@Override
	public void todosFuncionarios() {
		if(funcionarios.size() < 1) {
			System.out.println("Não há funcionarios na lista");
		}else {
			funcionarios.forEach(fun ->{
				System.out.println("Nome: "+fun.getNome()+"; 	ID:"+fun.getID());
			});
		}
	}
	
	
	public Funcionario buscaPorId(int i) {
		if(!idFuncionario.containsKey(i)) 
			throw new NoSuchElementException();
			return idFuncionario.get(i);
		
		
	}
	
}
