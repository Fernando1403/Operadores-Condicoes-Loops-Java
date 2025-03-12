package br.com.aula1103;

import java.util.Iterator;

public class Exercicios {
	
	public static void main(String[] args) {
		
		//Ex 1 - IMC
		
		CalculoImc calculoimc = new CalculoImc();
		System.out.println("Seu imc é: " + calculoimc.calculo(90, 1.86));
		
		// Ex 2 - Comparação de numero
		
		ComparadorNumeros comparador = new ComparadorNumeros();
		comparador.compare(5, 5);
		
		// Ex 3 - Maioridade
		
		VerificaIdade verifica = new VerificaIdade();		
		System.out.println(verifica.verificador(19));
		
		// Dia da semana
		
		DiaDaSemana diaDaSemana = new DiaDaSemana();
		
		System.out.println(diaDaSemana.checarDiaSemana(1));
		
		// Loop
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Teste " + i);
		}
		
		//loop infinito
//		for (;;) {
//			System.out.println("Testee");
//		}
		
		boolean blnTest = true;
		int indice = 0;
		
		while(blnTest) {
			
			System.out.println("Valor do indice: " + indice);
			
			if(indice == 10) {
				blnTest = false;
			}
			
			indice++;
		}
		
		int numeroTeste = 1;
		
		do {
			System.out.println(numeroTeste);
			numeroTeste++;
			
		} while(numeroTeste < 3);
	}

}
