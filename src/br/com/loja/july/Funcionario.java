package br.com.loja.july;

import java.util.Random;

public class Funcionario extends Pessoa{

	private Double salario;
	private int id;
	
	public Funcionario() {
		Random gerador = new Random();
		
		for (int i = 0; i < 1; i++) {
			setID(gerador.nextInt(9999));
         }
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer getID() {
		return id;
	}
	public void setID(Integer iD) {
		id = iD;
	}
	
	

}
