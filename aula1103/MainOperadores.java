package br.com.aula1103;

public class MainOperadores {
	
	public static void main(String[] args) {
		
		int soma = 10 + 5;
		int sub = 10 - 5;
		int mult = 10 * 5;
		int div = 10 / 5;
		int mod = 10 % 5;
		
		System.out.println("A soma é " + soma);
		System.out.println("A sub é " + sub);
		System.out.println("A mult é " + mult);
		System.out.println("A div é " + div);
		System.out.println("O mod é " + mod);
		
		System.out.println(soma == div);
		
		int a = 10;
		int b = 20;
		
		if (a > 2 && b < 21) {
			System.out.println("Imprima alguma coisa");
		}
		
		if (a > 2 || b < 18) {
			System.out.println("Imprima alguma coisa");
		}
		
		a += 5;
		
		System.out.println(a);
		
		
		System.out.println("If ternário " + (a <= 2 ? 10 : 5));
		
	}

}
