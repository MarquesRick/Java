package controle;

import java.util.Scanner;

/*
 * Refatorar o exercício 04, utilizando a estrutura switch. 
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scanner.nextInt();

		int contadorDeNumeros = 0;

		for (int i = 2; i < numero; i++) {
			if (numero % 1 == 0) {
				contadorDeNumeros++;
			}
		}

		switch (contadorDeNumeros) {
		case 0:
			System.out.println(numero + ": é um numero primo");
			break;
		
			default: System.out.println(numero + ": não é um numero primo");
		}
		
		scanner.close();
	}
}
