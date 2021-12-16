package br.edu.infnet;

public class FuncionarioPJ extends Funcionario {

	private double valorHora;

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularSalario() {
		return 100 * this.valorHora;
	}
	
	public double calcularSalario(int qtdHoras) {
		return qtdHoras * this.valorHora; 
	}
	
	public double calcularSalario(double qtdHoras) {
		return qtdHoras * this.valorHora; 
	}
	
	public double calcularSalario(double qtdHoras, double valorHora) {
		return qtdHoras  * valorHora;
	}
	
}
