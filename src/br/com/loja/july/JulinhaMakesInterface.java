package br.com.loja.july;

public interface JulinhaMakesInterface  {
	
	public void Contratar(Funcionario f);

	public void Demitir(Funcionario f);

	public void aumentarSal(Funcionario f, Double aumento);

	public void diminuirSal(Funcionario f, Double reducao);

	public void todosFuncionarios(); 

}
