package br.com.loja.july;

public class Test {

	public static void main(String[] args) {
	
		JulinhaMakes j1 = new JulinhaMakes();
		Vendedor v1 = new Vendedor("Carlos" , 25);
		Vendedor v2 = new Vendedor("Julia" , 19);
		Cliente c1 = new Cliente();
		c1.setNome("Paulo");
		c1.setSaldo(1000.00);
		v1.setID(123);
		v2.setID(246);
		
		j1.Contratar(v1);
		j1.Contratar(v2);
		j1.aumentarSal(v1, 200.00);
		j1.diminuirSal(v2, 100.00);
		j1.todosFuncionarios();
		
		Funcionario funcionario = j1.buscaPorId(1243);
		
		System.out.println(funcionario);
		
		
		c1.comprar(200.00); 
		c1.mostrarSaldo();
	
	}
	
}
