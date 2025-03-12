package br.com.aula1103;

public class ComparadorNumeros {
	
	public void compare(int a, int b) {
//		System.out.println(a + " maior que " + b + " - " + (a > b));
//		System.out.println(a + " menor que " + b + " - " + (a < b));
//		System.out.println(a + " igual a " + b + " - " + (a == b));
		
		if (a < b) {
			System.out.println(a + " A maior que B " + b);
		}
		else if (a > b) {
			System.out.println(a + " A maior que B " + b);
		}
		else {
			System.out.println("Os numeros sao iguais");
		}
	}

}
