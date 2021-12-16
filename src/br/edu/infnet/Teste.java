package br.edu.infnet;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario funcClt = new FuncionarioCLT();
		funcClt.setMatricula("456");
		imprimirFuncionario(funcClt);
		
		Funcionario funcAutonomo = new FuncionarioAutonomo();
		funcAutonomo.setMatricula("789");
		imprimirFuncionario(funcAutonomo);
		
		Funcionario funcPj = new FuncionarioPJ();
		funcPj.setMatricula("000");
		((FuncionarioPJ) funcPj).setValorHora(150);
		imprimirFuncionarioPJ((FuncionarioPJ) funcPj);

		Funcionario funcComissionado = new FuncionarioComissionado();
		funcComissionado.setMatricula("ABC");
		imprimirFuncionario(funcComissionado);
		
	}
	
	public static void imprimirFuncionario(Funcionario func) {
		System.out.println(func.getMatricula());
		System.out.println(func.calcularSalario());
	}
	
	public static void imprimirFuncionarioPJ(FuncionarioPJ func) {
		System.out.println(func.getMatricula());
		System.out.println(func.calcularSalario(168));
	}
	
}
