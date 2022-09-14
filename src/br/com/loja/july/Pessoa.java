package br.com.loja.july;

public abstract class Pessoa {

	private String nome;
	private Integer idade;
	private String email;
	private Double saldo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public void mostrarSaldo() {
		System.out.println("Voce tem R$"+getSaldo());
	}
	
	
	
	
}
