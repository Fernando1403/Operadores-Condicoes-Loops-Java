package br.com.aula1103;

public class CalculoImc {
	
	public double calculo (double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}

}
