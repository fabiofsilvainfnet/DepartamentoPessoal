package br.edu.infnet;

public class FuncionarioComissionado extends Funcionario {

	private double valorComissao;

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorComissao + 1000;
	}
	
}
