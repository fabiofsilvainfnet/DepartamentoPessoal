package br.edu.infnet;

public class FuncionarioAutonomo extends Funcionario {
	
	private double valorEmpreitada;

	public double getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(double valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorEmpreitada;
	}
}
