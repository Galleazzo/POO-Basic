package br.com.loja.july;

public interface JulinhaMakesInterface  {
	
	public void Contratar(Funcionario f);

	void Demitir(Funcionario f);

	void aumentarSal(Funcionario f, Double aumento);

	void diminuirSal(Funcionario f, Double reducao);

	void todosFuncionarios();
	
	

}
